package com.demo.stockExchangeApplication.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.demo.stockExchangeApplication.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer> {

	List<Company> findBySectorId(int sectorid);

    @Query(value="SELECT company_name FROM Company  Where company_name LIKE :name% ", nativeQuery=true)
	List<String> findAllByCompanyName(@Param("name") String name);

	Company findByCompanyName(String name);
	
}
