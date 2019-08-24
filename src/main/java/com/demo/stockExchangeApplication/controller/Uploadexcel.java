package com.demo.stockExchangeApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Uploadexcel {
	
	@RequestMapping("/insertStock")
	public String Load()
	{
		return "importStock";
	}

}
