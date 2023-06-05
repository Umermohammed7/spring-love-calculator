package com.seleniumexpress.lc.Validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lc.api.UserRegistrationDTO;

@Component
public class EmailValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return UserRegistrationDTO.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "communicationDTO.email", "email.empty");

		String email = ((UserRegistrationDTO) target).getCommunicationDTO().getEmail();
		if(email.endsWith("@seleniumexpress.com")) {
			
			errors.rejectValue("communicationDTO.email", "email.invalidDomain");
		}
	}

}
