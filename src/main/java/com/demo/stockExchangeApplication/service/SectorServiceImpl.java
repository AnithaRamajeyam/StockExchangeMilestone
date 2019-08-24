package com.demo.stockExchangeApplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.stockExchangeApplication.dao.SectorDao;
import com.demo.stockExchangeApplication.model.Sector;
@Service
public class SectorServiceImpl implements SectorService {

	@Autowired
	SectorDao sectordao;
	
	@Override
	public Sector findBySectorname(String name) {
		
		return sectordao.findBySectorname(name);
	}

}
