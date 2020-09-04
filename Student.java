package com.myapp.spring.bean;

public class Student {
	String name;
	String studentId;
	String address;
	int sem;
	public String getName() {
	return name;
	}
	public void setName(String name) {
	this.name = name;
	}
	public String getStudentId() {
	return studentId;
	}
	public void setStudentId(String studentId) {
	this.studentId = studentId;
	}
	public String getAddress() {
	return address;
	}
	public void setAddress(String address) {
	this.address = address;
	}
	public int getSem() {
	return sem;
	}
	public void setSem(int sem) {
	this.sem = sem;
	}
	public Student(String name, String studentId, String address, int sem) {
	super();
	this.name = name;
	this.studentId = studentId;
	this.address = address;
	this.sem = sem;
	}

	public Student() {
	// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
	return "Student [name=" + name + ", studentId=" + studentId + ", address=" + address + ", sem=" + sem + "]";
	}

}
