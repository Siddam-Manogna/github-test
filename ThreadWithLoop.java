 class  Thread2  implements Runnable{

@Override
public void run() {
for(int i=0;i<10;i++)
{
System.out.println("THREAD 1 CLASS "+Thread.currentThread().getName());

try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}

}

}


public class ThreadWithLoop implements Runnable{

@Override
public void run() {
for(int i=0;i<10;i++)
{
System.out.println("ThreadDemo1 CLASS "+Thread.currentThread().getName());

try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
}

}

public static void main(String[] args) {

	ThreadWithLoop demo1=new ThreadWithLoop();
Thread2 thd1=new Thread2();


Thread t1=new Thread(demo1,"my thread");
Thread t2=new Thread(thd1,"new Thread");
t1.start();
t2.start();
// run run
}

}
