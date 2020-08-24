
public class Practise {
	 int x=100;
	 
	Practise(){
	 x=10;
	 }
	 
	 void myMeth()
		{
		  int x=50;
		System.out.println(x); // 50
		System.out.println(this.x); //10
		}
	void disp() {
		System.out.println(x); //10
	}
	public static void main(String args[]) {
		Practise p=new Practise();// x=10
		p.myMeth();// 50   --- 10
		p.disp();
	}
}
