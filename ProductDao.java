package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import com.dxc.logical.DBConnection;
import com.product.model.Product;
public class ProductDao {
	public String createProduct(Product product){
		try //22 Some CLG 0
		{
		Connection connection=DBConnection.getConnect();

		String sql="insert into Product values(?,?,?,?,?,?)";
		PreparedStatement stat=connection.prepareStatement(sql);

		stat.setInt(1, product.getpId());
		stat.setString(2, product.getpName());
		stat.setInt(3, product.getpPrice());
		stat.setInt(4, product.getPQuantity());
		stat.setInt(5, product.getpValidity());
		stat.setString(6, product.getpCompany());

		int res= stat.executeUpdate();
		if(res>0)
		return "Product Created";
		else
		return "product connot be Created";
		}
		catch (Exception e) {
		e.printStackTrace();
		return "Exception "+e;
		}
		}
	public String deletedata( )
	{
	try
	{
	Connection connection=DBConnection.getConnect();
	String sql="delete from product where pId=?";
	PreparedStatement stat=connection.prepareStatement(sql);;

	Scanner in=new Scanner(System.in);
	System.out.println("enter product to delete");

	int pId=in.nextInt();

	stat.setInt(1,pId);
	int res= stat.executeUpdate();
	if(res>0)
	return "product deleted";
	else
	return "product connot be deleted";
	}
	      catch (Exception e) {

	     return "Exception "+e;

	}
	}
	public void displaydata( )
	{
	try
	{
	Connection connection=DBConnection.getConnect();
	String sql="select * from product";
	PreparedStatement stat=connection.prepareStatement(sql);;

	ResultSet rs=stat.executeQuery();
	System.out.println("displaying all");
	if(rs.next()){
	do{
	System.out.println(rs.getInt("pId") + " "+rs.getString("pName")+" "+rs.getInt("pPrice")+" "+rs.getInt("PQuantity")+" "+rs.getInt("pValidity")+" "+rs.getString("pCompany"));
	}
	while(rs.next());
	}

	else
	System.out.println("No recs Found");
	}

	      catch (Exception e) {

	     e.printStackTrace();;

	}
	}



}
