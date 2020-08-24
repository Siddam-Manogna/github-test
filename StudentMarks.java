package com.dxc.logical;

import java.util.HashSet;


public class StudentMarks {
	public static void main (String[] args) {
	HashSet<Integer> marks=new HashSet<Integer>(10);
	//Vector<Integer> marks=new Vector<Integer>(10);

	marks.add(10);
	marks.add(15);
	marks.add(20);
	marks.add(25);
	marks.add(10);
	marks.add(40);
	marks.add(50);
	marks.add(80);
	marks.add(100);
	System.out.println(marks);
	
	marks.remove(100);

	System.out.println(marks);

	}

}
