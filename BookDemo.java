package com.dxc.logical;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;
import java.util.Iterator;

public class BookDemo {
	public static void main(String[] args) {

		HashSet<Book> hs=new HashSet<>();

		Book b1=new Book(1234,"Java","ABC");
		Book b2=new Book(33445,"C","XYZ");
		Book b3=new Book(67888,"C++","EFG");
		Book b4=new Book(78999,"Python","STR");
		Book b5=new Book(78999,"Python","STR");

		hs.add(b1);
		hs.add(b2);
		hs.add(b3);
		hs.add(b4);
		hs.add(b5);
		

		//System.out.println(hs);


		Iterator<Book> itr=hs.iterator();


		/*StudentDemo hsObj=itr.next();
		hsObj.dispStudent();
		*/

		//itr.next().dispStudent();

		while(itr.hasNext())
		{
		itr.next().disp();
		}

		}


}
