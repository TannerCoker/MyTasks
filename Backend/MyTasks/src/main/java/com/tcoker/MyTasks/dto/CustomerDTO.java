package com.tcoker.MyTasks.dto;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CustomerDTO {
	
	@NotNull //add missing email message
	@Pattern(regexp = "[A-Za-z0-9._]+@[A-Za-z]{2,}\\.[A-Za-z][A-Za-z.]+") //add wrong pattern message
	private String emailId;
	private String name;
	private String password;
	private String newPassword;
	private String phoneNumber;
	private List<TaskDTO> myTasks;
	
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public List<TaskDTO> getMyTasks() {
		return myTasks;
	}
	public void setMyTasks(List<TaskDTO> myTasks) {
		this.myTasks = myTasks;
	}
}
