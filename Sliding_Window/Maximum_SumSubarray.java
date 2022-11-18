public class Maximum_SumSubarray {

	public static void main(String[] args) {
		
		int arr[]= {2,1,15,15,1,2,1,7,8,2,4};
		int k=3;
		
		int ans=sliding(arr,k);
		System.out.println(ans);
	}
	public static int sliding(int[] arr,int k)
	{
		int ans=0;
		int sum=0;
		
		for(int i=0;i<k;i++)
			sum+=arr[i];
		
		for(int j=3;j<arr.length;j++)
		{
			sum+=arr[j]-arr[j-k];
			ans=Math.max(ans, sum);
		}
		return ans;
	}
}
