package com.example.course.config;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.Users;

@RestController
@RequestMapping(value ="/users")
public class UserResources {
	
	@GetMapping
	public ResponseEntity<Users> findAll(){
		
		Users u = new Users(1L,"maria","maria@gmail.com","9999999","1234");
		return ResponseEntity.ok().body(u);
		
	}
}
