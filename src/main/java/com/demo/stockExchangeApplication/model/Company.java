package com.demo.stockExchangeApplication.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="company")
public class Company {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="company_code")
	private int companyCode;
	
	@Column(name="company_name")
	@NotEmpty(message="*please enter username")
	//@Pattern(regexp="[A-za-z]{4,9}", message="*Please enter 4-6 small case character")
	
	private String companyName;
	
	@Column(name="turnover")
	private BigDecimal turnOver;
	
	@Column(name="ceo")
	@NotEmpty(message="please enter CEO")
	private String ceo;
	
	@Column(name="board_of_directors")
	@NotEmpty(message="*please enter boardOfDirectors")
	private String boardOfDirectors;
	
	@Column(name="sector_id")
	private int sectorId;
	
	@Column(name="brief_writeup")
	@NotEmpty(message="*please enter briefWriteup")
	private String briefWriteup;
	
	@Column(name="stock_code") 
	private int stockCode;
	
//	@OneToMany(mappedBy="company")
//	private List<StockPrice> stockprice;
//
//
//	public List<StockPrice> getStockprice() {
//		return stockprice;
//	}
//
//	public void setStockprice(List<StockPrice> stockprice) {
//		this.stockprice = stockprice;
//	}

	public int getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public BigDecimal getTurnOver() {
		return turnOver;
	}

	public void setTurnOver(BigDecimal turnOver) {
		this.turnOver = turnOver;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}

	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}

	public int getSectorId() {
		return sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	public String getBriefWriteup() {
		return briefWriteup;
	}

	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}

	public int getStockCode() {
		return stockCode;
	}

	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	
}
