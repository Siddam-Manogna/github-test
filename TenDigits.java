package com.dxc.logical;

public class TenDigits {
	 String Digits(String str) 
    { 
		int c=0;
		char[] a=str.toCharArray();

        for (int i = 0; i < str.length(); i++) { 
        	if(a[i]>=48 && a[i]<=57) {
  
           // if (str.charAt(i) >= '0' && str.charAt(i) <= '9') { 
                c=c+1;
            } 
        } 
        if(c==10) {
        	System.out.println("valid");
        	
        	
        }
        else
        System.out.println("Invalid");
        
        return null;
    } 
  
    public static void main(String args[]) 
    { 
    	TenDigits ten=new TenDigits(); 
    	  //String str = "1238778899"; 
        ten.Digits("1238778899"); 
    } 

}
