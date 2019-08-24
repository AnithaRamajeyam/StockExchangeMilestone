package com.demo.stockExchangeApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.stockExchangeApplication.model.User;

public interface UserDao extends JpaRepository<User, Integer> {
}
