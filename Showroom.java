package com.dxc.logical;
import java.util.*;

public  class Showroom {
	private String ShowroomName;
	private String Location;
	List<Car>cars;
	public String getShowroomName() {
		return ShowroomName;
	}
	public void setShowroomName(String showroomName) {
		ShowroomName = showroomName;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}
	public Showroom(String showroomName, String location, List<Car> cars) {
		super();
		ShowroomName = showroomName;
		Location = location;
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "Showroom [ShowroomName=" + ShowroomName + ", Location=" + Location + ", cars=" + cars + "]";
	}
	
	public Showroom() {
		
	}
}
