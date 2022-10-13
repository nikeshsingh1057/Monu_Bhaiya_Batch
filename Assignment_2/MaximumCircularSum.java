//You are provided n numbers (both +ve and -ve). Numbers are arranged in a circular form. You need to find the maximum sum of consecutive numbers.

           /* method 1st brute force approch simple but give TLE */
import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int ans=Integer.MIN_VALUE;
            
            for(int i=0;i<n;i++)
            {
                int start=(i+1)%n;  //we do not do directly (start = i ) because we have to start circular form i+1 and to avoid last element out of index we do this. 
                int sum=arr[i];
                ans=Math.max(ans,sum);
                
                while(start!=i)
                {
                    sum+=arr[start];
                    ans=Math.max(ans,sum);
                    start=(start+1)%n;
                }
            }
            System.out.println(ans);
        }

    }
}
