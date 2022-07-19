package com.tcoker.MyTasks.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.tcoker.MyTasks.dto.UserDTO;

@RestController
public class UserAPI {
	
	public ResponseEntity<Boolean> validateLogin(String email, String password){
		
		
	}
	
	public ResponseEntity<UserDTO> getUser(String email) {
		
	}
	
	public ResponseEntity<UserDTO> addUser(UserDTO newCustomer) {
		
	}
	
	public ResponseEntity<Boolean> deleteUser(UserDTO user) {
		
	}
	
	public ResponseEntity<UserDTO> modifyUser(UserDTO user) {
		
	}
}
