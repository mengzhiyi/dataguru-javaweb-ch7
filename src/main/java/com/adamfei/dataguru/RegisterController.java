package com.adamfei.dataguru;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.adamfei.dataguru.entity.User;
import com.adamfei.dataguru.service.UserService;

@Controller
@RequestMapping("/register")
public class RegisterController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(method=RequestMethod.GET)
	public String form(){
		return "registerForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String doSubmit(
			@Valid User user, BindingResult result, 
			Model model, 
			RedirectAttributes redirectAttrs){
		if (result.hasErrors()) {
			return null;
		}
		
		userService.addUser(user);
		
		redirectAttrs.addFlashAttribute("user", user);
		return "redirect:/index";
	}
	
}
