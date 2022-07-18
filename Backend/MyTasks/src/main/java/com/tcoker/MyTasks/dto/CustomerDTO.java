package com.tcoker.MyTasks.dto;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class CustomerDTO {
	
	@NotNull //add missing email message
	@Email//(regexp = "[A-Za-z0-9._]+@[A-Za-z]{2,}\\.[A-Za-z][A-Za-z.]+") //add wrong pattern message
	@Size(max=50)
	private String emailId;
	@NotNull //add missing name message
	@Pattern(regexp = "([A-Za-z])+(\\s[A-Za-z]+)*") //name pattern wrong
	@Size(max=50)
	private String name;
	@NotNull //missing password
	@Pattern(regexp = ".*[A-Z]+.*") //add invalid messages
	@Pattern(regexp = ".*[a-z]+.*")
	@Pattern(regexp = ".*[0-9]+.*")
	@Pattern(regexp = ".*[^A-Za-z0-9].*")
	@Size(max=70)
	private String password;
	private String newPassword;
	@NotNull
	@Size(max=10)
	@Pattern(regexp = "[0-9]+") //bad number message
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
