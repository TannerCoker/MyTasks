package com.tcoker.MyTasks.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Tasks")
public class Task {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="TASK_ID")
	private int taskId;
	@Column(name="TASK_GROUP")
	private String taskGroup;
	@Column(name="TASK")
	private String taskDescription;
	@Column(name="DATE")
	private LocalDate date;
	
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
