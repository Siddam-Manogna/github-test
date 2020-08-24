
 class Thread12 implements Runnable{

@Override
public void run() {
System.out.println("THREAD 1 CLASS "+Thread.currentThread().getName());
}
}


public class TwoThreadson2Instances implements Runnable{

@Override
public void run() {
System.out.println(Thread.currentThread().getName());
}


public static void main(String[] args) {
	TwoThreadson2Instances demo1=new TwoThreadson2Instances();
Thread12 thd1=new Thread12();


Thread t1=new Thread(demo1,"my thread");
Thread t2=new Thread(thd1,"new Thread");
t1.start();
t2.start();

}

} 