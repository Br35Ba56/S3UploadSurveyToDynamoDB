package NFPBreastFeeding.Surveys;

import com.amazonaws.services.dynamodbv2.document.Item;

public interface BreastFeedingSurveys {
	Item getDynamoDBItem();
	void setUserName(String userName);
	String getUserName();
	void setDate(String date);
	String getDate();
	void setSurveyType(String surveyType);
	String getSurveyType();
	void setBucketAndKey(String bucket, String key);
	
}

