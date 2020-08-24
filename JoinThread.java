
 class Thread1 implements Runnable{

@Override
public void run() {
for(int i=0;i<10;i++)
{
System.out.println(i+"  "+Thread.currentThread().getName());

try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}

}

}


public class JoinThread implements Runnable{

@Override
public void run() {
for(int i=0;i<10;i++)
{
System.out.println(i+"  "+Thread.currentThread().getName());

try {
Thread.sleep(500);
} catch (InterruptedException e) {
e.printStackTrace();
}
}

}

public static void main(String[] args) {

	JoinThread demo1=new JoinThread();
Thread1 thd1=new Thread1();
Thread.currentThread().setPriority(6); // main 6
Thread t1=new Thread(demo1,"thread t1");
t1.setPriority(8); // t1 8

Thread t2=new Thread(thd1,"thread t2"); // main 6 t2 6
t1.start();
t2.start();
System.out.println("t1 p ->"+t1.getPriority());
System.out.println("t2 p ->"+t2.getPriority());
System.out.println("main p"+Thread.currentThread().getPriority());

try {
t1.join();
//join t1 with current thread
// current thread will wait till the joined thread completes its executtion
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

System.out.println("MAIN ENDS");

}

}