package com.dxc.logical;
import java.util.Scanner;

//fo+23the3*like2+
public class OperatorsAndNumSeperation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String a=sc.nextLine(); 
		String d="";//digits
		String e="";//operators
		for (int i=0; i<a.length(); i++) 
		{ 
           char b=a.charAt(i);
            if(Character.isDigit(b))
            {
            	d=d+b;
             }
		}
		for (int i=0; i<a.length(); i++) 
		{ 
            char c=a.charAt(i);
			 if(!(Character.isLetter(c))&& (!(Character.isDigit(c)))) {
				 e=e+c;
		        }
        }
		System.out.println(d);
		System.out.println(e);
		
		int op=Character.getNumericValue(d.charAt(0));
		for(int i=0;i<e.length();i++){
			switch(e.charAt(i)) {
			case '+':
				op	=op+Character.getNumericValue(d.charAt(i+1));
				break;
				
			case '-':
				 op	=op-Character.getNumericValue(d.charAt(i+1));
				 break;
			case '*':
				 op =op*Character.getNumericValue(d.charAt(i+1));
				 break;
			case '/':
				 op =op/Character.getNumericValue(d.charAt(i+1));
				break;
			 
			}
			
		}
		System.out.println(op);
		
	}
}
