package com.myspr.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Store {
	@Id
	int sId;
	String sName;
	String city;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Store(int sId, String sName, String city) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Store [sId=" + sId + ", sName=" + sName + ", city=" + city + "]";
	}
	public Store() {
		
	}
}
