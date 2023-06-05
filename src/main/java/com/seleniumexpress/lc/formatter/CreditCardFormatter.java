package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lc.api.CreditCard;



public class CreditCardFormatter implements Formatter<CreditCard>{

	@Override
	public String print(CreditCard creditCard, Locale locale) {
		
		System.out.println("inside the creditCard print method");

		return creditCard.getFirstFourDigits() + " - " + creditCard.getSecondFourDigits() + " - " + 
		creditCard.getThirdFourDigits() + " - " + creditCard.getFourthFourDigits() ; 
		
	}

	@Override
	public CreditCard parse(String completeCreditCardNumber, Locale locale) throws ParseException {
		
		System.out.println("inside the creditcard parse method");
		String[] creditCardNumberArray = completeCreditCardNumber.split("-");
		
		CreditCard creditCard = new CreditCard();
		creditCard.setFirstFourDigits(Integer.valueOf(creditCardNumberArray[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(creditCardNumberArray[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(creditCardNumberArray[2]));
		creditCard.setFourthFourDigits(Integer.valueOf(creditCardNumberArray[3]));
		
		
		
		
		
		return creditCard;
	}
	
	
	

}
