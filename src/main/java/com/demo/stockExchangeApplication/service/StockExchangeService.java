package com.demo.stockExchangeApplication.service;

import java.sql.SQLException;
import java.util.List;

import com.demo.stockExchangeApplication.model.StockExchange;

public interface StockExchangeService {
	public StockExchange insertStockExchangeDetails(StockExchange stock) throws SQLException;
	public List<StockExchange> getAllStockExchangedetails() throws Exception;
}
