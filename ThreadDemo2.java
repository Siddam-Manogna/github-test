package com.dxc.logical;

public class ThreadDemo2 extends Thread{
@Override
public void run() {
System.out.println("run method");
System.out.println("run method "+Thread.currentThread().getName());
}
public static void main(String[] args) {
ThreadDemo2 td=new ThreadDemo2();
//td.start();// dead
//td.start();

td.run();
td.run();
td.run();


System.out.println("main method "+Thread.currentThread().getName());
}

}