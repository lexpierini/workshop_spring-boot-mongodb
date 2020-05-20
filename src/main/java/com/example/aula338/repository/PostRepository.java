package com.example.aula338.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.aula338.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> { // L'objet UserRepository pourra effectuer des opérations de base avec des objets USER (enregistrer, récupérer, supprimer, mettre à jour) grâce à MongoRepository.
	
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searcheTitle(String text);
	
	List<Post> findByTitleContainingIgnoreCase(String text);
}
