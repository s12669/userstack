package com.example.application.publication.service.impl;

import com.example.application.publication.dao.DaoUser;
import com.example.application.publication.service.ServiceUser;
import com.example.domain.publication.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceUserImpl implements ServiceUser {

	
	private final DaoUser dao;

    @Autowired
    public ServiceUserImpl(DaoUser dao) {
        this.dao = dao;
    }


    public User findById(int id){
		 
		 return dao.findById(id);
		 
	 }
	 public List<User> findAll(){
		 return dao.findAll();
	 }
	
	public void save(User contest){
        dao.save(contest);
    }

}
