package com.demo.stockExchangeApplication.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="stockprice")
public class StockPrice {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int stockId;	
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="company_code")
	private int companycode;
	
	
//	@ManyToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="stockexchange_id")
	private String StockExchange;
	
	private double currentPrice;
	
	@Temporal(TemporalType.DATE)
	private Date date;
	private Date time;
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public int getCompanycode() {
		return companycode;
	}
	public void setCompanycode(int companycode) {
		this.companycode = companycode;
	}
	public String getStockExchange() {
		return StockExchange;
	}
	public void setStockExchange(String stockExchange) {
		StockExchange = stockExchange;
	}
	public double getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public StockPrice()
	{}
}
