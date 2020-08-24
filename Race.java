package com.dxc.logical;
class Tortoise implements Runnable
{
	public void run() {
		for(int i=0;i<=100;i++) {
			System.out.println("Tortise "+i);

		try {
		Thread.sleep(200);
		} 
		catch (InterruptedException e) 
		{
		e.printStackTrace();
		}
	
		}
	}
}
 class Hare  implements Runnable
 {
		public void run() 
		{
			for(int i=0;i<=100;i++) 
			{
				System.out.println("Hare "+i);
				try {
					Thread.sleep(100);
					} 
					catch (InterruptedException e) 
					{
					e.printStackTrace();
					}
				
				if(i==90)
				{				
					try {
						Thread.sleep(5000);
						} 
						catch (InterruptedException e) 
						{
						e.printStackTrace();
						}
				}
				
					
			}
			
		}
 }

	

public class Race implements Runnable {
	public void run() {
		System.out.println("Main CLASS "+Thread.currentThread().getName());
	}
	public static void main(String[] args) {
	Tortoise t=new Tortoise();
	Hare h=new Hare();
	Thread t1=new Thread(t);
	Thread t2=new Thread(h);
	t1.start();
	t2.start();
	while(true) {
		if(!t1.isAlive()) {
			System.out.println("Tortoise wins the race");
			t2.stop();
			break;
		}
		if(!t2.isAlive()) {
			System.out.println("Hare wins the race");
			t1.stop();
			break;
		}
		
	}
	System.out.println("Refree dies");
	
}
}