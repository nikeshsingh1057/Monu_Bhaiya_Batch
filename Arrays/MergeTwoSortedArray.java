// merge two sorted Array.

import java.util.*;

public class MergeSortedArray {

	public static void main(String[] args) {
		
		int arr[]= {3,5,7,9,11};
		int arr1[]= {1,2,3,4,5,6,7};
		
		int ans[]=MergeTwoArray(arr,arr1);
		
		System.out.print(Arrays.toString(ans));

	}
	public static int[] MergeTwoArray(int[] arr,int []arr1)
	{
		int k=0;
		int i=0;
		int j=0;
		int ans[]=new int[arr.length+arr1.length];
		
		while(i<arr.length && j<arr1.length)
		{
			if(arr[i]<arr1[j]) {
				
				ans[k++]=arr[i];
				i++;
			}
			else if(arr[i]>arr1[j]) {
				
				ans[k++]=arr1[j];
				j++;
				
			}
//			else if(arr[i]==arr1[j]) {
//				
//				ans[k++]=arr[i];
//				i++;
//			}
		}
		while(i<arr.length)
			ans[k++]=arr[i++];
		
		while(j<arr1.length)
			ans[k++]=arr[j++];
		
		return ans;
	}
}
