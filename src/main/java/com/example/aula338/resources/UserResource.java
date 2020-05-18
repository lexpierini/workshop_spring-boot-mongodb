package com.example.aula338.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.aula338.domain.User;
import com.example.aula338.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired // Instance un objet automatiquement. Mécanisme d'injection automatique de dépendances du Springboot.
	private UserService service;
	
	@RequestMapping(method = RequestMethod.GET) // Modèle alternatif = @GetMapping
	public ResponseEntity<List<User>> findAll() { // L'objet ResponseEntity encapsulera la structure nécessaire pour renvoyer les réponses HTTP avec les en-têtes possibles, les erreurs possibles, etc.
		List<User> list = service.findAll();
		return ResponseEntity.ok(list);
	}
}
