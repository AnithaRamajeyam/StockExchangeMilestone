package com.demo.stockExchangeApplication.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.stockExchangeApplication.model.Company;
import com.demo.stockExchangeApplication.model.StockPrice;
import com.demo.stockExchangeApplication.model.User;
import com.demo.stockExchangeApplication.service.UserService;

@Controller
public class UserControllerImpl implements UserController {

	@Autowired
	UserService service;

	@RequestMapping("/login")
	public String login(Model model) {
		User userlog=new User();
		model.addAttribute("userlog", userlog);
		return "userSignin";
		
	}
	@GetMapping("/loginUser")
	public String loginuser(@ModelAttribute("userlog")  User user,Model model)
	{
		int flag=0;
		String username=user.getUserName();
		String password=user.getPassword();
		System.out.println(password);
		if(username.equals("Admin"))
		{			
			if(password.equals("Admin123"))
			{
				return "admin";
			}
			else
			{
				return "userSignin";
			}
		}
		else
		{
			List<User> userdetails=service.loginuser();
			for(User userDetails:userdetails)
			{
			if((username.equals(userDetails.getUserName()) && (password.equals(userDetails.getPassword()))))
			{
				flag=1;	
			}
			}
		}
		if(flag==1) {
			return "user";
		}
		else
		{
			return "userSignin";
		}
	}
	@RequestMapping("/register")
	public String register(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		return "userSignup";
		
	}
	@PostMapping("/registeruser")
	public String registerUser(@ModelAttribute("user") @Valid User user,BindingResult bindingresult,Model model) {
		
		if(bindingresult.hasErrors())
		{
			return "userSignup";
		}
		else
		{
			User result=service.registerUser(user);
			if(result !=null)
			 {
				User userlog=new User();
				model.addAttribute("userlog", userlog);
				 	return "userSignin";
			 }
			 else
			 {
				 	return "error";
			 }
		}
		
	}
}
