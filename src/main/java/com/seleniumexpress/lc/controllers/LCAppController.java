package com.seleniumexpress.lc.controllers;


import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.seleniumexpress.lc.api.UserInfoDTO;
import com.seleniumexpress.lc.service.LCAppService;

@Controller
@SessionAttributes({"userInfo"})
public class LCAppController {

	@Autowired
	private LCAppService lcappservice;
	
	@RequestMapping("/")

	public String showHomePage(Model model//@ModelAttribute ("userInfo") UserInfoDTO userInfo
			//, HttpServletRequest request 
			){

		model.addAttribute("userInfo", new UserInfoDTO());
		//tout ça remplacé par écriture avec @ModelAttribute
		// lire la valeur de la propriété du dto
	/*	UserInfoDTO userInfo = new UserInfoDTO();
		model.addAttribute("userInfo", userInfo); */
	/*	Cookie[] cookies = request.getCookies();
		for (Cookie temp : cookies) {
			
			if("LCApp.userName".equals(temp.getName())) {
				
				String myUserName = temp.getValue();
				userInfo.setUserName(myUserName);
			}
		}*/
		
		
		
		return "home-page"; 
	}

	@RequestMapping("/process-homepage")

	public String showResultPage(Model model,
			@Valid  UserInfoDTO userInfoDTO,
			//@ModelAttribute ("userInfo") UserInfoDTO userInfoDTO,
			BindingResult result
			
		//	, HttpServletResponse response
		//, HttpServletRequest request	
			) {

		// écrire la valeur de la propriété en prenant de l'URL
	/*	System.out.println("user name is " + userInfoDTO.getUserName());
		System.out.println("crush name is " + userInfoDTO.getCrushName());
	*/
	//	model.addAttribute("userInfo", userInfoDTO);
		// model.addAttribute("userName", userName);
		// model.addAttribute("crushName", crushName);
		
		model.addAttribute("userInfo", userInfoDTO);
		model.addAttribute(BindingResult.MODEL_KEY_PREFIX + "userInfo", result);
		
		System.out.println(userInfoDTO.isTermAndCondition());
		
		if(result.hasErrors()) {
			
			//System.out.println("my form has errors");
		List<ObjectError> allErrors = result.getAllErrors();
			
		for(ObjectError temp : allErrors) {
			
			System.out.println(temp);
		}
			return "home-page";
		}

		//create a cookie for userName
		
	//	Cookie theCookie = new Cookie("LCApp.userName", userInfoDTO.getUserName());
	//	theCookie.setMaxAge(60*60*24);
		
		// add the cookie to the response
	//	response.addCookie(theCookie);
		
		//same as cookie but with session
		
	/*	HttpSession session = request.getSession();
		session.setAttribute("userName", userInfoDTO.getUserName());
	*/	
			
		
		//write logic for the calculation
		
		String appResult = lcappservice.calculateLove(userInfoDTO.getUserName(), userInfoDTO.getCrushName());
	//	model.addAttribute("result", appResult);
		userInfoDTO.setResult(appResult);
		
		return "result-page";
	}
}
