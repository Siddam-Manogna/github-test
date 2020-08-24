package com.dxc.logical;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String thisline=null;
		try {

			FileReader rd=new FileReader("data (1).txt");
			BufferedReader brd=new BufferedReader(rd);
			while((thisline=brd.readLine())!=null) {
			System.out.println(thisline.replace(",", "     "));
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
