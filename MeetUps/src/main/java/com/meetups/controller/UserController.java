package com.meetups.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meetups.dao.StatusDao;
import com.meetups.dao.StatusDaoImpl;
import com.meetups.dao.UserDao;
import com.meetups.model.Status;
import com.meetups.model.Users;

@RestController
public class UserController {
	
	static {
		System.out.println("in static block");
	}
	@Autowired
	private UserDao userDao;
	
	//http://localhost:8080/letzchaat/addUser
	
	@RequestMapping(value="/addUser", method=RequestMethod.POST,headers="Accept=application/json")
	public void addUser(@RequestBody Users user)
	{
		System.out.println("Inside the adduser ");
		userDao.addUser(user);
	}
	 @RequestMapping(value = "/getUsers", method = RequestMethod.GET, headers = "Accept=application/json")  
	 public List<Users> getUsers()
	 {
		 List<Users> users=userDao.viewUsers();
		return users;// JAVA OBJECTS-> JACKSON
	 }
	 @RequestMapping(value="/updateUser",method=RequestMethod.PUT,headers="Accept=application/json")
	 public void updateUser(@RequestBody Users user)
	 {
		 userDao.update(user);
	 }
	 @RequestMapping(value="/getUser/{id}",method=RequestMethod.GET,headers="Accept=application/json")
	 public @ResponseBody Users getUserById(@PathVariable("id") int id)
	 {
		 System.out.println("User Id:"+id);
		 return userDao.viewUserById(id);
	 }
	 @RequestMapping(value="/authenticate", method=RequestMethod.POST,headers="Accept=application/json")
	 public int authenticateUser(@RequestBody Users user)
	 {
		 System.out.println("email:"+user.getEmailId());
		 System.out.println("password:"+user.getPassword());
	int result=0;
		 result=userDao.validateUser(user.getEmailId(),user.getPassword());
		 System.out.println("result we have got is:"+result);
		 return result;
	 }
	 

}

