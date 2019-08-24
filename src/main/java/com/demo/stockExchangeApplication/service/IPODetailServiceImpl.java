package com.demo.stockExchangeApplication.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.stockExchangeApplication.dao.IPODetailDao;
import com.demo.stockExchangeApplication.model.Company;
import com.demo.stockExchangeApplication.model.IPODetail;

@Service
public class IPODetailServiceImpl implements IPODetailService {

	@Autowired
	IPODetailDao ipodao;

	@Override
	public IPODetail insertIPODetail(IPODetail ipodetail) throws SQLException {
		IPODetail result = ipodao.save(ipodetail);
		return result;
	}

	@Override
	public List<IPODetail> getAllIPOPLanned() throws Exception {
		List<IPODetail> list = ipodao.findAll();
		return list;
	}

	@Override
	public List<IPODetail> findBycompanycode(int companycode) {
		return ipodao.findBycompanycode(companycode);
	}

}
 