package com.dxc.logical;

public class DelDupEleInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,3,3,4,4,5};
for(int i=0;i<a.length-1;i++) {
	for(int j=i+1;j<a.length;j++) {
		if(a[i]==a[j]) {
			//System.out.println(a[j]);
			a[i]=0;
		}
	}
	
}
for(int i=0;i<a.length;i++) {
	System.out.print(a[i]+" ");
}
	}

}
