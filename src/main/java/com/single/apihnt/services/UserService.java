package com.single.apihnt.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.single.apihnt.entities.User;
import com.single.apihnt.repositories.UserRepository;

@Service  
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> FindAll() {
		return repository.findAll();
	}
	
	public User findById(Long id) {
	 Optional<User> obj =	repository.findById(id);
	 return obj.get();
	}
	
	
}

