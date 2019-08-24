package com.demo.stockExchangeApplication.controller;

import java.sql.SQLException;
import java.util.List;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import com.demo.stockExchangeApplication.model.StockExchange;

public interface StockExchangeController {
	 public String insertStockExchangeDetails(StockExchange stockexchange,BindingResult result,Model model) throws SQLException;
	public ModelAndView getAllStockExchangedetails() throws Exception;
}
