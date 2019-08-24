package com.demo.stockExchangeApplication.controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.demo.stockExchangeApplication.model.User;

public interface UserController {
	
	public String registerUser(User user,BindingResult result,Model model);

}
