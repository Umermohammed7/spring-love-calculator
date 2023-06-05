package com.seleniumexpress.lc.api;

import javax.validation.constraints.NotEmpty;

import com.seleniumexpress.lc.Validator.Age;

public class UserRegistrationDTO {

	@NotEmpty (message = "* can't be blank")
	private String name;
	private String userName;
	private char[] password;
	private String countryName;
	
	//@Age(lower = 30, upper = 75, message = "* age should be between 30-75")
	@Age(lower = 30, upper = 100)
	private Integer age;
	private String[] hobbies;
	private String gender;
	private CommunicationDTO communicationDTO;
	
	
	
	
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobbies() {
		return hobbies;
	}
	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	
}
