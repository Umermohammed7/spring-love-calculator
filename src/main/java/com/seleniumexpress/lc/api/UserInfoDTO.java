package com.seleniumexpress.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {

	@NotBlank(message = " * Your name can't be blank")
	//@Min(value = 3, message = "* Your name should have at least 3 chars")
	@Size(min = 3, max = 15, message = "* Your name should have at least 3 chars and should not have more than 15 chars" )
	private String userName ;
	
	@NotBlank(message = " * Your crush name can't be blank")
	@Size(min = 3, max = 15, message = "* Your crush name should have at least 3 chars and should not have more than 15 chars" )
	private String crushName ;
	
	@AssertTrue(message= "* You have to agree to use the app")
	private boolean termAndCondition;
	
	private String result;
	
	private String feedback;
	
	
	
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public boolean isTermAndCondition() {
		return termAndCondition;
	}
	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	@Override
	public String toString() {
		return "UserInfoDTO [userName=" + userName + ", crushName=" + crushName + "]";
	}
}
