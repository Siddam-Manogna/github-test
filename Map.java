
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import com.dxc.logical.Book;


public class Map {
	public static void main(String[] args) {

		Book b1=new Book(1234,"Java","ABC");
		Book b2=new Book(33445,"C","XYZ");
		Book b3=new Book(67888,"C++","EFG");
		//Book b4=new Book(78999,"Python","STR");
		


		HashMap<Integer, Book> hm=new HashMap();

		hm.put(b1.getIsbn(), b1);
		hm.put(b2.getIsbn(), b2);
		hm.put(b3.getIsbn(), b3);
       //Scanner sc=new Scanner(System.in);
        // int s=Integer.parseInt(args[0]);
		Book bk= hm.get(1234);

		System.out.println(bk);
		Set<Integer> keys=hm.keySet();
		Iterator<Integer> itr=keys.iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			System.out.println(key+" "+hm.get(key));
		}
		

		}



		}



