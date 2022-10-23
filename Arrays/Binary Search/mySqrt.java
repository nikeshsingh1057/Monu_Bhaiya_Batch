// find the squre root using binary Search
// same as kth root just remove k=2
// Type 1--> if return in form of int.
class Solution {
    public int mySqrt(int x) {
      
        return BinarySearch(x);
    }
    public static int BinarySearch(int x)
    {
        int low=1;
        int high=x;
        int k=2;    // since num power 2 == x;
        int ans=0;
        while(low<=high)
        {
            int n=low+(high-low)/2; // here n is act as mid;
            
            if(Math.pow(n,k)<=x)
            {
                ans=n;
                low=n+1;
            }
            else
                high=n-1;
        }
        return ans;
    }
}

// type 2 --> if return in double with given precision.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner S = new Scanner(System.in);
        int t =S.nextInt();

        while(t-->0){

            long n = S.nextLong();
            long lower = 1;
            long higher = n;
            double root=0.0;
            while(lower<=higher){

                long mid =lower + (higher-lower)/2;
                if(mid*mid <= n)
                {
                    root=mid;
                    lower=mid+1;
                }
                else
                {
                    higher = mid - 1;
                }

            }
            double incr=0.1;
            for(int i=0;i<4;i++)
            {
                while(root*root<=n)
                {
                    root+=incr;
                }
                root-=incr;
                incr/=10;
            }
            System.out.printf("%.4f\n",root);
        }

    }
}
