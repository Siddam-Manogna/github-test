package com.dxc.logical;

import java.util.Scanner;
//fo+23the3*like2+
public class wtn {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String a=sc.nextLine(); 
		String d=" ";
		String e=" ";
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
		char[] x=d.toCharArray();
		char[] y=e.toCharArray();
		int op=0;
		for(int i=0;i<d.length()-1;i++){
			switch(y[i]){
			case '+': 
			if(i==0){
			op=x[i]+x[i+1];
			i++;
			}
			else{
			op=op+x[i];
			}
			break;
			
			case '-': 
				if(i==0){
				op=x[i]-x[i+1];
				i++;
				}
				else{
				op=op-x[i];
				}
		break;
			case '*': 
				if(i==0){
				op=x[i]*x[i+1];
				i++;
				}
				else{
				op=op*x[i];
				}
				break;
			case '/': 
				if(i==0){
				op=x[i]/x[i+1];
				i++;
				}
				else{
				op=op/x[i];
				}
				break;
				
			}
			
			}
		System.out.println(op);
		//System.out.println(y);
		
	}
}


