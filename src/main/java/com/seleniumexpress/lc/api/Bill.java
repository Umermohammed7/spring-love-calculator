package com.seleniumexpress.lc.api;

import java.util.Date;

public class Bill {

	private CreditCard creditCard;
	private Amount amount;
	private Date date;
	
	
	
	
	
	@Override
	public String toString() {
		return getCreditCard().getFirstFourDigits() + "-" + getCreditCard().getSecondFourDigits() + "-" +
				getCreditCard().getThirdFourDigits() + "-" + getCreditCard().getFourthFourDigits();
	}
	public CreditCard getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}
	public Amount getAmount() {
		return amount;
	}
	public void setAmount(Amount amount) {
		this.amount = amount;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
