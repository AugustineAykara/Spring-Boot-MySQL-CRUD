package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
		
	public Iterable<Users> getAllUsers() {
		return userRepository.findAll();
	}
	
	public Users getUser(Integer id) {
		return userRepository.findById(id).orElse(null);
	}
	
	public void addNewUser(Users user) {
		userRepository.save(user);
	}
	
	public void updateUser(Users user,Integer id) {
		userRepository.save(user);
	}
	
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}
}
