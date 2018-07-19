package com.mazurak.service;

import java.util.List;

import com.mazurak.entity.User;

public interface UserService {

	void saveUser(User user);
	
	User findUserById(Integer id);
	
	List<User> getAllUsers();
	
	void verifyAccount(String token, String id) ;

	void update(User user);
}
