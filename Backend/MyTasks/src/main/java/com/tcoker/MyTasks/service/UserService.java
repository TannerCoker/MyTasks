package com.tcoker.MyTasks.service;

import com.tcoker.MyTasks.dto.UserDTO;

public interface UserService {
	
	Boolean verifyLogin(String emailId, String password);
	String addUser(UserDTO dto);
	UserDTO getUser(String emailId);
	Boolean deleteUser(String emailId);
	Boolean updateUser(UserDTO dto);
	
}
