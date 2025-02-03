package com.kaique.projeto_spring_app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kaique.projeto_spring_app.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {
	
	
}
