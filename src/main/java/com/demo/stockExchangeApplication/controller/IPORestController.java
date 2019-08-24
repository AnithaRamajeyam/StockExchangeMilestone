package com.demo.stockExchangeApplication.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.stockExchangeApplication.model.Company;
import com.demo.stockExchangeApplication.model.IPODetail;
import com.demo.stockExchangeApplication.service.CompanyService;
import com.demo.stockExchangeApplication.service.IPODetailService;
@RestController
public final class IPORestController {
		@Autowired
		IPODetailService iposervice;
		
		@Autowired
		CompanyService companyservice;
		
		@GetMapping(value = "ipodetails/{companyname}")
		public List<IPODetail> getIpodetail(@PathVariable String companyname) {
			Company company=companyservice.findByCompanyname(companyname);
			int companycode=company.getCompanyCode();
			return iposervice.findBycompanycode(companycode);
		}

}
