package com.dxc.logical;
import java.util.*;
public class JumbleWords
{
	public static void main(String[] args) 
	{
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter a String:");
		String a=sc1.nextLine();
		System.out.println("Enter the input:");
		int input=sc1.nextInt();
		String[] b = a.split(" ");
		
        for (int k=0;k<b.length;k++)
        {
			String c=b[k];
			char arr[ ]=c.toCharArray();
			
		 if(input==1 && c.length()%2!=0) 
		 {
			for(int i=0;i<c.length();i+=2) 
			{
				System.out.print(arr[i]);
			}
			for(int j=c.length()-2;j>0;j-=2)
			{
				System.out.print(arr[j]);	
			}
			System.out.print(" ");
		}
		 
		else if(input==1 && c.length()%2==0)   
		{
				for(int i=0;i<c.length();i+=2) 
				{
					System.out.print(arr[i]);
			     }
				for(int j=c.length()-1;j>0;j-=2) 
				{
					System.out.print(arr[j]);
				}
				System.out.print(" ");
		}
		 
		else if(input==2 && c.length()%2!=0)
		{
			for(int i=0;i<c.length();i+=2) 
			{
				System.out.print(arr[i]);	
			}
			for(int j=1;j<c.length()-1;j+=2) 
			{
				System.out.print(arr[j]);
			}
			System.out.print(" ");
		}
		 
		else    
		{
				for(int i=0;i<c.length();i+=2) 
				{
					System.out.print(arr[i] );	
			     }
				for(int j=1;j<c.length();j+=2) {
					System.out.print(arr[j]);	
				}
		}
	}

	}
}

