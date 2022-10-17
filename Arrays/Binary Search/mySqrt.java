// find the squre root using binary Search
// same as kth root just remove k=2

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
