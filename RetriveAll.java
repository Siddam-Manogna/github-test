package com.dxc.logical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RetriveAll {
	public void insert(){

		/* String sql="insert into clg values(?,?,?)";

		PreparedStatement stat=con.prepareStatement(sql);

		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER Cid , clg name and no of studs");

		int cId=sc.nextInt();
		String cName=sc.next();
		int nos=sc.nextInt();

		stat.setInt(1, cId);
		stat.setString(2, cName);
		stat.setInt(3, nos);


		stat.executeUpdate();

		System.out.println("inserted");
		*/
		}


		public static void main(String[] args) {

		try
		{

		Class.forName("oracle.jdbc.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");

		String sql="select * from clg";

		PreparedStatement stat=con.prepareStatement(sql);

		ResultSet rs=stat.executeQuery();

		while(rs.next())
		{
		System.out.println(rs.getInt("cid") + " "+rs.getString("cname"));
		}


		}
		catch (Exception e) {
		e.printStackTrace();
		}
		}


}
