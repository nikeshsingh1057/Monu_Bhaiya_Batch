//  quick_sort

package Arrays;

import java.util.Arrays;

public class quick_sort {

	public static void main(String[] args) {
	
		int [] arr= {12,7,9,1,500,0,-1,56,100};
		
		QuickSort(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
	public static  void QuickSort(int arr[], int lo, int hi) {
		
		if(lo>=hi) {
			return;
		}
		int idx=partation(arr,lo,hi);
		QuickSort(arr,lo,idx-1);
		QuickSort(arr,idx+1,hi);
	}
	public static int partation(int[] arr,int lo,int hi)
	{
		int pivot=arr[hi];
		
		int idx=lo;
		for(int i=lo;i<hi;i++)
		{
			if(arr[i]<=pivot)
			{
				int temp=arr[i];
				arr[i]=arr[idx];
				arr[idx]=temp;
				idx++;
			}
		}
		// this is for swaping last index and the element at idx.
		int temp=arr[idx];
		arr[idx]=arr[hi];
		arr[hi]=temp;
		return idx;
	}
}

