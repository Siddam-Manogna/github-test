
public class TwoThreadsonsameinstance  implements Runnable{

@Override
public void run() {
System.out.println(Thread.currentThread().getName());
}


public static void main(String[] args) {

	TwoThreadsonsameinstance demo1=new TwoThreadsonsameinstance();

Thread t1=new Thread(demo1,"my thread");
Thread t2=new Thread(demo1,"new Thread");
t1.start();
t2.start();

}

}
