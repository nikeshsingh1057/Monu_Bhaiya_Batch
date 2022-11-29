// subarray product Less Than k

package Sliding_Window;

public class product_LessThan_k {

	public static void main(String[] args) {
		
		int arr[]= {9,9,7,90};
		int k=10;
		System.out.println(CountSubArray(arr,k));
	}
	public static int CountSubArray(int[] arr,int k)
	{
		int ans=0;
		int i=0;
		int j=0;
		int p=1;
		
		while(i<arr.length)
		{
			p=p*arr[i];
			while(p>=k && i>=j)
			{
				p/=arr[j];
				j++;
			}
			ans+=i-j+1;
			i++;
		}
		return ans;
	}
}
