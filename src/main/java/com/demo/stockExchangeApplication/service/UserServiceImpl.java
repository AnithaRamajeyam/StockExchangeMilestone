package com.demo.stockExchangeApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.stockExchangeApplication.dao.UserDao;
import com.demo.stockExchangeApplication.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao dao;
	@Override
	public User registerUser(User user) {
		User result=dao.save(user);
		return result;
	}
	@Override
	public List<User> loginuser() {
		return dao.findAll();
	}

}
