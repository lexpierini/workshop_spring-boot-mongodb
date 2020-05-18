package com.example.aula338.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula338.domain.User;
import com.example.aula338.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired // Instance un objet automatiquement. Mécanisme d'injection automatique de dépendances du Springboot.
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll();
	}

}
