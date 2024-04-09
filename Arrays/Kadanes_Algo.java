// Kadanes_Algo to find maximum sum subarray.

public class Kadanes_Algo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { -2, -5, -6, -5, -7 };
		System.out.println(maxsum(arr));

	}

	public static int maxsum(int[] arr) {
    
		int ans = Integer.MIN_VALUE;// -2^31
		int sum = 0;
    
		for (int i = 0; i < arr.length; i++)
    		{
			 sum += arr[i];
			 ans = Math.max(ans, sum);
			if (sum < 0) 
       			{
				sum = 0;
			}
		}
		 return ans;

	 }

}

/* question based on kadhan's algo */

//1.   https://codeforces.com/contest/1899/problem/C
//2.   https://www.geeksforgeeks.org/problems/largest-sum-subarray-of-size-at-least-k3121/1
//3.   maximum subarray sum in circular array leetcode_918

//2nd  ka answer

class GFG {

// function to find the largest subarray sum
// with atleast k elements in it
// using Kadane's algorithm
static long maxSumWithK(long[] a, long n, int k)
{

	// calculating sum of the first k elements
	// of the array
	long sum = 0;
	for (int i = 0; i < k; i++) {
	sum += a[i];
	}

	long last = 0;
	int j = 0;
	long ans = Long.MIN_VALUE;
	ans = Math.max(ans, sum);

	// iterating over the subarrays
	// and updating the sum accordingly
	for (int i = k; i < n; i += 1) {
	sum = sum + a[i];
	last = last + a[j++];

	// using sliding window
	// to update the ans
	ans = Math.max(ans, sum);
	if (last < 0) {
		sum = sum - last;
		ans = Math.max(ans, sum);
		last = 0;
	}
	}
	return ans;
}
public static void main(String[] args) {
	long[] arr = { 1, 2, 3, -10, -3 };
	int k = 4;
	long n = arr.length;

	// Function Call
	System.out.println(maxSumWithK(arr, n, k));
}
}


