package com.dxc.logical;

public class StudentFile {
	private int Rollno;
	private int Clgid;
	private String Name;
	private String Gender;
	private int Sem;
	private int Marks;
	public int getRollno() {
		return Rollno;
	}
	public void setRollno(int rollno) {
		Rollno = rollno;
	}
	public int getClgid() {
		return Clgid;
	}
	public void setClgid(int clgid) {
		Clgid = clgid;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getSem() {
		return Sem;
	}
	public void setSem(int sem) {
		Sem = sem;
	}
	public int getMarks() {
		return Marks;
	}
	public void setMarks(int marks) {
		Marks = marks;
	}
	public StudentFile(int rollno, int clgid, String name, String gender, int sem, int marks) {
		super();
		Rollno = rollno;
		Clgid = clgid;
		Name = name;
		Gender = gender;
		Sem = sem;
		Marks = marks;
	}
	@Override
	public String toString() {
		return "StudentFile [Rollno=" + Rollno + ", Clgid=" + Clgid + ", Name=" + Name + ", Gender=" + Gender + ", Sem="
				+ Sem + ", Marks=" + Marks + "]";
	}
	


}
