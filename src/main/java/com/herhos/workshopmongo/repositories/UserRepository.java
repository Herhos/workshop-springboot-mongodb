package com.herhos.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.herhos.workshopmongo.domains.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> { }
