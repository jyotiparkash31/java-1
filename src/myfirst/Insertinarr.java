package myfirst;
import java.util.*;

public class Insertinarr {

	public static void main(String[] args) {
		 printMatrix();
		
	}
	public static void insEleInArray()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the position");
		int pos = sc.nextInt();
		System.out.println("Enter the number to add:");
		int num = sc.nextInt();
		
		
		int[] a= {20,45,67,43,54};
		int j=0;
		int[] newArray = new int[a.length+1];
		for(int i=0;i<newArray.length;i++)
		{
			if(i==pos)
			{
				newArray[i]=num;
			}
			else
			{
				newArray[i]=a[j];
				j++;
			}
		}
		System.out.println("new array is:");
		for(int x1:newArray)
			System.out.println(x1);
		 
		sc.close();
	}
	public static void maxElement()
	{
		int [] m= {7,45,80,23,11,69,2,12};
		int max=m[0];
		for(int i=0;i<m.length-1;i++)
		{
			if (max<m[i+1])
				max=m[i+1];
			
		}
		System.out.println(max);
		int secmax=m[0];
		if(secmax==max)
		{
			secmax=m[1];
		}
		for(int i=0;i<m.length-1;i++)
		{
			if(m[i]<max)
			{
				if(secmax<m[i])
					secmax=m[i];
			}
			
				
		}
		System.out.println(secmax);
	}
	public static void reverseArray()
	{
		int [] a= {23,78,65,9,56};
		int [] revArray=new int[a.length];
		int j=0;
		for(int i=revArray.length-1;i>=0;i--)
		{
			revArray[j++]=a[i];
		}
		for( int x1:revArray)
			System.out.println(x1);
	}
	public static void printMatrix()
	{
		Scanner in=new Scanner(System.in);
		int [][]arr=new int [3][3];
		System.out.println("Enter the elment in matrix:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			  arr[i][j]=in.nextInt();
			}
		}
		for(int []x1:arr)
		{
			for(int x2:x1)
			{
				System.out.print(x2+"\t");
			}
			System.out.println();
		}
		
		in.close();
	}

}
