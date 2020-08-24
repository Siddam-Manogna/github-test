
public class SumOfPairsOfArray {
	static void  pairsvalue(int a[], int Number)
	  {
	  System.out.println("Pairs of elements and their sum : ");
	 
	  for (int i =  0; i < a.length; i++)
	  {
	  for (int j  = i+1; j < a.length; j++)
	  {
	  if(a[i]+a[j] == Number)
	  {
	  System.out.println(a[i]+" + "+a[j]+" =  "+Number);
	  }
	  }
	  }
	  }
	  
	  public static void  main(String[] args)
	  {
	  pairsvalue(new int[] {2, 7, 4, -5, 11, 5, 20}, 15);
	  
	  pairsvalue(new int[] {14, -15, 9, 16, 25, 45, 12, 8}, 30);
	  
	  }

}
