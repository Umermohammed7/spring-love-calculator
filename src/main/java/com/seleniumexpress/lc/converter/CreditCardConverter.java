package com.seleniumexpress.lc.converter;

import org.springframework.core.convert.converter.Converter;

import com.seleniumexpress.lc.api.CreditCard;

public class CreditCardConverter implements Converter<String, CreditCard>{

	@Override
	public CreditCard convert(String source) {
		
		String[] creditCardNumberArray = source.split("-");
		
		CreditCard creditCard = new CreditCard();
		creditCard.setFirstFourDigits(Integer.valueOf(creditCardNumberArray[0]));
		creditCard.setSecondFourDigits(Integer.valueOf(creditCardNumberArray[1]));
		creditCard.setThirdFourDigits(Integer.valueOf(creditCardNumberArray[2]));
		creditCard.setFourthFourDigits(Integer.valueOf(creditCardNumberArray[3]));
		
		return creditCard;
	}

}
