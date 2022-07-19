package com.tcoker.MyTasks.service;

import com.tcoker.MyTasks.dto.UserDTO;

public interface UserService {
	
	Boolean verifyLogin(String emailId, String password) throws Exception;
	String addUser(UserDTO dto) throws Exception;
	UserDTO getUser(String emailId) throws Exception;
	Boolean deleteUser(String emailId) throws Exception;
	Boolean updateUser(UserDTO dto) throws Exception;
	
}
