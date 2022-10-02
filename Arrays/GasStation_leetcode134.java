// method 1st runtime 5ms (efficient solution)

class Solution {
    public int canCompleteCircuit(int[] petrol, int[] dis) {
        
        int leftpetrol=0;
        int i=0;
        int si=0; // start index.
        int tc=0;
        
   // no need to check for all value if we get positive leftpetrol then we return from here.
   // means jaha se comulative sum positeve ho wahi index humara ans hoga.
        
        for(i=0;i<petrol.length;i++)
        {
            tc+=petrol[i]-dis[i]; //piche tak ka sum store karne ke liye
            leftpetrol+=petrol[i]-dis[i];
            if(leftpetrol<0)
            {
                leftpetrol=0;
                si=i+1;  // si=start inedx where we get positive value .(ie leftptrol or tc)
            }
        
        }
        if(tc<0)
            return -1;
        
        return si;
    }
}





// method 2nd runtime(1000 ms) brute force soution.

class Solution {
    public int canCompleteCircuit(int[] petrol, int[] dis) {
        
        int curr=0;
        int count=0,c=0;
        int i=0;
        for(;i<petrol.length;)
        {
            curr+=petrol[i]-dis[i];
            if(curr>=0)
            {
              c++;
              i=(i+1)%petrol.length;
              if(c==petrol.length){
                return i;}
            }
           
            else
            {
                curr=0;
                c=0;
                count++;
                if(count==petrol.length)
                {
                    return -1;
                }
                i=(i+1)%petrol.length;
            }
           
        }
        return -1;
        
    }
        
    
}
