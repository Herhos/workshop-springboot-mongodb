package com.herhos.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herhos.workshopmongo.domains.User;
import com.herhos.workshopmongo.repositories.UserRepository;

@Service
public class UserService
{
	@Autowired
	public UserRepository userRepository;
	
	public List<User> findAll()
	{
		return userRepository.findAll();
	}
}
