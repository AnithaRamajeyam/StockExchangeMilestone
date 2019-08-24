package com.demo.stockExchangeApplication.dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.stockExchangeApplication.model.StockExchange;

public interface StockExchangeDao  extends JpaRepository<StockExchange, Integer>{
	
}
