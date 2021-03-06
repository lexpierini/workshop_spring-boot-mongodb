package com.example.aula338.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aula338.domain.Post;
import com.example.aula338.repository.PostRepository;
import com.example.aula338.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired // Instance un objet automatiquement. Mécanisme d'injection automatique de dépendances du Springboot.
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objet non trouvé."));
	}
	
	public List<Post> findByTitle(String text) {
		return repo.searcheTitle(text);
	}
	
	public List<Post> fullSearche(String text, Date minDate, Date maxDate) {
		maxDate = new Date(maxDate.getTime() + 24 * 60 * 60 * 1000);
		return repo.fullSearch(text, minDate, maxDate);
	}

}
