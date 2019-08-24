package com.demo.stockExchangeApplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.stockExchangeApplication.model.StockPrice;

public interface StockPriceDao extends JpaRepository<StockPrice, Integer> {

	List<StockPrice> findBycompanycode(int companycode);

}
