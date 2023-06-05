package com.seleniumexpress.lc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:email.properties")
public class LCAppEmailServiceImpl implements LCAppEmailService {

	@Autowired
	private JavaMailSender javaMailsenderImpl;
	@Autowired
	private Environment env;
	
	@Override
	public void sendEmail(String userName, String userEmail, String result) {
		
		SimpleMailMessage newEmail = new SimpleMailMessage();
		
		newEmail.setTo(userEmail);
		newEmail.setSubject("Love Calculator Application Result");
		newEmail.setText("Hi " + userName + "\n The result estimated by the LCApp is " + result);
		
		javaMailsenderImpl.send(newEmail);

	}

	@Override
	public void sendResponseFeedback(String userName, String userEmail) {

		SimpleMailMessage newEmail = new SimpleMailMessage();

		newEmail.setTo(userEmail);
		newEmail.setSubject("Thanks for your Feedback!");
		newEmail.setText("Hi " + userName + "\n Thanks for your feedback ! \n We will review your feedback! ");

		javaMailsenderImpl.send(newEmail);

	}

	@Override
	public void sendFeedback(String userName, String feedback) {
		
		SimpleMailMessage newEmail = new SimpleMailMessage();

		newEmail.setTo(env.getProperty("mail.username"));
		newEmail.setSubject("Feedback from " + userName +" !");
		newEmail.setText(feedback + "\n Signed : " + userName);

		javaMailsenderImpl.send(newEmail);
		
	}

}
