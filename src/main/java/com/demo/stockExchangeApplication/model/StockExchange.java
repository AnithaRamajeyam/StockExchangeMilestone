package com.demo.stockExchangeApplication.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="stockexchange")
public class StockExchange {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="stockexchange_id")
	private int stockExchangeId;
	
	@NotEmpty(message="please enter stockexchange Name")
	@Column(name="stockexchange_name")
	private String stockExchangeName;
	
	@NotEmpty(message="please enter Brief description")
	@Column(name="brief")
	private String brief;
	
	@NotEmpty(message="please enter Address")
	@Column(name="contact_address")
	private String contactAddress;
	
	@NotEmpty(message="please enter Remarks")
	@Column(name="remarks")
	private String remarks;
//	
//	@OneToOne(mappedBy="StockExchange")
//	private StockPrice stockprice;
	
//	public StockPrice getStockprice() {
//		return stockprice;
//	}
//	public void setStockprice(StockPrice stockprice) {
//		this.stockprice = stockprice;
//	}
	public int getStockExchangeId() {
		return stockExchangeId;
	}
	public void setStockExchangeId(int stockExchangeId) {
		this.stockExchangeId = stockExchangeId;
	}
	public String getStockExchangeName() {
		return stockExchangeName;
	}
	public void setStockExchangeName(String stockExchangeName) {
		this.stockExchangeName = stockExchangeName;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
