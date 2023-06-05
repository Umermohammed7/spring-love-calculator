package com.seleniumexpress.lc.service;

public interface LCAppEmailService {

	
	
	
	public void sendEmail(String userName, String userEmail, String result);
	public void sendResponseFeedback(String userName, String userEmail);
	public void sendFeedback(String userName, String feedback);
	
}
