package com.tcoker.MyTasks.service;

import java.util.List;

import com.tcoker.MyTasks.dto.TaskDTO;
import com.tcoker.MyTasks.exceptions.TaskException;

public interface TaskService {
	
	TaskDTO getTask(int taskId) throws Exception;
	List<TaskDTO> getTasks(String userEmailId) throws Exception;
	Integer addTask(TaskDTO dto) throws Exception;
	Boolean updateTask(TaskDTO dto) throws Exception;
	Integer deleteTask(int taskId) throws Exception;
}
