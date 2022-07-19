package com.tcoker.MyTasks.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcoker.MyTasks.dto.UserDTO;
import com.tcoker.MyTasks.repository.UserRepo;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo repo;

	@Override
	public Boolean verifyLogin(String emailId, String password) throws Exception{
		// TODO Auto-generated method stub
		return null;
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
