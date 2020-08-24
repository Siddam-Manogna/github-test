package com.dxc.logical;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class StudentsCollection {
	
	public static void main(String[] args) {
		int a,b,c,d;
		try {

			FileReader rd=new FileReader("data (1).txt");
			BufferedReader brd=new BufferedReader(rd);
			brd.readLine();
			String str = brd.readLine();
			ArrayList<StudentFile> s=new ArrayList<StudentFile >();
			while(str!=null) {
			str=str.trim();
			String[] arr=str.split(",");
			a=Integer.parseInt(arr[0]);
			b=Integer.parseInt(arr[1]);
			c = Integer.parseInt(arr[4]);
			d=Integer.parseInt(arr[5]);
			StudentFile s1 = new StudentFile(a,b,arr[2],arr[3],c,d);
			s.add(s1);
			str=brd.readLine();
			}
			for(StudentFile s2:s){
			System.out.println(s2);
			}
		}
		
			catch (FileNotFoundException e) {
			e.printStackTrace();
			} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}


	}

}
