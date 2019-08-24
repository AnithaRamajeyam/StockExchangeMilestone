package com.demo.stockExchangeApplication.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartException;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.demo.stockExchangeApplication.model.Company;
import com.demo.stockExchangeApplication.model.Sector;
import com.demo.stockExchangeApplication.model.StockPrice;
import com.demo.stockExchangeApplication.service.CompanyService;
import com.demo.stockExchangeApplication.service.SectorService;
import com.demo.stockExchangeApplication.service.StockPriceService;

@RestController
public class StockPriceControllerImpl {
		@Autowired
		private CompanyService companyservice;
		
		@Autowired
		private StockPriceService stockService;

		@Autowired
		SectorService sectorservice;
		
		@GetMapping(value = "stockprice/{companyname}")
		public List<StockPrice> getcompanylist(@PathVariable String companyname) {
			Company company=companyservice.findByCompanyname(companyname);
			int companycode=company.getCompanyCode();
			return stockService.findBycompanycode(companycode);
		}	
		@PostMapping("/upload")
	    public String handleFormUpload(@RequestParam("file") MultipartFile file)throws IOException, EncryptedDocumentException, InvalidFormatException {
	        try{
	        if (!file.isEmpty()) {
	        	stockService.insertStock(file);
	            System.out.println("Upload successful!");
	            }
	        }catch(MultipartException e){
	        	 System.out.println("Upload failed!");
	        }
	        return "redirect:/";
	    }
//		@Autowired
//		private CompanyService companyService;
		
		@RequestMapping(path="/stockList")
		public ModelAndView getCompanyList() throws Exception {
			ModelAndView mv=new ModelAndView();
			mv.setViewName("stockList");
			mv.addObject("stockList",stockService.getStockList());
			return mv;
		}
		@GetMapping(value = "/stockbysector/{sectorname}")
		public List<StockPrice> getstockprice(@PathVariable String sectorname) {
			Sector sectorid=sectorservice.findBySectorname(sectorname);
			int sector_id=sectorid.getSectorid();
			
			List<Company> company= companyservice.findbySectorId(sector_id);
			List<StockPrice> slist = new ArrayList<>();
			for(Company cname:company)
			{
				int companycode= cname.getCompanyCode();
				slist.addAll(stockService.findBycompanycode(companycode));
			}
			return slist;
		}	
		
		
}
