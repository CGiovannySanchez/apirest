package com.giovanny.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.giovanny.apirest.entity.User;
import com.giovanny.apirest.repository.UserRepository;


@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}

	public User save(User user) {
		return userRepository.save(user);
	}
	
	public User get(Integer id) {
		return null;		
	}
	
	public void delete(Integer id) {
		userRepository.deleteById(id);
	}
}
