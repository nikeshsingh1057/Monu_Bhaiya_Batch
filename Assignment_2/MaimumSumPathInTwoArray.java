// Maximum Sum Path in Two Arrays

import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();

            int arr[]=new int [n];
            int arr2[]=new int [m];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            for(int i=0;i<m;i++)
                arr2[i]=sc.nextInt();
            
            int sum1=0;
            int sum2=0;
            int ans=0;
            int i=0,j=0;
            while(i<n && j<m)
            {
                if(arr[i]<arr2[j])
                    sum1+=arr[i++];
                
                else if(arr[i]>arr2[j])
                    sum2+=arr2[j++];

                // if common point found
                else
                {
                    ans += Math.max(sum1,sum2)+arr[i];
                    sum1 = 0;
                    sum2 = 0;

                    i++;  //incerement after adding common point.
                    j++;
                }
            }
            // left element if array if size is different.
            while(i<n)
                sum1 += arr[i++];
            while(j<m)
                sum2 += arr2[j++];

            ans += Math.max(sum1,sum2);

            System.out.println(ans);
        }
    }
}
