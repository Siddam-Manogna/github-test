package com.dxc.logical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertWithArgs {
	public static void main(String[] args) {

		try
		{

		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");

		String sql="insert into clg values(?,?)";

		PreparedStatement stat=con.prepareStatement(sql);

		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER Cid , clg name");

		int cId=sc.nextInt();
		String cName=sc.next();
		
		stat.setInt(1, cId);
		stat.setString(2, cName);
		

		stat.executeUpdate();

		System.out.println("inserted");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		}


}
