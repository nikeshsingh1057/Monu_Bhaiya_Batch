//Given an array Arr[], Treat each element of the array as the digit and whole array as the number. Implement the next permutation, which rearranges numbers into the numerically next greater permutation of numbers.
// leetcode 31

import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        {
            while(t--!=0)
            {
                int n=sc.nextInt();
                int arr[]=new int[n];
                for(int i=0;i<n;i++)
                    arr[i]=sc.nextInt();
                
                nextPermutation(arr);

                for(int i=0;i<n;i++)
                    System.out.print(arr[i]+" ");
                System.out.println();
            }
        }
        
    }
    public static void nextPermutation(int arr[])
    {
        int index1=-1;
        int index2=-1;
        
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]<arr[i+1])
            {
                index1=i;
                break;
            }
        }
        
        if(index1==-1)
        {
            swap(arr,0,arr.length-1);
            return;
        }
        
        for(int i=arr.length-1;i>=0;i--)
        {
            if(arr[i]>arr[index1])
            {
                index2=i;
                break;
            }
        }
        //swap index1 and index2
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        
        swap(arr,index1+1,arr.length-1);
    }
    public static void swap(int arr[] ,int i,int j)
    {
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
