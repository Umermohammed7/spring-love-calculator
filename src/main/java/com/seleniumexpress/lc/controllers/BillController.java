package com.seleniumexpress.lc.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.seleniumexpress.lc.api.Bill;
import com.seleniumexpress.lc.api.UserRegistrationDTO;

@Controller
public class BillController {

	
	@RequestMapping("/bill")
	public String showBillPage(@ModelAttribute("userBill") Bill bill) {
		System.out.println("inside showBill method");
		
		
		
		return "bill";
	}
	
	
	
	@RequestMapping("/bill-success")
	public String processUserBill(@ModelAttribute("userBill") Bill bill) {
		System.out.println("inside processUserBill method");
		
		
		
		return "bill-success";
	}
	
	
	
	
	
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		CustomDateEditor customDateEditor = new CustomDateEditor(dateFormat, true);
		binder.registerCustomEditor(Date.class,"date", customDateEditor);
	}
	
	
	
	
	
	
	
	
}
