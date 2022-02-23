package com.project.SimpleBanking.CONTROLLER;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.SimpleBanking.ENTITY.USER;
import com.project.SimpleBanking.REPOSITORY.UserRepository;

@RestController
public class UserController {

	@Autowired
	UserRepository userRepository ;
	
	@GetMapping("/user")
	public List<USER>all()
	{
		return userRepository.findAll();
	}
	
	@PostMapping("/user")
	public USER add( @RequestBody USER user )
	{
		 userRepository.save(user);	 
		 return user ; 
	}
	
	@PutMapping("/user")
	public USER update( @RequestBody USER user )
	{
		userRepository.save(user);
		return user ;
	}
	
	@GetMapping("/user/{id}")
	public Optional<USER> find( @PathVariable int id )
	{
		return userRepository.findById(id);
	}
	
	@DeleteMapping("/user/{id}")
	public String delete( @PathVariable int id )
	{
		userRepository.deleteById(id);
	    return "item is deleted";
	}
	
	@DeleteMapping("user")
	public String deleteAll()
	{
		userRepository.deleteAll();
		
		return "everything in user table is deleted" ;
	}

}
