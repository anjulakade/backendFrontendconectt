package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.RepositoryI.UserRepositoryI;
import com.example.demo.ServiceI.UserServiceI;

@Service
public class UserServiceIMPL  implements UserServiceI{
  @Autowired
  UserRepositoryI uri;
  @Override
	public void saveUser(User u) {
		uri.save(u);
	}
	
	@Override
	public Iterable<User> getAllusers()
	{
		return uri.findAll();
	}
	
	@Override
	public void deletebyId(int id) 
	{
		uri.deleteById(id);
		
		
	}

	@Override
	public void updateby(int id, User u) {
	   uri.save(u);
	}
	
}
