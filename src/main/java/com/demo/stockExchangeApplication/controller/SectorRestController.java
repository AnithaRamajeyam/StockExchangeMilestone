package com.demo.stockExchangeApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.demo.stockExchangeApplication.dao.SectorDao;
import com.demo.stockExchangeApplication.model.Company;

import com.demo.stockExchangeApplication.model.Sector;
import com.demo.stockExchangeApplication.service.CompanyService;
import com.demo.stockExchangeApplication.service.SectorService;


@RestController
public class SectorRestController {
		
		@Autowired
		CompanyService companyservice;
		
		@Autowired
		SectorService sectorservice;
		
		@GetMapping(value = "companylist/{name}")
		public List<Company> getcompanylist(@PathVariable String name) {
			Sector sectorid=sectorservice.findBySectorname(name);
			int sector_id=sectorid.getSectorid();
			return companyservice.findbySectorId(sector_id);
		}
		
		@GetMapping("/getCompanyByName/{name}")
	    public List<String> getCompanyBYName(@PathVariable("name") String name) {
			
			return companyservice.getCompanyBYName(name);
			
		} 
}
