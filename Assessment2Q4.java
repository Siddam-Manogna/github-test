package com.dxc.logical;

class CustomException extends RuntimeException{

public CustomException() {
super("Not Valid. Please Enter Valid Marks between 0 and 100");
}
}

class Marks
{
void Stumarks(int Marks)
{
if(Marks > 100)
throw new CustomException();

else

System.out.println("Marks obtained by the Student:"+Marks);

}

}


public class Assessment2Q4 {

public static void main(String[] args) {
	Marks a=new Marks();

try{
a.Stumarks(100);
}
catch (Exception e) {
//e.printStackTrace();
System.out.println(e);
}

}

}
