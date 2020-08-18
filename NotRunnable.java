package com.dxc.logical;

public class NotRunnable extends Thread{
	@Override
	public void run() {

	System.out.println("run method");
	System.out.println("run method "+Thread.currentThread().getName());

	for(int i=0;i<10;i++)
	{
	System.out.println(i);

	try {
	Thread.sleep(1000);
	} catch (InterruptedException e) {

	e.printStackTrace();
	}
	}
	}
	public static void main(String[] args) {
	NotRunnable td=new NotRunnable();
	td.start();

	System.out.println("main method "+Thread.currentThread().getName());


	}

	}



