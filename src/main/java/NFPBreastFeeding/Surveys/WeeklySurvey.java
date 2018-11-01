package NFPBreastFeeding.Surveys;

import com.amazonaws.services.dynamodbv2.document.Item;

public class WeeklySurvey implements BreastFeedingSurveys {

	private String userName;
	private String date;
	private String bucket;
	private String key;
	private String surveyType;
	private String areYouPregnantStepID;
	private String usedAnyContraceptivesStepID;
	private String recentlyDiagnosedStepID;
	private String stillBreastfeedingStepID;
	
	private String didMenstruateThisWeekStepID;
	
	public Item getDynamoDBItem() {
		return new Item().with("UserName", userName)
				.with("Date", date)
				.with("Bucket", bucket)
				.with("S3Key", key)
				.with("SurveyType", surveyType)
				.with("areYouPregnant", areYouPregnantStepID)
				.with("usedAnyContraceptives", usedAnyContraceptivesStepID)
				.with("recentlyDiagnosed", recentlyDiagnosedStepID)
				.with("stillBreastfeeding", stillBreastfeedingStepID);
	}

	public void setBucketAndKey(String bucket, String key) {
		this.bucket = bucket;
		this.key = key;	
	}
	
	public void setUserName(String userName) {
		this.userName = String.valueOf(userName.hashCode());;	
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
	
	public String getAreYouPregnantStepID() {
		return areYouPregnantStepID;
	}
	
	public void setAreYouPregnantStepID(String areYouPregnantStepID) {
		this.areYouPregnantStepID = areYouPregnantStepID;
	}
	
	public String getUsedAnyContraceptivesStepID() {
		return usedAnyContraceptivesStepID;
	}
	
	public void setUsedAnyContraceptivesStepID(String usedAnyContraceptivesStepID) {
		this.usedAnyContraceptivesStepID = usedAnyContraceptivesStepID;
	}
	
	public String getRecentlyDiagnosedStepID() {
		return recentlyDiagnosedStepID;
	}
	
	public void setRecentlyDiagnosedStepID(String recentlyDiagnosedStepID) {
		this.recentlyDiagnosedStepID = recentlyDiagnosedStepID;
	}
	
	public String getStillBreastfeedingStepID() {
		return stillBreastfeedingStepID;
	}
	
	public void setStillBreastfeedingStepID(String stillBreastfeedingStepID) {
		this.stillBreastfeedingStepID = stillBreastfeedingStepID;
	}
	
	public String getDidMenstruateThisWeekStepID() {
		return didMenstruateThisWeekStepID;
	}
	
	public void setDidMenstruateThisWeekStepID(String didMenstruateThisWeekStepID) {
		this.didMenstruateThisWeekStepID = didMenstruateThisWeekStepID;
	}
	
	@Override
	public String toString() {
		return "User Name: " + userName + 
				" Date: " + date + 
				" Survey Type: " + surveyType + 
				" areYouPregnantStepID: " + areYouPregnantStepID + 
				" usedAnyContraceptivesStepID: " + usedAnyContraceptivesStepID + 
				" recentlDiagnosedStepID : " + recentlyDiagnosedStepID + 
				" stillBreastfeedingStepID: "+ stillBreastfeedingStepID +
				" didMenstruateThisWeekStepID: " + didMenstruateThisWeekStepID;	
	}
}