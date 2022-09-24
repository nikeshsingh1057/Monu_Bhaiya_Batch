// reverse of array in a given range

import java.util.Arrays;

// reverse of array in a given range using two pointer.

public class rangeReverse {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,4,5,6,7,8,9,10,11,12};
		reverse(arr,0,5); // 3 and 9 is range.
		System.out.print(Arrays.toString(arr));
	}
	public static void reverse(int []arr,int i,int j)
	{
		while(i<j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}
