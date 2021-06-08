package myfirst;
import java.util.Scanner;
public class Arraypt {
 
	public static void main(String[] args)
	{   Scanner sc =new Scanner (System.in);
	    
		int [] a = get();
		 int[] b= new int[4];
		 System.arraycopy(a,0,b,0,4);
		for(int x2:b)
			 System.out.print(x2+"\t");
		System.out.println();
		 for (int x1:a)
			 System.out.println(x1);
		  sc.close();
		
	}
	static int[] get()
	{
		return new int[] {45,7,98,65};
	}
}
