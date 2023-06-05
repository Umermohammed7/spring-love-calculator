package com.seleniumexpress.lc.Validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import com.seleniumexpress.lc.api.Phone;

public class PhonegoValidator implements ConstraintValidator<Phonego, Phone> {

	private int limit;

	@Override
	public boolean isValid(Phone completePhoneNumber, ConstraintValidatorContext context) {

		System.out.println("dans l'interface phonego");
		String phoneCountry = completePhoneNumber.getCountryCode();
		String phoneUserNum = completePhoneNumber.getUserNumber();
	/*	if (completePhoneNumber == null)
			return false; */
		if (phoneCountry.length() + phoneUserNum.length() < limit ||
				phoneCountry.length() + phoneUserNum.length() > limit)
			return false;
		// completePhoneNumber
		char[] tableauDeCaracteres = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p',
				'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

		for (char c : tableauDeCaracteres) {
			if (phoneCountry.contains(String.valueOf(c)) || phoneUserNum.contains(String.valueOf(c)) ) {
				return false;
			}
		}

		return true;
	}

}
