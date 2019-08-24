//package com.demo.stockExchangeApplication.dao;
//
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.text.SimpleDateFormat;
//import java.util.List;
//
//import com.demo.stockExchangeApplication.model.IPODetail;
//
//
//public class IPODetailDaoImpl implements IPODetailDao {
//
//	@Override
//	public int insertIPODetail(IPODetail ipodetail) {
//		Connection con=null;
//		PreparedStatement ps=null;
//		int result=0;
//		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
//			String sdate=ipodetail.getOpenDateTime();
//			SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yyyy");
//			Date date1=(Date) formatter1.parse(sdate);
//			ps=con.prepareStatement("insert into iop_planned(company_code,stock_exchange,price_per_share,total_number_of_shares,open_date_time,remarks) values(?,?,?,?,?,?)");
//			ps.setInt(1,ipodetail.getCompanyCode());
//			ps.setInt(2, ipodetail.getStockExchange());
//			ps.setDouble(3, ipodetail.getPricePerShare());
//			ps.setInt(4,ipodetail.getTotalShares());
//			ps.setDate(5,date1);
//			ps.setString(6, ipodetail.getRemarks());
//			result=ps.executeUpdate();
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return 0;	
//	}
//
//	@Override
//	public List<IPODetail> getAllIPOPLanned() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//}
