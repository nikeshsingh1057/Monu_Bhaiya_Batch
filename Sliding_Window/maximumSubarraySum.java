// Maximum Sum of Distinct Subarrays With Length K.

class Solution {
    public long maximumSubarraySum(int[] arr, int k) {
        
        HashSet<Integer> hs=new HashSet<>();
        
        int i=0,j=0;
        long sum=0,ans=0;
        
        while(i<arr.length)
        {
            if(hs.contains(arr[i])==false) {
               
              
                    
                    hs.add(arr[i]);
                    sum += arr[i];
                
                
                if(hs.size()==k)
                    ans=Math.max(ans,sum);
                
                else if(hs.size()>k){
                    
                    sum -= (arr[j]+arr[i]);  // here we reduce sum .
                    hs.remove(arr[j]);
                    hs.remove(arr[i]);     // to avoid repetitions or re-adding of element in HashSet.
                    j++;
                    continue;
                }
                
                i++;
            }
            
            else{     // if dublicate element is present in HashSet than we shrink our Set 
                
                sum -= arr[j];
                hs.remove(arr[j++]); 
            }
         
        }
        return ans;
    }
}
