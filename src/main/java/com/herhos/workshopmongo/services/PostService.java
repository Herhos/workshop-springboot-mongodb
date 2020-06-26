package com.herhos.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herhos.workshopmongo.domains.Post;
import com.herhos.workshopmongo.repositories.PostRepository;
import com.herhos.workshopmongo.services.exceptions.ObjectNotFoundException;

@Service
public class PostService
{
	@Autowired
	public PostRepository postRepository;
	
	public Post findById(String id)
	{
		Optional <Post> obj= postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
	}
	
	public List<Post> findByTitle(String text)
	{
		return postRepository.searchTitle(text);
	}
}
