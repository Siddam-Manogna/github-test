package com.dxc.logical;
import java.util.*;

public class Jumble {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		
		String a=sc.nextLine();
		String[] b = a.split(" ");
        for (int i=0;i<b.length;i++) {
            System.out.println((b[i])); 
	}
        
	}
}



