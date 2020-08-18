package com.dxc.logical;

public class Assesment2Q2 {
	public static void main(String[] args) {
		String a="This Is Java Programming";
		String[] b = a.split(" "); 
        for (int i=0;i<b.length;i++) {
        	String c=b[i];
        	StringBuilder sb=new StringBuilder(c);
        	System.out.println(sb.reverse());
        	
        	
        }
            
       
	}

}
