package com.seleniumexpress.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.Validator.EmailValidator;
import com.seleniumexpress.lc.Validator.UserNameValidator;
import com.seleniumexpress.lc.api.CommunicationDTO;
import com.seleniumexpress.lc.api.Phone;
import com.seleniumexpress.lc.api.UserRegistrationDTO;
import com.seleniumexpress.lc.propertyeditor.NamePropertyEditor;

@Controller
public class RegistrationController {

	@Autowired
	private EmailValidator emailValidator;
	
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userReg") UserRegistrationDTO dto) {

		System.out.println("inside showRegistrationPage method");

		// load the saved data of user

		Phone phone = new Phone();
		phone.setCountryCode("91");
		phone.setUserNumber("2233445566");

		CommunicationDTO communicationDto = new CommunicationDTO();
		communicationDto.setPhone(phone);

		dto.setCommunicationDTO(communicationDto);

		return "user-registration-page";
	}

	@RequestMapping("/registeration-success")
	public String processUserReg(@Valid @ModelAttribute("userReg") UserRegistrationDTO dto, BindingResult result) {
		System.out.println("inside processUserReg method");

		//calling email validator
		emailValidator.validate(dto, result);
		if (result.hasErrors()) {

			System.out.println("my page has errors");
			List<ObjectError> allErrors = result.getAllErrors();
			for (ObjectError error : allErrors) {

				System.out.println(error);
			}

			return "user-registration-page";
		}

		return "registeration-success";
	}
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		
		System.out.println("inside initBinder");
		//binder.setDisallowedFields("name");
		StringTrimmerEditor editor = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, "name", editor);
		
		NamePropertyEditor nameEditor = new NamePropertyEditor();
		binder.registerCustomEditor(String.class,"name", nameEditor);
		
		binder.addValidators(new UserNameValidator());
		binder.addValidators(new EmailValidator());
		
	}
	
	
	
	
	
}
