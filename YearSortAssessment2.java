package com.dxc.logical;
import java.util.*;
public class YearSortAssessment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> Car= new ArrayList<Integer>();
		Car.add(2020);
		Car.add(2015);
		Car.add(2016);
		Car.add(2013);
		Car.add(2007);
		Car.add(2002);
		Car.add(2000);
		Collections.sort(Car);
		for(int x:Car) {
			System.out.println(x);
		}

	}

}
