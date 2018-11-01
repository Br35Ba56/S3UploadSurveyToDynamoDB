package NFPBreastFeeding.Surveys;

import com.amazonaws.services.dynamodbv2.document.Item;

public class DailySurvey implements BreastFeedingSurveys{
	private String userName;
	private String date;
	private String surveyType;
	private String bucket;
	private String S3Key;
	private String experienceBleedingStepID;
	private String clearBlueMonitorStepID;
	private String menstruationQuestionStepID;
	private String progesteroneStepID;
	private String numOfTimesBabyFormulaFedStepID;
	private String numOfTimesBabyExpressFedStepID;
	private String numOfTimesBabyBreastFedStepID;
	
	public void setBucketAndKey(String bucket, String S3Key) {
		this.bucket = bucket;
		this.S3Key = S3Key;
	}
	
	public Item getDynamoDBItem() {
		return new Item().with("UserName", userName)
				.with("Date", date)
				.with("Bucket", bucket)
				.with("S3Key", S3Key)
				.with("SurveyType", surveyType)
				.with("experienceBleeding", experienceBleedingStepID)
				.with("clearBlueMonitor", clearBlueMonitorStepID)
				.with("progesterone", progesteroneStepID)
				.with("numOfTimesBabyFormulaFed", numOfTimesBabyFormulaFedStepID)
				.with("numOfTimesBabyExpressFed", numOfTimesBabyExpressFedStepID)
				.with("numOfTimesBabyBreastFed", numOfTimesBabyBreastFedStepID);
	}
	
	public void setUserName(String userName) {
		this.userName = String.valueOf(userName.hashCode());
	}

	public String getUserName() {
		return userName;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setSurveyType(String surveyType) {
		this.surveyType = surveyType;
	}

	public String getSurveyType() {
		return surveyType;
	}

	public String getExperienceBleedingStepID() {
		return experienceBleedingStepID;
	}

	public void setExperienceBleedingStepID(String experienceBleedingStepID) {
		this.experienceBleedingStepID = experienceBleedingStepID;
	}

	public String getClearBlueMonitorStepID() {
		return clearBlueMonitorStepID;
	}

	public void setClearBlueMonitorStepID(String clearBlueMonitorStepID) {
		this.clearBlueMonitorStepID = clearBlueMonitorStepID;
	}

	public String getNumOfTimesBabyFormulaFedStepID() {
		return numOfTimesBabyFormulaFedStepID;
	}

	public void setNumOfTimesBabyFormulaFedStepID(String numOfTimesBabyFormulaFedStepID) {
		this.numOfTimesBabyFormulaFedStepID = numOfTimesBabyFormulaFedStepID;
	}

	public String getNumOfTimesBabyExpressFedStepID() {
		return numOfTimesBabyExpressFedStepID;
	}

	public void setNumOfTimesBabyExpressFedStepID(String numOfTimesBabyExpressFedStepID) {
		this.numOfTimesBabyExpressFedStepID = numOfTimesBabyExpressFedStepID;
	}

	public String getNumOfTimesBabyBreastFedStepID() {
		return numOfTimesBabyBreastFedStepID;
	}

	public void setNumOfTimesBabyBreastFedStepID(String numOfTimesBabyBreastFedStepID) {
		this.numOfTimesBabyBreastFedStepID = numOfTimesBabyBreastFedStepID;
	}

	public void setProgesteroneStepID(String progesteroneStepID) {
		this.progesteroneStepID = progesteroneStepID;
	}

	public String getProgesteroneStepID() {
		return progesteroneStepID;
	}

	public String getMenstruationQuestionStepID() {
		return menstruationQuestionStepID;
	}

	public void setMenstruationQuestionStepID(String menstruationQuestionStepID) {
		this.menstruationQuestionStepID = menstruationQuestionStepID;
	}

	@Override
	public String toString() {
		return "User Name: " + userName + " " + "Date: " + date + " " + "SurveyType: " + surveyType + " "
				+ "ExperienceBleeding: " + experienceBleedingStepID + " " + "ClearBlueMonitor: "
				+ clearBlueMonitorStepID + " " + "Progesterone: " + progesteroneStepID + " " + "Menstruation: "
				+ menstruationQuestionStepID + " " + "Formula: " + numOfTimesBabyFormulaFedStepID + " " + "Express: "
				+ numOfTimesBabyExpressFedStepID + " " + "Breast: " + numOfTimesBabyBreastFedStepID;
	}
}
