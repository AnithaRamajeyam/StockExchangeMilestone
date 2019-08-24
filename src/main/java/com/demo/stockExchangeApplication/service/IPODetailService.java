package com.demo.stockExchangeApplication.service;
 import java.sql.SQLException; import java.util.List;
import com.demo.stockExchangeApplication.model.IPODetail;

 public interface IPODetailService { 
	 public IPODetail
	 insertIPODetail(IPODetail ipodetail) throws SQLException; 
	 public List<IPODetail> getAllIPOPLanned() throws Exception;
	 public List<IPODetail> findBycompanycode(int companycode); 
}
