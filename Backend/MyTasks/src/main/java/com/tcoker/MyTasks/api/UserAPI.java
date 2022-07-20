package com.tcoker.MyTasks.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tcoker.MyTasks.dto.UserDTO;
import com.tcoker.MyTasks.service.UserService;

@RestController
@RequestMapping(value = "user")
@CrossOrigin
@Validated
public class UserAPI {
	
	@Autowired
	private UserService serv;
	
	@GetMapping("/validate/{email}/{password}")
	public ResponseEntity<UserDTO> validateLogin(@PathVariable String email, @PathVariable String password) throws Exception{
		UserDTO dto = serv.verifyLogin(email, password);
		return new ResponseEntity<>(dto,HttpStatus.OK);
	}
	
	@GetMapping("/retrieve/{email}")
	public ResponseEntity<UserDTO> getUser(@PathVariable String email) throws Exception {
		UserDTO dto = serv.getUser(email);
		return new ResponseEntity<>(dto,HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<String> addUser(@Valid @RequestBody UserDTO newUser) throws Exception {
		String addedEmail = serv.addUser(newUser);
		return new ResponseEntity<>(addedEmail, HttpStatus.CREATED);
	}
	
	@DeleteMapping("/remove/{email}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable String email) throws Exception {
		Boolean didDelete = serv.deleteUser(email);
		return new ResponseEntity<>(didDelete, HttpStatus.OK);
	}
	
}
