package com.example.exam;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exam.DAOUser;
import com.example.exam.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public DAOUser getUser(Long userId) { 
		Optional<DAOUser> optUser = userRepository.findById(userId);
		return optUser.get(); 
	} 

}
