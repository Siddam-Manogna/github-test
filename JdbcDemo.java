package com.dxc.logical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		// external class
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");
		System.out.println("loaded driver");
		System.out.println("connected");
		String sql="insert into clg values(456,'abc')";
		PreparedStatement stat=con.prepareStatement(sql);
		stat.executeUpdate();
		
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		
		}

		

	}


