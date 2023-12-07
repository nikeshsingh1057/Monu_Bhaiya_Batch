// https://www.spoj.com/problems/PRATA/

import java.util.*;
public class Main {
    public static void main(String args[]) {

		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		int c=sc.nextInt();
		int arr[]=new int[c];

		for(int i=0;i<c;i++)
			arr[i]=sc.nextInt();
		
		int low=0;
		int high=100000009;
		int ans=-1;

		while(low<=high){

			int mid=low+(high-low)/2;

			if(isitPossible(mid,arr,p)){
				ans=mid;
				high=mid-1;
			}
			else
				low=mid+1;
		}
		System.out.print(ans);
    }
	public static boolean isitPossible(int mid,int [] arr,int p){
		
		int pratha=0;
		int time=0;
		for(int i=0;i<arr.length;i++){

			time=arr[i];
			int j=2;
			while(time<=mid){

				pratha++;
				time=time+(arr[i]*j);
				j++;
			}
			if(pratha>=p)
				return true;
		}
		return false;
	}
}
