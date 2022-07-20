package com.tcoker.MyTasks.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcoker.MyTasks.dto.TaskDTO;
import com.tcoker.MyTasks.dto.UserDTO;
import com.tcoker.MyTasks.entity.Task;
import com.tcoker.MyTasks.entity.User;
import com.tcoker.MyTasks.exceptions.TaskException;
import com.tcoker.MyTasks.repository.UserRepo;
import com.tcoker.MyTasks.utility.HashingUtility;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo repo;

	@Override
	public UserDTO verifyLogin(String emailId, String password) throws Exception{
		User user = repo.findByEmail(emailId);
		if(user == null) {
			throw new TaskException("Service.USER_NOT_FOUND");
		}
//		if(!user.getPassword().equals(HashingUtility.getHashValue(password))) {
//			throw new TaskException("Service.Invalid_Login");
//		}
		//not going to use the hashing utility tool yet for testing purposes
		if(!password.equals(user.getPassword())) {
			throw new TaskException("Service.INVALID_LOGIN");
		}
		
		UserDTO dto = new UserDTO();
		dto.setEmailId(user.getEmail());
		dto.setName(user.getName());
		dto.setPhoneNumber(user.getPhoneNumber());
		if(!user.getMyTasks().isEmpty()) {
			List<TaskDTO> taskDTOs;
			taskDTOs = user.getMyTasks().stream().map(t -> {
				TaskDTO tdto = new TaskDTO();
				tdto.setTaskId(t.getTaskId());
				tdto.setTaskGroup(t.getTaskGroup());
				tdto.setTaskDescription(t.getTaskDescription());
				tdto.setDate(t.getDate());
				return tdto;
			}).collect(Collectors.toList());
			dto.setMyTasks(taskDTOs);
		}
		
		return dto;
	}

	@Override
	public String addUser(UserDTO dto) throws Exception {
		User user = repo.findByEmail(dto.getEmailId());
		if(user != null) {
			throw new TaskException("Service.EMAIL_TAKEN");
		}
		user = new User();
		user.setEmail(dto.getEmailId());
		user.setName(dto.getName());
		user.setPassword(dto.getPassword());
		user.setPhoneNumber(dto.getPhoneNumber());
		if(!dto.getMyTasks().isEmpty()) {
			List<Task> tasks = dto.getMyTasks().stream().map(t -> {
				Task task = new Task();
				task.setTaskId(t.getTaskId());
				task.setTaskGroup(t.getTaskGroup());
				task.setTaskDescription(t.getTaskDescription());
				task.setDate(t.getDate());
				return task;
			}).collect(Collectors.toList());
			user.setMyTasks(tasks);
		}
		repo.save(user);
		return user.getEmail();
	}

	@Override
	public UserDTO getUser(String emailId) throws Exception {
		User user = repo.findByEmail(emailId);
		if(user == null) {
			throw new TaskException("Service.USER_NOT_FOUND");
		}
		UserDTO dto = new UserDTO();
		dto.setEmailId(user.getEmail());
		dto.setName(user.getName());
		dto.setPhoneNumber(user.getPhoneNumber());
		if(!user.getMyTasks().isEmpty()) {
			List<TaskDTO> taskDTOs;
			taskDTOs = user.getMyTasks().stream().map(t -> {
				TaskDTO tdto = new TaskDTO();
				tdto.setTaskId(t.getTaskId());
				tdto.setTaskGroup(t.getTaskGroup());
				tdto.setTaskDescription(t.getTaskDescription());
				tdto.setDate(t.getDate());
				return tdto;
			}).collect(Collectors.toList());
			dto.setMyTasks(taskDTOs);
		}
		return dto;
	}

	@Override
	public Boolean deleteUser(String emailId) throws Exception {
		User user = repo.findByEmail(emailId);
		if(user == null) {
			throw new TaskException("Service.USER_NOT_FOUND");
		}
		repo.delete(user);
		return true;
	}


}
