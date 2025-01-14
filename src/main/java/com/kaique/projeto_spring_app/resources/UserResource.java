package com.kaique.projeto_spring_app.resources;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.kaique.projeto_spring_app.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
        User u = new User(1L, "Kaique", "kaique@example.com", "123456789", "senha123");
        return ResponseEntity.ok().body(u);
    }
}
