package com.adamfei.dataguru.service;

import com.adamfei.dataguru.entity.User;

public interface UserService {
	public int addUser(User u);
	public User login(String username, String password);
}
