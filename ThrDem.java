
public class ThrDem  implements Runnable{

@Override
public void run() {
System.out.println(Thread.currentThread().getName());
}


public static void main(String[] args) {

ThrDem demo1=new ThrDem();

Thread t=new Thread(demo1,"My Thread");
t.start();

}

}
