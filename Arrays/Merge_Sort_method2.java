// merge sort method 2
package Arrays;

import java.util.Arrays;

public class Merge_sort_method2 {

	public static void main(String[] args) {
		
		int [] arr= {2,7,9,1,500,0,-1,56,100};
		
		arr=dividing(arr,0,arr.length-1);
	    System.out.print(Arrays.toString(arr));
	}
	public static int [] dividing(int[] arr,int lo,int hi) {
		
		if(lo==hi) {
			
			int a[]=new int[1];
			a[0]=arr[lo];
			return a;
		}
		int mid=lo+(hi-lo)/2;
		
		int [] left=dividing(arr,lo,mid);
		int [] right=dividing(arr,mid+1,hi);
		
		return Merge_Two_Array(left,right);
	}
	public static int [] Merge_Two_Array(int[] left, int[] right) {
		
		int merge[]=new int[left.length+right.length];
		int k=0;
		int i=0;
		int j=0;
		
		while(i<left.length && j<right.length) {
			
			if(left[i]<=right[j]) {
				merge[k++]=left[i++];
			}
			else {
				merge[k++]=right[j++];
			}
		}
		while(i<left.length)
			merge[k++]=left[i++];
		
		while(j<right.length)
			merge[k++]=right[j++];
		
		return merge;
	}
}
