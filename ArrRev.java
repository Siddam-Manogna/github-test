package com.dxc.logical;

import java.util.Arrays;

public class ArrRev {
	public static void main(String args[]) {
		int[] a= {1,2,3,4,5};
		int temp;
		
		for(int i=0;i<a.length/2;i++) {
			temp=a[i];
			a[i]=a[a.length-i-1];
			a[a.length-i-1]=temp;
	
		}
		System.out.println(Arrays.toString(a));
		}
	

}
