package com.seleniumexpress.lc.controllers;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.seleniumexpress.lc.api.EmailDTO;
import com.seleniumexpress.lc.api.UserInfoDTO;
import com.seleniumexpress.lc.service.LCAppEmailServiceImpl;

@Controller
public class FeedbackController {

	@Autowired
	private LCAppEmailServiceImpl lcAppEmailService;
	private Logger logger = Logger.getLogger(EmailController.class.getName());
	
	@RequestMapping("/feedback")
	// @PostMapping("/feedback")
	public String sendFeedback(//@RequestParam("feedback") String feedback,
			@SessionAttribute("userInfo") UserInfoDTO userInfoDTO, 
			@ModelAttribute("emailDTO") EmailDTO emailDTO) {
		try {
			
		//userInfoDTO.setFeedback(feedback);
		lcAppEmailService.sendFeedback(userInfoDTO.getUserName(), userInfoDTO.getFeedback()); //emailDTO.getFeedback()
		lcAppEmailService.sendResponseFeedback(userInfoDTO.getUserName(),emailDTO.getUserEmail() );
		} catch(Exception e) {
			
			logger.info(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" + e);
		}
		
		return "feedback";
		
	}
	
	@RequestMapping("/success-feedback")
	public String successFeedback() {
		
		return "success-feedback";
	}
	
}
