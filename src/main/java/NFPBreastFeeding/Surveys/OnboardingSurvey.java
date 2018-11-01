package NFPBreastFeeding.Surveys;

import com.amazonaws.services.dynamodbv2.document.Item;

public class OnboardingSurvey implements BreastFeedingSurveys {

	private String userName;
	private String date;
	private String bucket;
	private String key;
	private String surveyType;
	
	private String biologicalSexStepID;
	private String biologicalInfantStepID;
	private String singletonBirthStepID;
	private String babyFullTermStepID;
	private String participantAgeInRangeStepID;
	private String momHealthStepID;
	private String breastSurgeryStepID;
	private String infantAgeInRangeStepID;
	private String clearBlueMonitorStepID;
	private String canReadEnglishStepID;
	private String participantBirthDateStepID;
	private String babyBirthDateStepID;
	private String babyFeedOnDemandStepID;
	private String breastPumpInfoStepID;
	private String ethnicityStepID;
	private String religionStepID;
	private String levelOfEducationStepID;
	private String relationshipStatusStepID;
	private String marriedLengthStepID;
	private String howManyTimesPregnantStepID;
	private String howManyBiologicalChildrenStepID;
	private String howManyChildrenBreastFedStepID;
	private String howLongInPastBreastFedStepID;

	public Item getDynamoDBItem() {
		return new Item().with("UserName", userName)
				.with("Date", date)
				.with("SurveyType", surveyType)
				.with("Bucket", bucket)
				.with("S3Key", key)
				.with("biologicalSex", biologicalSexStepID)
				.with("biologialInfant", biologicalInfantStepID)
				.with("singletonBirth", singletonBirthStepID)
				.with("babyFullTerm", babyFullTermStepID)
				.with("particpantAgeInRange", participantAgeInRangeStepID)
				.with("momHealth", momHealthStepID)
				.with("breastSurgery", breastSurgeryStepID)
				.with("infantAgeInRange", infantAgeInRangeStepID)
				.with("ownClearBlueMonitor", clearBlueMonitorStepID)
				.with("canReadEnglish", canReadEnglishStepID)
				.with("participantBirthDate", participantBirthDateStepID)
				.with("babyBirthDate", babyBirthDateStepID)
				.with("babyFeedOnDemand", babyFeedOnDemandStepID)
				.with("breastPumpInfo", breastPumpInfoStepID)
				.with("ethnicityStepID", ethnicityStepID)
				.with("religion", religionStepID)
				.with("levelOfEducation", levelOfEducationStepID)
				.with("relationshipStatus", relationshipStatusStepID)
				.with("marriedLength", marriedLengthStepID)
				.with("howManyTimesPregnant", howManyTimesPregnantStepID)
				.with("howManyBiologicalChildren", howManyBiologicalChildrenStepID)
				.with("howManyChildrenBreastFed", howManyChildrenBreastFedStepID)
				.with("howLongInPastBreastFed", howLongInPastBreastFedStepID);
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
	
	public void setBiologicalSexStepID(String biologicalSexStepID) {
		this.biologicalSexStepID = biologicalSexStepID;
	}
	
	public String getBiologicalSexStepID() {
		return biologicalSexStepID;
	}
	
	public void setBiologicalInfantStepID(String biologicalInfantStepID) {
		this.biologicalInfantStepID = biologicalInfantStepID;
	}
	
	public String getBiologicalInfantStepID() {
		return biologicalInfantStepID;
	}
	
	public void setSingletonBirthStepID(String singletonBirthStepID) {
		this.singletonBirthStepID = singletonBirthStepID;
	}
	
	public String getSingletonBirthStepID() {
		return singletonBirthStepID;
	}
	
	public void setBabyFullTermStepID(String babyFullTermStepID) {
		this.babyFullTermStepID = babyFullTermStepID;
	}
	
	public String getBabyBornFullTermStepID() {
		return babyFullTermStepID;
	}
	
	public String getParticipantAgeInRangeStepID() {
		return participantAgeInRangeStepID;
	}
	
	public void setParticipantAgeInRangeStepID(String participantAgeInRangeStepID) {
		this.participantAgeInRangeStepID = participantAgeInRangeStepID;
	}
	
	public String getMomHealthStepID() {
		return momHealthStepID;
	}
	
	public void setMomHealthStepID(String momHealthStepID) {
		this.momHealthStepID = momHealthStepID;
	}
	
	public String getBreastSurgeryStepID() {
		return breastSurgeryStepID;
	}
	
	public void setBreastSurgeryStepID(String breastSurgeryStepID) {
		this.breastSurgeryStepID = breastSurgeryStepID;
	}
	
	public String getInfantAgeInRangeStepID() {
		return infantAgeInRangeStepID;
	}
	
	public void setInfantAgeInRangeStepID(String infantAgeInRangeStepID) {
		this.infantAgeInRangeStepID = infantAgeInRangeStepID;
	}
	
	public String getClearBlueMonitorStepID() {
		return clearBlueMonitorStepID;
	}
	
	public void setClearBlueMonitorStepID(String clearBlueMonitorStepID) {
		this.clearBlueMonitorStepID = clearBlueMonitorStepID;
	}
	
	public String getCanReadEnglishStepID() {
		return canReadEnglishStepID;
	}
	
	public void setCanReadEnglishStepID(String canReadEnglishStepID) {
		this.canReadEnglishStepID = canReadEnglishStepID;
	}
	
	public String getParticipantBirthDateStepID() {
		return participantBirthDateStepID;
	}
	
	public void setParticipantBirthDateStepID(String participantBirthDateStepID) {
		this.participantBirthDateStepID = participantBirthDateStepID;
	}
	
	public String getBabyFeedOnDemandStepID() {
		return babyFeedOnDemandStepID;
	}
	
	public void setBabyFeedOnDemandStepID(String babyFeedOnDemandStepID) {
		this.babyFeedOnDemandStepID = babyFeedOnDemandStepID;
	}
	
	public String getBabyBirthDateStepID() {
		return babyBirthDateStepID;
	}
	
	public void setBabyBirthDateStepID(String babyBirthDateStepID) {
		this.babyBirthDateStepID = babyBirthDateStepID;
	}
	
	public String getBreastPumpInfoStepID() {
		return breastPumpInfoStepID;
	}
	
	public void setBreastPumpInfoStepID(String breastPumpInfoStepID) {
		this.breastPumpInfoStepID = breastPumpInfoStepID;
	}
	
	public String getEthnicityStepID() {
		return ethnicityStepID;
	}
	
	public void setEthnicityStepID(String ethnicityStepID) {
		this.ethnicityStepID = ethnicityStepID;
	}
	
	public String getReligionStepID() {
		return religionStepID;
	}
	
	public void setReligionStepID(String religionStepID) {
		this.religionStepID = religionStepID;
	}
	
	public String getLevelOfEducationStepID() {
		return levelOfEducationStepID;
	}
	
	public void setLevelOfEducationStepID(String levelOfEducationStepID) {
		this.levelOfEducationStepID = levelOfEducationStepID;
	}
	
	public String getRelationshipStatusStepID() {
		return relationshipStatusStepID;
	}
	
	public void setRelationshipStatusStepID(String relationshipStatusStepID) {
		this.relationshipStatusStepID = relationshipStatusStepID;
	}
	
	public String getMarriedLengthStepID() {
		return marriedLengthStepID;
	}
	
	public void setMarriedLengthStepID(String marriedLengthStepID) {
		this.marriedLengthStepID = marriedLengthStepID;
	}
	
	public String getHowManyBiologicalChildrenStepID() {
		return howManyBiologicalChildrenStepID;
	}
	
	public void setHowManyBiologicalChildrenStepID(String howManyBiologicalChildrenStepID) {
		this.howManyBiologicalChildrenStepID = howManyBiologicalChildrenStepID;
	}
	
	public String getHowManyTimesPregnantStepID() {
		return howManyTimesPregnantStepID;
	}
	
	public void setHowManyTimesPregnantStepID(String howManyTimesPregantStepID) {
		this.howManyTimesPregnantStepID = howManyTimesPregantStepID;
	}
	
	public String getHowManyChildrenBreastFedStepID() {
		return howManyChildrenBreastFedStepID;
	}
	
	public void setHowManyChildrenBreastFedStepID(String howManyChildrenBreastFedStepID) {
		this.howManyChildrenBreastFedStepID = howManyChildrenBreastFedStepID;
	}
	
	public String getHowLongInPastBreastFedStepID() {
		return howLongInPastBreastFedStepID;
	}
	
	public void setHowLongInPastBreastFedStepID(String howLongInPastBreastFedStepID) {
		this.howLongInPastBreastFedStepID = howLongInPastBreastFedStepID;
	}
	
	@Override
	public String toString() {
		return "User Name: " + userName +
				" date: " + date +
				" surveyType: " + surveyType +
				" biologicalSexStepID: " + biologicalSexStepID +
				" biologicalInfantStepID: " + biologicalInfantStepID +
				" singletonBirthStepID: " + singletonBirthStepID +
				" babyFullTermStepID: " + babyFullTermStepID +
				" participantAgeInRangeStepID: " + participantAgeInRangeStepID +
				" momHealthStepID: " + momHealthStepID +
				" breastSurgeryStepID: " + breastSurgeryStepID +
				" infantAgeInRangeStepID: " + infantAgeInRangeStepID +
				" clearBlueMonitorStepID: " + clearBlueMonitorStepID +
				" canReadEnglishStepID: " + canReadEnglishStepID +
				" participantBirthDateStepID: " + participantBirthDateStepID +
				" babysBirthDateStepID: " + babyBirthDateStepID +
				" babyFeedOnDemandStepID: " + babyFeedOnDemandStepID +
				" breastPumpInfoStepID: " + breastPumpInfoStepID +
				" ethnicityStepID: " + ethnicityStepID +
				" religionStepID: " + religionStepID +
				" levelOfEducationStepID: " + levelOfEducationStepID +
				" relationshipStatusStepID: " + relationshipStatusStepID + 
				" marriedLengthStepID: " + marriedLengthStepID +
				" howManyTimesPregantStepID: " + howManyTimesPregnantStepID +
				" howManyBiologicalChildrenStepID: " + howManyBiologicalChildrenStepID +
				" howManyChildrenBreastFedStepID: " + howManyChildrenBreastFedStepID +
				" howLongInPastBreastFedStepID: " + howLongInPastBreastFedStepID;
	}
}
