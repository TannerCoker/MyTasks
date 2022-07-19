package com.tcoker.MyTasks.api;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<Boolean> validateLogin(@PathVariable String email,@PathVariable String password){
		
	}
	
	@GetMapping("/retrieve/{email}")
	public ResponseEntity<UserDTO> getUser(@PathVariable String email) {
		
	}
	
	@PostMapping("/add")
	public ResponseEntity<Boolean> addUser(@Valid @RequestBody UserDTO newCustomer) {
		
	}
	
	@DeleteMapping("/remove/{email}")
	public ResponseEntity<Boolean> deleteUser(@PathVariable String email) {
		
	}
	
	@PutMapping("/update")
	public ResponseEntity<Boolean> modifyUser(@Valid @RequestBody UserDTO user) {
		
	}
}
