package com.tcoker.MyTasks.service;

import java.util.List;

import com.tcoker.MyTasks.dto.TaskDTO;

public interface TaskService {
	
	TaskDTO getTask(int taskId);
	List<TaskDTO> getTasks(String userEmailId);
	Integer addTask(TaskDTO dto);
	Boolean updateTask(TaskDTO dto);
	Integer deleteTask(int taskId);
}
