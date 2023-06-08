// merge sort algrothim method 1 gfg.

package Arrays;

import java.util.Arrays;

public class Merge_Sort {

	public static void main(String[] args) {
		
		int [] arr= {2,70,9,1,500,0,-1,56};
		divide(arr,0,arr.length-1);
		System.out.print(Arrays.toString(arr));
	}
	public static void divide(int [] arr,int si,int ei)
	{
		if(si==ei)
			return;
		
		int mid=si+(ei-si)/2;
		divide(arr,si,mid); // left part ko break karne ke liye
		divide(arr,mid+1,ei); // right part ko break karne ke liye
		MergeTwoArray(arr,si,mid,ei);
	}
	public static void MergeTwoArray(int[] arr,int si,int mid,int ei)
	{
		int k=0;
		int i=si;
		int j=mid+1;
		int merge[] = new int[ei-si+1];
		
		while(i<=mid && j<=ei)
		{
			if(arr[i]<=arr[j]) {
				
				merge[k++]=arr[i];
				i++;
			}
			else{
				
				merge[k++]=arr[j];
				j++;
			}
		}
		while(i<=mid)
			merge[k++]=arr[i++];
		
		while(j<=ei)
			merge[k++]=arr[j++];
		
		// copying element in original array.
		
		for(i=0;i<merge.length;i++) {  // merge ko i se chala rahe becaue data 0 index na milega.
			arr[si++]=merge[i];        // copy karne ke liye si use ka
		} 
	}
}
