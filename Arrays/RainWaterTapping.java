// rain water water tapping leetcode 42

public class RainWaterTapping_leetcode42 {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,0,19,23};
		System.out.println(solve(arr));
	}
	public static int solve(int [] arr)
	{
		int left[]=new int[arr.length];
		left[0]=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			left[i]=Math.max(left[i-1],arr[i]);
		}
		
		int right[]=new int[arr.length];
		right[arr.length-1]=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			right[i]=Math.max(right[i+1], arr[i]);
		}
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			ans+=Math.min(left[i], right[i])-arr[i];
		}
		return ans;
	}
}
