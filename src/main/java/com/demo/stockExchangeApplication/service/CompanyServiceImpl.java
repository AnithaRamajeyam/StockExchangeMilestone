package com.demo.stockExchangeApplication.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.demo.stockExchangeApplication.dao.CompanyDao;
import com.demo.stockExchangeApplication.model.Company;

@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	CompanyDao dao;

	@Override
	public Company insertCompany(Company company) throws SQLException {
		return dao.save(company);
	}

	@Override
	public boolean updateCompany(Company company) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Company> getCompanyList() throws Exception {
		return dao.findAll();
	}

	@Override
	public List<Company> findbySectorId(int sectorid) {
		return dao.findBySectorId(sectorid);
	}
	
	public List<String> getCompanyBYName(String name) {

        List<String> companydetails = dao.findAllByCompanyName(name);
        return companydetails;
	}

	@Override
	public Company findByCompanyname(String name) {
		return dao.findByCompanyName(name);
	}
}
