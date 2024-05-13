package com.example.demo.ServiceI;

import com.example.demo.Model.User;

public interface UserServiceI {
   public void saveUser(User u);
   public Iterable<User> getAllusers();
   public void deletebyId(int id);
   public void updateby(int id,User u);

 }
