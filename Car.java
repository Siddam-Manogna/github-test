package com.dxc.logical;

public class Car {
	private String name;
	private int year;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Car(String name, int year) {
		super();
		this.name = name;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Cars [name=" + name + ", year=" + year + "]";
	}
	public Car() {
		
	}

}
