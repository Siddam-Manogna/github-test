package com.dxc.logical;

public class Task {
	void StringRev() 
	{
		String a="Hello";
		String b=" ";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);	
		}
		System.out.println(b);		
	}
	void ChangeCase() {
		String a="HELLO";
		String b="hello";
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
	}
	void Toggle() {
		String a="HeLLo";
		char[] arr=a.toCharArray();
		for(char b:arr) {
			if(Character.isUpperCase(b)){
				b= Character.toLowerCase(b);
			}
			else if(Character.isLowerCase(b)){
			    b= Character.toUpperCase(b);
			}
			System.out.print(b);
			
		}
	}
	
	 String toreversecase(String data)
	 {

	 char arr[]=data.toCharArray();
	 char arr1[]=new char[arr.length];

	 for(int i=0;i<arr.length;i++)
	 {
	 arr1[i]=arr[arr.length-i-1];

	 }
	 for(int i=0;i<arr.length;i++)
	 {
	 if(arr1[i]>='A' && arr1[i]<='Z')
	 {
	 arr1[i]=(char)((int)arr1[i]+32);
	 }
	 }

	 for(int j=0;j<arr.length;j++)
	 {

	 if(arr[j]>'A' && arr[j]<='Z')
	 {
	 arr1[j]=(char)((int)arr1[j]-32);
	 }
	 }
	  String s=new String(arr1);
	 return s;
	 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task task=new Task();
		task.StringRev();
		task.ChangeCase();
		task.Toggle();
		System.out.println(task.toreversecase("HeLloWorld"));
	}

}
