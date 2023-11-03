package DynamicProgramming;

// LIS using method 2 (binary search method se ).
public class Longest_Increasing_subsequence_II {

	public static void main(String[] args) {
		
		int [] arr= {10,9,2,5,3,7,101,18};
		int ans=lis(arr);
		System.out.println(ans);
	}
	public static int lis(int [] arr) {
		
		int [] dp=new int[arr.length];
		dp[0]=arr[0];
		int len=1;
		
		for(int i=1;i<dp.length;i++) {
			
			if(dp[len-1]<arr[i]) {
				dp[len]=arr[i];
				len++;
			}
			else {
				int idx=BinarySearch(dp,0,len-1,arr[i]);
				dp[idx]=arr[i];
			}
		}
		return len;
	}
	public static int BinarySearch(int [] dp,int si,int ei,int item) {
		
		int idx=0;
		while(si<=ei) {
			
			int mid=si+(ei-si)/2;
			if(dp[mid]>item) {
				idx=mid;
				ei=mid-1;
			}
			else {
				si=mid+1;
			}
		}
		return idx;
		
	}
}
