// Product of Array Except Self
// method 1st .
import java.util.Arrays;

public class leetcode238 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4};
		
		System.out.println(Arrays.toString(solve(arr)));
	}
	public static int[] solve(int arr[])
	{
		int left[]=new int[arr.length];
		
		left[0]=1;
		for(int i=1;i<arr.length;i++)
		{
			left[i]=left[i-1]*arr[i-1];
		}
		
		int right[]=new int[arr.length];
		
		right[arr.length-1]=1;
		for(int i=arr.length-2;i>=0;i--)
		{
			right[i]=right[i+1]*arr[i+1];
		}
		// now finally multiply both left right and right;
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=left[i]*right[i];
		}
		return arr;
	}
}

// method 2nd using division operator

class Solution {
    public int[] productExceptSelf(int[] arr) {
      
        int nums[]=new int[arr.length];
        int product=1;
        int zero=0;
        int index_zero=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                zero++;
                index_zero=i;
            }
            
            if(arr[i]!=0)
                product*=arr[i];
            
        }
        if(zero>=2)
        {
            return nums;
        }
        else if(zero==1)
        {
            nums[index_zero]=product;
            return nums;
        }
        for(int i=0;i<arr.length;i++)
        {
            nums[i]=product/arr[i];
        }
        return nums;
    }
}
