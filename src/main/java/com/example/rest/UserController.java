/**
 * 
 */
package com.example.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.User;
import com.example.repo.UserRepo;

/**
 * @author AC03582
 *
 */
@RestController
public class UserController {

	@Autowired
	UserRepo repo;

	@PostMapping("/user")
	public ResponseEntity callSaveUser(@RequestBody User user) {
		repo.saveUser(user);
		return new ResponseEntity(user, HttpStatus.CREATED);
	}

	@GetMapping("/users")
	public List<User> callGetAllUsers() {
		return repo.getUsers();
	}

	@GetMapping("/user/{id}")
	public User callGetUser(@PathVariable Integer id) {
		return repo.getUser(id);
	}

	@DeleteMapping("/user")
	public ResponseEntity callDeleteUser(Integer id) {
		repo.deleteUser(id);
		return new ResponseEntity("User Deleted Successfully ", HttpStatus.OK);
	}
}
