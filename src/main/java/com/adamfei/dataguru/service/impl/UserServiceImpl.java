package com.adamfei.dataguru.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.adamfei.dataguru.entity.User;
import com.adamfei.dataguru.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private List<User> users = new ArrayList<User>();
	private static int userId = 0;
	
	
	@Override
	public int addUser(User u) {
		u.setUserId(userId++);
		users.add(u);
		return 1;
	}

	@Override
	public User login(String username, String password) {
		
		for(User u : users){
			if(u.getUsername().equals(username) && u.getPassword().equals(password))
				return u;
		}
		
		return null;
	}

}
