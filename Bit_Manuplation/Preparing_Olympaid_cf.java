package BitMasking;

import java.util.Scanner;

// https://codeforces.com/contest/550/problem/B

public class Preparing_Olympaid_cf {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int l=sc.nextInt();
		int r=sc.nextInt();
		int x=sc.nextInt();
		
		int [] c= new int[n];
		
		for(int i=0;i<c.length;i++) {
			c[i]=sc.nextInt();
		}
		System.out.println(count(c, l, r, x));
	}
	public static long count(int [] arr,int l,int r,int x) {
		
		int n=arr.length;
		int ans=0;
		
		for(int i=3;i<(1<<n);i++) {
			
			if(CountSetBit(i)>=2 && isitpossible(arr,i,l,r,x)) { // redundent work CountSetBit(i)>=2.
				ans++;
			}
		}
		return ans;
	}
	public static boolean isitpossible(int [] arr,int i,int l,int r,int x) {
		
		long sum=0;
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int pos=0;
		while(i>0) {
			if((i & 1)!=0) {
				
				sum =sum+arr[pos];
				min=Math.min(min,arr[pos]);
				max=Math.max(max,arr[pos]);
			}
			pos++;
			i >>= 1;
		}
		return (sum >=l) && (sum <=r) && (max-min) >=x;
	}
	public static int CountSetBit(int n) {
		
		int ans=0;
		while(n>0) {
			
			if((n&1)!=0) 
				ans++;
			n = n>>1;
		}
		return ans;
	}
}
