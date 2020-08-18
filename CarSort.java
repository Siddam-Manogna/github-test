package com.dxc.logical;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> Car= new ArrayList<String>();
		Car.add("Ford");
		Car.add("Benz");
		Car.add("BMW");
		Car.add("Tata");
		Car.add("Mahendra");
		Car.add("Maruthi");
		
		Collections.sort(Car);
		for(String x:Car) {
			System.out.println(x);
		}

	}

}
