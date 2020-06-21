package com.herhos.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.herhos.workshopmongo.domains.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> { }
