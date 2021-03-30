package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo")
public class UserController {
	
	@Autowired
	private UserService userService;

//	GET REQ
	@RequestMapping("/all")
	public Iterable<Users> getAllUsers() {
		return userService.getAllUsers();
	}
	
//	GET REQ
	@RequestMapping("/{id}")
	public Users getUser(@PathVariable Integer id) {
		return userService.getUser(id);
	}
	
//	POST REQ
	@RequestMapping(method = RequestMethod.POST, path = "/add")
	public void addNewUser(@RequestBody Users user) {
		userService.addNewUser(user);
	}
	
// PUT REQ
	@RequestMapping(method = RequestMethod.PUT, value = "/{id}")
	public void updateUser(@RequestBody Users user, @PathVariable Integer id) {
		userService.updateUser(user, id);
	}
	
//DELETE REQ
	@RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
	public void deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);
	}	
}
