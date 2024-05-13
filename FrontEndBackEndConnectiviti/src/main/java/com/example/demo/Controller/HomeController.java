package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;


import com.example.demo.Model.User;
import com.example.demo.ServiceI.UserServiceI;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//BackEndAndFrontendConnect
//same here 

//            (http://localhost:4200)
@CrossOrigin("*")
@RestController
public class HomeController {
	@Autowired
	UserServiceI us;
@PostMapping("/saveUser")
public String saveUser(@RequestBody  User u)
{
	us.saveUser(u);
	return "Data save...!";
}
  @GetMapping("/getallusers")
  public Iterable<User> getAllUsers()
  {
	return us.getAllusers();
	  
  }
  @PutMapping("/updatebyPut/{id}")
  public String updateby(@PathVariable int id, @RequestBody User u)
  {
  	us.updateby(id, u);
  	return "data updated by put";

  }

  @DeleteMapping("/deletebyId/{id}")
  public void deletebyId(@PathVariable int id)
  {
  	us.deletebyId(id);
  }

}
