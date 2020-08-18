package com.dxc.logical;

public class ThreadDemo1 extends Thread {

	public void run() {
		System.out.println("run method");
		System.out.println("run method "+Thread.currentThread().getName());
		}
	public static void main(String[] args) {
		ThreadDemo1 td=new ThreadDemo1();
		td.start();
		System.out.println("main method "+Thread.currentThread().getName());
		}

		}

