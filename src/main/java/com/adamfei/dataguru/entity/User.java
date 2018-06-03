package com.adamfei.dataguru.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Data
public class User {
	
	private int userId;
	
	@NotEmpty
	private String username;
	
	@NotEmpty
	private String password;
	
	@Email
	private String email;
	
	private int gender;
	
	private String simpleDesc;
	
	
}
