package com.adamfei.dataguru;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.adamfei.dataguru.entity.User;
import com.adamfei.dataguru.service.UserService;

@RequestMapping("/login")
@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String login(){
		return "loginForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String doLogin(
			HttpSession session,
			@RequestParam String username, 
			@RequestParam String password,
			Model model
			){
		
		User u = userService.login(username, password);
		
		if(u != null){
			session.setAttribute("username", username);
			model.addAttribute("user", u);
			return "index";
		}
		
		model.addAttribute("message", "Your username or password is not correct!");
		return "loginForm";
	}
}
