package com.demo.stockExchangeApplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.stockExchangeApplication.model.IPODetail;

public interface IPODetailDao extends JpaRepository<IPODetail, Integer>{

	List<IPODetail> findBycompanycode(int companycode);

}
