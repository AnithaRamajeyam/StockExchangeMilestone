//package com.demo.stockExchangeApplication.model;
//import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
//import org.apache.poi.ss.usermodel.*;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.demo.stockExchangeApplication.dao.StockPriceDao;
//
//import java.io.File;
//import java.io.IOException;
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.Iterator;
//import java.util.List;
//
///**
// * Created by rajeevkumarsingh on 18/12/17.
// */
//
//public class ExcelReader {
//    //public static final String SAMPLE_XLS_FILE_PATH = "./sample-xls-file.xls";
//    public static final String SAMPLE_XLSX_FILE_PATH = "./Sample_StockPrice.xlsx";
//
//    public static void main(String[] args) throws IOException, InvalidFormatException, ParseException {
//    	
// 
//
//        // Creating a Workbook from an Excel file (.xls or .xlsx)
//        Workbook workbook = WorkbookFactory.create(new File(SAMPLE_XLSX_FILE_PATH));
//
//        // Retrieving the number of sheets in the Workbook
//        System.out.println("Workbook has " + workbook.getNumberOfSheets() + " Sheets : ");
//
//        /*
//           =============================================================
//           Iterating over all the sheets in the workbook (Multiple ways)
//           =============================================================
//        */
//
//        System.out.println("Retrieving Sheets using for-each loop");
//        for(Sheet sheet: workbook) {
//            System.out.println("=> " + sheet.getSheetName());
//        }
//
//        Sheet sheet = workbook.getSheetAt(0);
//        Iterator<Row> rows = sheet.iterator();
//		
//		
//		
//		int rowNumber = 0;
//		while (rows.hasNext()) {
//			Row currentRow = rows.next();
//			
//			// skip header
//			if(rowNumber == 0) {
//				rowNumber++;
//				continue;
//			}
//			
//			Iterator<Cell> cellsInRow = currentRow.iterator();
//
//			StockPrice cust = new StockPrice();
//			
//			int cellIndex = 0;
//			while (cellsInRow.hasNext()) {
//				Cell currentCell = cellsInRow.next();
//				
//				if(cellIndex==0) { // ID
//					cust.setCompanycode((int) currentCell.getNumericCellValue());
//				} else if(cellIndex==1) { // Name
//					cust.setCurrentPrice((double)currentCell.getNumericCellValue());
//				} else if(cellIndex==2) { // Address
//					cust.setStockExchange(currentCell.getStringCellValue());
//				}else if(cellIndex==3) { // Address
//					cust.setDate(currentCell.getCellValue());} 
//				else if(cellIndex==4) { // Age
//					cust.setTime(currentCell.getStringCellValue());
//				}
//				
//				cellIndex++;
//			}
//			
//			lstCustomers.add(cust);
//		}
//		
//		// Close WorkBook
//		workbook.close();
//    }
//}
