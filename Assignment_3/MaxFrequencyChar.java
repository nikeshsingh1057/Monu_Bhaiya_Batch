// Take as input S, a string. Write a function that returns the character with maximum frequency. Print the value returned.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)-'a']++;
        }
        int max_index=-1;
        int maxFreq=-1;
        int i;

        for(i=0;i<26;i++)
        {
           if(arr[i]>maxFreq)
           {
               maxFreq=arr[i]; //max frequency elemnt
               max_index=i;  // storing max frequency index value
           }
        }
        System.out.println((char)(max_index+97));
    }
}
