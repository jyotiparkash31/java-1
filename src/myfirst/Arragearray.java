package myfirst;
import java.util.Arrays;
public class Arragearray {

	public static void main(String[] args) {
		arrange();
	}
    static void arrange()
    {
    	int[] arr = {-3,4,-4,7,-1,3,};
		int temp;
		int j=0;
		System.out.println("original array is :- "+Arrays.toString(arr));
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>0)
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}			
		}
		System.out.println("new array :-"+ Arrays.toString(arr));
    }
}
