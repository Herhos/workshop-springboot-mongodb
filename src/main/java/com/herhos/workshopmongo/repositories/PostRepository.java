package com.herhos.workshopmongo.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.herhos.workshopmongo.domains.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>
{
	List<Post> findByTitleContainingIgnoreCase(String text);
	
	// 'title' é o campo utilizado para a busca
	// ?0 é o primeiro parâmetro do método
	// 'i' indica busca case insensitive
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")
	List<Post> searchTitle(String text);
}
