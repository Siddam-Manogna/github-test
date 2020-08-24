package com.dxc.logical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertWithParameters {
	public static void main(String[] args) {

		try
		{

		Class.forName("oracle.jdbc.OracleDriver");

		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "dxcfs","pass");

		String sql="insert into clg values(?,?)";

		PreparedStatement stat=con.prepareStatement(sql);
		//Statement -> no prmtzd queries
		//PreparedStatement -> prmtzd queries
		//CallableStatement -> procs and named prmtzd queries



		stat.setInt(1, 1054);
		stat.setString(2, "PANJAB University");


		stat.executeUpdate();



		// execute()  --> ddl
		//ResultSet rs= executeQuery()--> dql (select)
		//int executeUpdate() --> dml

		System.out.println("inserted");
		}
		catch (Exception e) {
		e.printStackTrace();
		}
		}

		}

