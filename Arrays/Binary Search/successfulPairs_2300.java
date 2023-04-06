// very important binarysearch questions.  leetcode 2300 Successful Pairs of Spells and Potions

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        Arrays.sort(potions);
        
        int ans[]= binary(spells,potions,success);
        return ans;
    }
    
    public static int[] binary(int arr [] ,int [] pot,long suc)
	{
       int ans[]=new int[arr.length];
        
	   for(int i=0;i<arr.length;i++)
       {
           int x=arr[i];
           
           int low=0,high=pot.length-1;// here low and high maintain range of pot. array.
           
           while(low<=high)
           {
               int mid = low+(high-low)/2;
               
               long prod= (long) x * pot[mid];
               
               if(prod>=suc)
                   high=mid-1;
               else
                   low=mid+1;
           }
           
           ans[i]=pot.length-low;
       }
       return ans;
	}
}
