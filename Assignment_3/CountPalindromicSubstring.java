// Strings-Count Palindromic Substrings
// Brute force approch by generating all substring one by one and check for palindrome.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int ans=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length();j++)
            {
                 int c = Substring(str,i,j);    // this will generete all substring one by one.
                 if(c==1)
                 {
                    ans++;
                 }
            }
        }
        System.out.println(ans);
    }
    public static int Substring(String str,int i,int j)
	{
		while(i<=j)      // after getting last index of substring then we simply check for palendrome.
		{
			if(str.charAt(i)!=str.charAt(j))
                return 0;
            i++;
            j--;
		}
        return 1;
	}
}
