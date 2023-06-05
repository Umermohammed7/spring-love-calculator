package com.seleniumexpress.lc.controllers;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.seleniumexpress.lc.api.EmailDTO;
import com.seleniumexpress.lc.api.UserInfoDTO;
import com.seleniumexpress.lc.service.LCAppEmailService;
import com.seleniumexpress.lc.service.LCAppEmailServiceImpl;
import com.seleniumexpress.lc.service.LCAppService;

@Controller
public class EmailController {

	@Autowired
	private LCAppEmailServiceImpl lcAppEmailService;
	private Logger logger = Logger.getLogger(EmailController.class.getName());
	
	
	@RequestMapping("/sendEmail")	///{userName} @PathVariable("userName") String userName
									/*@ModelAttribute("emailDTO") EmailDTO emaildto,*/ 
	public String sendEmail( //@CookieValue("LCApp.userName") String userName,
			 Model model) {
		
		//model.addAttribute("userName", userName);
		model.addAttribute("emailDTO", new EmailDTO());
		//model.addAttribute("userName", userName.toUpperCase());
		
		
		return "send-email";	
	}
	
	@RequestMapping("/process-email")	
	public String processEmail(//@CookieValue("LCApp.userName") String userName, Model model
			@SessionAttribute("userInfo") UserInfoDTO userInfoDTO, @ModelAttribute("emailDTO") EmailDTO emailDTO) {
		
		//model.addAttribute("userName", userName);
		//model.addAttribute("emailDTO", new EmailDTO());
		try {
			lcAppEmailService.sendEmail(userInfoDTO.getUserName(), emailDTO.getUserEmail(), userInfoDTO.getResult());
		} catch(Exception e) {
			
			logger.info(">>>>>>>>>>>>>>>>>>>>>exception" + e);
		}
		
		
		
		return "process-email";	
	}
	
	/* @ModelAttribute("emaildto") EmailDTO emaildto*/
	
	
	
}
