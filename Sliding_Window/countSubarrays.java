//  Count Subarrays With Score Less Than K .2302

class Solution {
    public long countSubarrays(int[] arr, long k) {
    
        long count=0;
        long ans=0;
        int j=0;
        
        for(int i=0;i<arr.length;i++)
        {
            count += arr[i];
            
            while( count*(i-j+1)>=k ){ // reducing if count increase than k.
                
                 count -= arr[j++];
            }
            
            ans += i-j+1;
        }
        
        return ans;
    }
}
