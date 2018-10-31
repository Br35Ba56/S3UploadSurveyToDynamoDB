package com.amazonaws.lambda.demo;
import NFPBreastFeeding.Surveys.*;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.UnsupportedEncodingException;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import com.amazonaws.services.dynamodbv2.document.PutItemOutcome;
import com.amazonaws.services.dynamodbv2.document.Table;

public class LambdaFunctionHandler implements RequestHandler<S3Event, String> {
    private AmazonS3 s3 = AmazonS3ClientBuilder.standard().build();
    private BreastFeedingSurveys survey;
    public LambdaFunctionHandler() {}

    // Test purpose only.
    LambdaFunctionHandler(AmazonS3 s3) {
        this.s3 = s3;
    }

    @Override
    public String handleRequest(S3Event event, Context context) {
    	System.out.println(context.getLogGroupName());
    	
    	LambdaLogger logger = context.getLogger();
    	
        logger.log("Received event: " + event);

        String bucket = event.getRecords().get(0).getS3().getBucket().getName();
        String urlEncodedString = event.getRecords().get(0).getS3().getObject().getKey();
        String key = "";
		try {
			key = java.net.URLDecoder.decode(urlEncodedString, "UTF-8");
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
        try {

            ObjectMapper objectMapper = new ObjectMapper();
            S3Object surveyObject = s3.getObject(bucket, key);
            
            S3ObjectInputStream inputStream = surveyObject.getObjectContent();

            if (key.contains("Daily_Survey")) {
            	 survey = objectMapper.readValue(inputStream, DailySurvey.class);
            	 survey.setBucketAndKey(bucket, key);
            } else if (key.contains("Weekly_Survey")) {
            	survey = objectMapper.readValue(inputStream, WeeklySurvey.class);
            	survey.setBucketAndKey(bucket, key);
            } else if (key.contains("Onboarding")) {
            	survey = objectMapper.readValue(inputStream, OnboardingSurvey.class);
            	survey.setBucketAndKey(bucket, key);
            }
           
            DynamoDBPutObject dynamoDBPutObject = new DynamoDBPutObject(survey);
            dynamoDBPutObject.addSurveyData();
            
            return context.getLogGroupName() + " " + survey.toString();
        } catch (Exception e) {
            e.printStackTrace();
            context.getLogger().log(String.format(
                "Error getting object %s from bucket %s. Make sure they exist and"
                + " your bucket is in the same region as this function.", key, bucket));
        }
        return "Error";
    }  
  
}

class DynamoDBPutObject {
	private BreastFeedingSurveys survey;
	
	public DynamoDBPutObject(BreastFeedingSurveys survey) {
		this.survey = survey;
	}
	
	public void addSurveyData() {
		AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard().build();
		//SurveyMetaData
		DynamoDB dynamoDB = new DynamoDB(client);
		Table table = dynamoDB.getTable("NFPBreastFeedingSurveyData");
		
		PutItemOutcome outcome = table.putItem(survey.getDynamoDBItem());
		System.out.println(outcome.toString());
	}
}

