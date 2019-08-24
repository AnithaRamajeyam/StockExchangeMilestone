package com.demo.stockExchangeApplication.service;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.web.multipart.MultipartFile;

import com.demo.stockExchangeApplication.model.StockPrice;

public interface StockPriceService {


	public List<StockPrice> getStockList();

	public List<StockPrice> insertStock(MultipartFile file) throws IOException, EncryptedDocumentException, InvalidFormatException;

	public List<StockPrice> findBycompanycode(int companycode);

}
