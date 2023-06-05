package com.seleniumexpress.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.seleniumexpress.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone> {

	@Override
	public String print(Phone phone, Locale locale) {

		System.out.println("inside the print method");

		return phone.getCountryCode() + " - " + phone.getUserNumber();
	}

	@Override
	public Phone parse(String completePhoneNumber, Locale locale) throws ParseException {

		System.out.println("inside the parse method");
		String[] phoneNumberArray = completePhoneNumber.split("-");
		// test if there is a - if not then 91- by default
		Phone phone = new Phone();
		int index = completePhoneNumber.indexOf("-");
		
		if ( index == -1 ) {    // pas de - dans le phone
			System.out.println("inside index if");
			phone.setCountryCode("91");
			phone.setUserNumber(phoneNumberArray[0]);
			
			return phone;
		} //else {

			// split the string received from the user
			// extract countrynumber and set it to the ^hone class countryCodeProperty
			
			if(index == 0) { //  il y a pas country num mais y a user num 
				System.out.println("on est là");
				phone.setCountryCode("92");
				phone.setUserNumber(phoneNumberArray[1]); 
				
				return phone;
			}
				
				phone.setCountryCode(phoneNumberArray[0]);
				phone.setUserNumber(phoneNumberArray[1]);
			
				if (phoneNumberArray[0] == "") System.out.println("true");
				if (phoneNumberArray[0] != "") System.out.println("false");
				System.out.println(phoneNumberArray[0]);
			
		//}

		return phone;
	}

}
