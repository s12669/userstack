package com.example.application.publication.service;

import com.example.domain.publication.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ServiceUser {
	
	
	 User findById(int id);
	 List<User> findAll();
	 void save(User contest);

}
