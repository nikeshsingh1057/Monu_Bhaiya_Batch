package BackTracking;

import java.util.*;

public class subset_2 {
	
	
	
	public static void main(String[] args) {
		
		
		 List<List<Integer>> ans = new ArrayList<>();
	     List<Integer> ll= new ArrayList<>();
	      
	     int nums[]= {1,2,2};
	      Arrays.sort(nums);
	        
	     Subset_2(nums,0,ans,ll);
	     
		System.out.println(ans);
		
	}
	  public static void Subset_2(int [] arr,int idx, List<List<Integer>> ans,List<Integer> ll)
	    {
	        ans.add(new ArrayList<>(ll));
	        
	        if(idx==arr.length)
	        {
	            return;
	        }
	        
	        for(int i=idx;i<arr.length;i++)
	        {
	            if(i>idx && arr[i]==arr[i-1])  // subset ke case me pahala dublicate allow hai but dusara do discard karna hai.     i>idz because first ko rakhana his second ko discard.
	                continue;
	            
	            ll.add(arr[i]);
	            
	            Subset_2(arr,i+1,ans,ll);
	            
	            ll.remove(ll.size()-1);
	        }
	    }
}
//[[], [1], [1, 2], [1, 2, 2], [1, 2, 2, 4], [1, 2, 4], [1, 4], [2], [2, 2], [2, 2, 4], [2, 4], [4]]
