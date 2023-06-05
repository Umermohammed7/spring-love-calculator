package com.seleniumexpress.lc.api;

public class Phone {

	
	private String countryCode;

	private String userNumber;
	
	
	@Override
	public String toString() {
		return getCountryCode() + " - " + getUserNumber();
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getUserNumber() {
		return userNumber;
	}
	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}
	
	
}
