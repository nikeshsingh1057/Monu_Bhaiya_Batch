// Allocate minimum number of pages 
class Solution 
{
    public static int findPages(int[]arr,int N,int m)
    {
        if(m>N)
            return -1;
            
        int sum=0;
        int ans=-1;
        
        for(int i=0;i<N;i++){
            sum+=arr[i];
        }
        int s=0,e=sum;
        int mid=s+(e-s)/2;
        
        while(s<=e)
        {
            if(isitpossible(arr,mid,m)==true)
            {
                ans=mid;
                e=mid-1;
            }
            else
                s=mid+1;
                
             mid=s+(e-s)/2;
        }
        return ans;    
    }
    public static boolean isitpossible(int[] arr,int mid,int m)
    {
        int pgsum=0; // count sum
        int k=1;
        
        for(int i=0;i<arr.length;i++)
        {
            if((pgsum+arr[i])<=mid){
                
                pgsum += arr[i];
            }
            else{
                
                k++;
                if(k>m || arr[i]>mid)  {   // agar element mid se jayada 
                    return false;
                }
                
                pgsum=arr[i];
            }
        }
        return true;
    }
};
