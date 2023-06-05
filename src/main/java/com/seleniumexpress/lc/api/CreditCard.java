package com.seleniumexpress.lc.api;

public class CreditCard {

	private Integer firstFourDigits;
	private Integer secondFourDigits;
	private Integer thirdFourDigits;
	private Integer fourthFourDigits;
	
	
	/*private String firstFourDigits;
	private String secondFourDigits;
	private String thirdFourDigits;
	private String fourthFourDigits;

	

	public String getFirstFourDigits() {
		return firstFourDigits;
	}

	public void setFirstFourDigits(String firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}

	public String getSecondFourDigits() {
		return secondFourDigits;
	}

	public void setSecondFourDigits(String secondFourDigits) {
		this.secondFourDigits = secondFourDigits;
	}

	public String getThirdFourDigits() {
		return thirdFourDigits;
	}

	public void setThirdFourDigits(String thirdFourDigits) {
		this.thirdFourDigits = thirdFourDigits;
	}

	public String getFourthFourDigits() {
		return fourthFourDigits;
	}

	public void setFourthFourDigits(String fourthFourDigits) {
		this.fourthFourDigits = fourthFourDigits; 
	} */

	public Integer getFirstFourDigits() {
		return firstFourDigits;
	}

	public void setFirstFourDigits(Integer firstFourDigits) {
		this.firstFourDigits = firstFourDigits;
	}

	public Integer getSecondFourDigits() {
		return secondFourDigits;
	}

	public void setSecondFourDigits(Integer secondFourDigits) {
		this.secondFourDigits = secondFourDigits;
	}

	public Integer getThirdFourDigits() {
		return thirdFourDigits;
	}

	public void setThirdFourDigits(Integer thirdFourDigits) {
		this.thirdFourDigits = thirdFourDigits;
	}

	public Integer getFourthFourDigits() {
		return fourthFourDigits;
	}

	public void setFourthFourDigits(Integer fourthFourDigits) {
		this.fourthFourDigits = fourthFourDigits;
	} 
	
	
	@Override
	public String toString() {
		return   getFirstFourDigits() + "-" + getSecondFourDigits()
				+ "-" + getThirdFourDigits() + "-" + getFourthFourDigits() ;
	}
	
	
	
	
	
	
	
	
	

}
