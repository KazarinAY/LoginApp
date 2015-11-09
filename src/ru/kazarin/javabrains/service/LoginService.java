package ru.kazarin.javabrains.service;

import java.util.HashMap;
import java.util.Map;

import ru.kazarin.javabrains.dto.User;

public class LoginService {
	
	Map<String,String> users = new HashMap<String,String>();
	
	public LoginService() {
		users.put("johndoe", "John Doe");
		users.put("jonedoe", "Jone Doe");
		users.put("jguru", "Java Guru");
	}
	
	public boolean authenticate(String userId, String password) {
				
		if ( password == null || password.trim().equals("") ) {
			return false;
		} 
		return true;
	}
	
	public User getUserDetails(String userId) {
		User user = new User();
		user.setUserId(userId);
		user.setUserName(users.get(userId));
		return user;
	}
	
}
