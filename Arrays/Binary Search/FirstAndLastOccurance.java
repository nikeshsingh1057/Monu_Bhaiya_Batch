// Given a sorted array with possibly duplicate elements, the task is to find indexes of first and last occurrences of an element x in the given array. 

import java.util.*;
public class Main {
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int ans[]={-1,-1};

        binarySearch(arr,ans,x);

        System.out.println(ans[0]+" "+ans[1]);
    }
    public static void binarySearch(int[] arr,int [] ans,int tar)
    {
        int low=0,high=arr.length-1;
        // aage wala jaha last equal milta waha tak store karne ke liye.
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(tar==arr[mid])
            {
                ans[1]=mid;
                low=mid+1;

                continue; // important line hai
            }
            if(tar<arr[mid])
                high=mid-1;
            else
                low=mid+1;

        }

        low=0;
        high=arr.length-1;
        // piche wala jaha last equal milta waha tak store karne ke liye.
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(tar==arr[mid])
            {
                ans[0]=mid;
                high=mid-1;

                continue;  // important line hai
            }
            if(tar<arr[mid])
                high=mid-1;
            else
                low=mid+1;

        }
    }
}
