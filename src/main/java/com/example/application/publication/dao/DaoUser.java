package com.example.application.publication.dao;

import com.example.domain.publication.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface DaoUser extends CrudRepository<User, Long>{
	
	 User findById(int id);
	 List<User> findAll();
	
	 
	 
}