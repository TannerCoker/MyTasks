package com.tcoker.MyTasks.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@Column(name="EMAIL_ID")
	private String email;
	@Column(name="NAME")
	private String name;
	@Column(name="PASSWORD")
	private String password;
	private String newPassword;
	@Column(name="PHONENUMBER")
	private String phoneNumber;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="CUST_ID")
	private List<Task> myTasks;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public List<Task> getMyTasks() {
		return myTasks;
	}
	public void setMyTasks(List<Task> myTasks) {
		this.myTasks = myTasks;
	}
}
