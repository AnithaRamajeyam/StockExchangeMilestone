package com.demo.stockExchangeApplication.controller;

import java.sql.SQLException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.demo.stockExchangeApplication.model.StockExchange;
import com.demo.stockExchangeApplication.service.StockExchangeService;

@Controller
public class StockExchangeControllerImpl implements StockExchangeController {
	
	@Autowired
	StockExchangeService service;
	
	@RequestMapping("/addstock")
	public String add(Model model)
	{
		StockExchange stockexchange=new StockExchange();
		model.addAttribute("stockexchange", stockexchange);
		return "addStockDetail";	
	}
	@RequestMapping(value="/addstockDetails", method=RequestMethod.POST)
    public String insertStockExchangeDetails(@ModelAttribute("stockexchange") @Valid StockExchange stockexchange,BindingResult result,Model model) throws SQLException{
		 if (result.hasErrors()) {
	            return "addStockDetail";
	      }
		 else
		 {
			 StockExchange stock=service.insertStockExchangeDetails(stockexchange);
			 if(stock!=null)
			 {
				 	return "addStockDetail";
			 }
			 else
			 {
				 	return "error";
			 }
		 }
	}
	@RequestMapping("/displaystock")
	public ModelAndView getAllStockExchangedetails() throws Exception {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("listStockDetails");
		mv.addObject("stockList",service.getAllStockExchangedetails());
		return mv;
	}
}
