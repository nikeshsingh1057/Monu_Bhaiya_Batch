package BackTracking;

import java.util.*;

public class partationString {
	
	public static void main(String[] args) {
		
		String str="abc";
		
		List<String> ll=new ArrayList<>();
		List<List<String>> ans=new ArrayList<>();
		
		ParatationString(str,ll,ans);
		
		System.out.println(ans);
		
	}
	public static void ParatationString(String str,List<String> ll,List<List<String>> ans)
	{
 		if(str.length()==0)
		{
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for(int i=1;i<=str.length();i++)
		{
			String part=str.substring(0,i);
			
			String ros=str.substring(i);     // ros -> rest of string
			
			ll.add(part);
			ParatationString(ros,ll,ans);
				
			ll.remove(ll.size()-1);
		}
	}
}

// [[a, b, c], [a, bc], [ab, c], [abc]]
