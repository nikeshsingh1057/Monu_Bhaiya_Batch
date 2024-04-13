// https://leetcode.com/problems/reverse-bits/

public class Solution {
    // own
    public int reverseBits(int x) {
        
        int ans=0;
        int l=31;
        
        for(int i=0;i<32;i++){
            
            if(((x>>i)&1)==1)
                ans += Math.abs(1<<l);
            else
                ans += 0<<l;
            l--;
        }
        
        return ans;
    }
}
