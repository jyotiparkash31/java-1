package myfirst;
import java.util.*;
public class LinearSearch 
{
   public static void main(String[] args)
   {
	   Scanner sc= new Scanner(System.in);
	  int[] a= {23,45,65,76,87};
	  int len=a.length-1;
	  System.out.println("Enter the number to find");
	  int x=sc.nextInt();
	  sc.close();
	  int index=binaryOutRecSearch(a,0,len,x);
	  if(index==-1)
		  System.out.println("number not found");
	  else
		  System.out.println("number is found at index "+index);
	}
   public static int linearSearch()
   {
	   Scanner sc=new Scanner(System.in);
	   int [] a= {23,45,56,67,78,89};
	   System.out.println("Enter the number you want to search");
	   int x= sc.nextInt();
	   sc.close();
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i]==x)
			   return i;
	   }
	   return -1;  
   }
  public static int binarySearch(int a[],int l,int h,int x)
  {   
	  int mid;
	  
	  if(h>=l)
	  {
		mid =1+(h-l)/2;  
		if(a[mid]==x)
			return mid;
		else if(x>a[mid])
			return binarySearch(a,mid+1,h-1,x);
		else 
			return binarySearch(a, l,mid-1,x);		
	  }
	  return -1;
  }
  public static int binaryOutRecSearch(int[] a,int l, int h,int x)
  {
	  
	  while(l<=h)
	  { 
		  int mid= 1+(h-l)/2;
		  if(a[mid]==x)
			  return mid;
		  else if(x>a[mid])
			  l=mid+1;
		  else
			  h=mid-1;	  
	  }
	  return -1;
  }
		 
}  


