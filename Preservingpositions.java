

public class Preservingpositions {
	public static void main(String[] args) {
		String a="HeLloWorld";
		char[] b=a.toCharArray();
		String c="";
		for(int i=a.length()-1;i>=0;i--)
		{
			c+=b[i];
		}
		System.out.println(c); 
	}
	 

}
