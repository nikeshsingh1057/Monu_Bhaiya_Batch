// You will be given an array containing only 0s, 1s and 2s. you have sort the array in linear time that is O(N) where N is the size of the array.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int low=0,mid=0,high=arr.length-1;

        while(mid<=high)
        {
            switch(arr[mid])
            {
                case 0:
                {
                    swap(arr,low,mid);
                    mid++;
                    low++;
                    break;
                }
                case 1:
                {
                    mid++;
                    break;
                }
                case 2:
                {
                    swap(arr,mid,high);
                    high--;
                    break;
                }

            }
        }
        for(int i=0;i<n;i++)
        System.out.println(arr[i]);
        
    }
    public static void swap(int [] arr,int i,int j)
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    } 
}
