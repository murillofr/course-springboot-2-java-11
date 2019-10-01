package com.example.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.course.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	
	
}
