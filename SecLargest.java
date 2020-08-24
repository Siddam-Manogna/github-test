import java.util.*;
public class SecLargest {
		public static int getSecondLargest(int[] a, int total)
		{  
			Arrays.sort(a); 
			System.out.println(Arrays.toString(a));
			return a[total-8];  
			}  
			public static void main(String args[]){  
			int a[]={7,3,4,5,8,2,9,1};   
			SecLargest sl=new SecLargest();
			
			System.out.println(sl.getSecondLargest(a,8));

	}

}
