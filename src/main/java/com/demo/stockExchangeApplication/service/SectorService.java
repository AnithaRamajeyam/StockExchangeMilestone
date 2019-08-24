package com.demo.stockExchangeApplication.service;

import com.demo.stockExchangeApplication.model.Sector;

public interface SectorService {
	public Sector findBySectorname(String name);
}
