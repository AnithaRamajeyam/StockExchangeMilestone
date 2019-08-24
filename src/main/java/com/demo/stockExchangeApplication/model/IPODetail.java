package com.demo.stockExchangeApplication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ipodetail")
public class IPODetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ipodeatail_id;
	private int companycode;
	private int stockexchange_id;
	private double pricepershare;
	private int totalshares;
	private String opendate;
	private String remarks;
	public int getIpodeatail_id() {
		return ipodeatail_id;
	}
	public void setIpodeatail_id(int ipodeatail_id) {
		this.ipodeatail_id = ipodeatail_id;
	}
	public int getCompanycode() {
		return companycode;
	}
	public void setCompanycode(int companycode) {
		this.companycode = companycode;
	}
	
	public int getStockexchange_id() {
		return stockexchange_id;
	}
	public void setStockexchange_id(int stockexchange_id) {
		this.stockexchange_id = stockexchange_id;
	}
	public double getPricepershare() {
		return pricepershare;
	}
	public void setPricepershare(double pricepershare) {
		this.pricepershare = pricepershare;
	}
	public int getTotalshares() {
		return totalshares;
	}
	public void setTotalshares(int totalshares) {
		this.totalshares = totalshares;
	}
	public String getOpendate() {
		return opendate;
	}
	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
}
