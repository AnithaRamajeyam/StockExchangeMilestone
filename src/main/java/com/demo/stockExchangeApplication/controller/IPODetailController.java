package com.demo.stockExchangeApplication.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.demo.stockExchangeApplication.model.IPODetail;


public interface IPODetailController {
	
	public IPODetail insertIPODetail(IPODetail ipodetail) throws SQLException;
	public ModelAndView getAllIPOPLanned() throws Exception;
}
