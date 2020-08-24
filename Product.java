package com.product.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.dxc.logical.DBConnection;

public class Product {
	int pId;
	String pName;
	int pPrice;
	int PQuantity;
	int pValidity;
	String pCompany;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getpPrice() {
		return pPrice;
	}
	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}
	public int getPQuantity() {
		return PQuantity;
	}
	public void setPQuantity(int pQuantity) {
		PQuantity = pQuantity;
	}
	public int getpValidity() {
		return pValidity;
	}
	public void setpValidity(int pValidity) {
		this.pValidity = pValidity;
	}
	public String getpCompany() {
		return pCompany;
	}
	public void setpCompany(String pCompany) {
		this.pCompany = pCompany;
	}
	public Product(int pId, String pName, int pPrice, int pQuantity, int pValidity, String pCompany) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		PQuantity = pQuantity;
		this.pValidity = pValidity;
		this.pCompany = pCompany;
	}
	public Product() {
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", PQuantity=" + PQuantity
				+ ", pValidity=" + pValidity + ", pCompany=" + pCompany + "]";
	}
	
	

	

}
