package com.example.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user/{id}")
	public DAOUser getUserDetails(@PathVariable(name = "userId") Long userId) {
		return userService.getUser(userId);

	}

	@ExceptionHandler(RuntimeException.class)	 
	public final ResponseEntity<Exception> handleAllExceptions(RuntimeException ex) {	 
		return new ResponseEntity<Exception>(ex, HttpStatus.INTERNAL_SERVER_ERROR);	 
	}
}
