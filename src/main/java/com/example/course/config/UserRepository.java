package com.example.course.config;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

	
	
}
