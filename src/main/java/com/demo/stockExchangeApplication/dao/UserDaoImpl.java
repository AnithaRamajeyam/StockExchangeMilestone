package com.demo.stockExchangeApplication.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.demo.stockExchangeApplication.model.User;

/*
public class UserDaoImpl implements UserDao {

	@Override
	public int registerUser(User user) {
		Connection con=null;
		PreparedStatement ps=null;
		int result=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/stock","root","root");
			ps=con.prepareStatement("insert into user(username,password ,usertype,email,mobile_number,confirmed) values(?,?,?,?,?,?)");
			ps.setString(1, user.getUserName());
			ps.setString(2, user.getPassword());
			ps.setString(3, user.getUserType());
			ps.setString(4, user.getEmail());
			ps.setLong(5,user.getMobileno());
			ps.setBoolean(6, user.isConfirmed());
			result=ps.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

}
*/