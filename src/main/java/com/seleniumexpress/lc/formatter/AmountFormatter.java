package com.seleniumexpress.lc.formatter;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lc.api.Amount;



public class AmountFormatter implements Formatter<Amount>{

	@Override
	public String print(Amount amount, Locale locale) {
		
		return amount.getBillAmount() + " "  + DecimalFormat.getCurrencyInstance(Locale.FRANCE).format(amount.getLocaleDefinition()) ; //+ locale.
	}

	@Override
	public Amount parse(String completeAmount, Locale locale) throws ParseException {
		
		System.out.println("inside the amount parse  method");
		String [] amountNumberArray =  completeAmount.split(" ");
		// test if there is a - if not then 91- by default
		Amount amount = new Amount();
		amount.setBillAmount(amountNumberArray[0]);
		amount.setLocaleDefinition(amountNumberArray[1]);
		
		
		
		
		return amount;
	}

}
