package com.tcoker.MyTasks.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.tcoker.MyTasks.dto.UserDTO;
import com.tcoker.MyTasks.repository.UserRepo;

public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo repo;

	@Override
	public Boolean verifyLogin(String emailId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addUser(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDTO getUser(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean updateUser(UserDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
