package com.demo.stockExchangeApplication.service;

import java.util.List;

import com.demo.stockExchangeApplication.model.User;

public interface UserService {

	public User registerUser(User user);

	List<User> loginuser();
}
