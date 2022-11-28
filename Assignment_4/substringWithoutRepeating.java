// Given a string s, find the length of the longest substring without repeating characters.


import java.util.*;
public class Main {
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int i=0,j=0;
        int arr[]=new int[256];
        int ans=0;
        while(i<str.length())
        {
            if(arr[str.charAt(i)-'A']==0)
            {
                arr[str.charAt(i)-'A']++;
                ans=Math.max(i-j+1,ans);
                i++;
            }
            else
            {
                arr[str.charAt(j)-'A']--;
                j++;
            }
        }
        System.out.println(ans);
    }
}
