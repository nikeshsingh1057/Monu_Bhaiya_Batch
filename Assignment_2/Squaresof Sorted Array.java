// Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

import java.util.*;
public class Main {
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++)
            {
                int e=sc.nextInt();
                e=Math.abs(e);
                arr[i]=e;
            }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
            System.out.print(arr[i]*arr[i]+" ");
    }
}
