// A Good String is a string which contains only vowels (a,e,i,o,u) . Given a string S, print a single positive integer N where N is the length of the longest substring of S that is also a Good String.

import java.util.*;
public class Main {
    public static void main(String args[]) {
       
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       
       int ans=0;
       int count=0;
       int i=0;
       while(i<str.length())
       {
           if(CheckVowel(str.charAt(i))==true)
           {
               count++;
           }
           else
           {
               ans=Math.max(count,ans);
               count=0;
           }
           i++;
       }
       ans=Math.max(count,ans);
       System.out.println(ans);
    }
    public static boolean CheckVowel(char ch)
    {
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
            return true;

        return false;
    }
}
