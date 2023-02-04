package BackTracking;

import java.util.*;

public class Palindrome_Partitioning {
	
	public static void main(String[] args) {
		
		String str="nitin";
		
		List<String> ll=new ArrayList<>();
		List<List<String>> ans=new ArrayList<>();
		
		Palindrome(str,ll,ans);
		
		System.out.println(ans);
		
	}
	public static void Palindrome(String str,List<String> ll,List<List<String>> ans)
	{
		if(str.length()==0)
		{
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for(int i=1;i<=str.length();i++)
		{
			String part=str.substring(0,i);// agar part palindrome hai to he call lagega (yani tabhi palindrome hoga).
			
			String ros=str.substring(i);     // ros -> rest of string
			
			if(checkPalendrom(part)==1) {
			
				ll.add(part);
				Palindrome(ros,ll,ans);
				
				ll.remove(ll.size()-1);
			}
		}
	}
	public static int checkPalendrom(String part)
	{
		int i=0,j=part.length()-1;
		
		while(i<j)
		{
			if(part.charAt(i)!=part.charAt(j))
				return 0;
			i++;
			j--;
		}
		return 1;
	}
}

// [[n, i, t, i, n], [n, iti, n], [nitin]]
