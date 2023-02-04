package BackTracking;

public class combination_leetcode77 {

	public static void main(String[] args) {
		
		int n=4;
		int k=2;
		combination(n,k,0,"",1);
		System.out.println();
		
		int arr[]=new int[n];
		comb(arr,k,"",0,0);
		
	}
	// method 1st 
	public static void combination(int n,int k,int count,String ans,int j)
	{
		if(count==k)
		{
			System.out.print(ans+" ");
			return;
		}
		
		for(int i=j;i<=n;i++)
		{
			combination(n,k,count+1,ans+i,i+1);
		}
	}
	// method 2nd by using queen combination method.
	public static void comb(int arr[],int k,String ans,int count,int j)
	{
		if(count==k)
		{
			System.out.print(ans+" ");
			return;
		}
		for(int i=j;i<arr.length;i++)
		{
			if(arr[i]==0) {
				
				arr[i]=1;
				comb(arr,k,ans+(i+1),count+1,i+1);
				arr[i]=0;
			}
		}
	}
}
