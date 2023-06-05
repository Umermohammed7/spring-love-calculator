package com.seleniumexpress.lc.Validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.seleniumexpress.lc.api.UserRegistrationDTO;

public class UserNameValidator implements Validator {

	//check if the UserNameValidator supports a given object
	@Override
	public boolean supports(Class<?> clazz) {
		
		return UserRegistrationDTO.class.equals(clazz);
	}

	//we write our custom validator logic
	@Override
	public void validate(Object target, Errors errors) {
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "userName.empty", "UserName can't be empty"); 

		String userName = ((UserRegistrationDTO) target).getUserName();
		if(!userName.contains("_")) {
			
			errors.rejectValue("userName", "userName.invalidString", "must have a '_' ");
		}
	}

}
