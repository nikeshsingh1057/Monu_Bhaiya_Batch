// just like generate all subsequance of string type question here we also generate all subsequance of array and check.

import java.util.*;
public class Main {
    public static int count;
    public static void main(String args[]) {
        
        count=0;

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int k=sc.nextInt();
        SubsetPrint(arr,0,"",0,k);
        System.out.print("\n"+count);
    }
    public static void SubsetPrint(int arr[],int i,String ans,int sum,int k)
    {
        if(sum==k){
            count++;
            System.out.print(ans+" "); 
            return;
        }

        if(i>=arr.length)
        {
            return;
        }
        int a=arr[i];

        SubsetPrint(arr, i+1, ans+a+" ",sum+a,k);
        SubsetPrint(arr, i+1, ans,sum,k);
       
        
    }
}
