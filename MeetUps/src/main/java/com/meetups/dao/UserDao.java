package com.meetups.dao;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.meetups.model.Users;

@ComponentScan("com.meetups")
@Repository
public interface UserDao {
	void addUser(Users user);
	List<Users> viewUsers();	
	void update(Users user);
	Users viewUserById(int id);
	int validateUser(String username,String password);
	
}