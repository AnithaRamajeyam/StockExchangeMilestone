package com.demo.stockExchangeApplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.stockExchangeApplication.model.Sector;

public interface SectorDao extends JpaRepository<Sector, Integer>{
	Sector findBySectorname(String name);

}
