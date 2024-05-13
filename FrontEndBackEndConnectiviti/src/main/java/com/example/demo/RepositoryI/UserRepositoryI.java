package com.example.demo.RepositoryI;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.User;

@Repository
public interface UserRepositoryI extends CrudRepository<User, Integer> {

	
	}

