package com.tcoker.MyTasks.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcoker.MyTasks.dto.TaskDTO;
import com.tcoker.MyTasks.dto.UserDTO;
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
			throw new TaskException("Service.Invalid_Email");
		}
//		if(!user.getPassword().equals(HashingUtility.getHashValue(password))) {
//			throw new TaskException("Service.Invalid_Login");
//		}
		//not going to use the hashing utility tool yet for testing purposes
		if(!password.equals(user.getPassword())) {
			throw new TaskException("Service.Invalid_Login");
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUser(String emailId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(String emailId) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUser(UserDTO dto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
