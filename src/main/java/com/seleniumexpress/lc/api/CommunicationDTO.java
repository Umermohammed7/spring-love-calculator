package com.seleniumexpress.lc.api;
import com.seleniumexpress.lc.Validator.Phonego;
//import com.seleniumexpress.lc.Validator.Phone;
import com.seleniumexpress.lc.api.Phone;
public class CommunicationDTO {

	private String email;
	
	@Phonego
	private Phone phone;

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
