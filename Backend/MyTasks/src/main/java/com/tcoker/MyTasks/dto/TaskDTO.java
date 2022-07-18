package com.tcoker.MyTasks.dto;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.FutureOrPresent;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class TaskDTO {
	
	
	private int taskId;
	@NotNull
	@Size(max=50)
	private String taskGroup;
	@NotNull
	@Size(max=1000)
	private String taskDescription;
	@FutureOrPresent
	private LocalDate date;
	@NotNull
	@Email
	private String userEmail;
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTaskGroup() {
		return taskGroup;
	}
	public void setTaskGroup(String taskGroup) {
		this.taskGroup = taskGroup;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
}
