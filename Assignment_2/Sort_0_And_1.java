// Sort 0 and 1 (without using sort function)

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(arr[i]==0)
            i++;
            if(arr[j]==1)
            j--;
            else{
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

                i++;
                j--;
            }
        }
        for(i=0;i<n;i++)
            System.out.print(arr[i]+" ");
        
    }
}
