// maximum power if n is given and k is given 
// use binary search to find this solution

public class Maximum_power {
	
	public static void main(String [] args)
	{
		int n=43;
		int k=3;
		
		int ans=Kth_Root(n,k);
		
		System.out.println(ans);
	}
	public static int Kth_Root(int n,int k)
	{
		int low=1;
		int high=n;
		int ans=0;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			
			if(Math.pow(mid, k)<=n)
			{
				ans=mid;
				low=mid+1;
			}
			else
			{
				high=mid-1;
			}
		}
		return ans;
	}
}
