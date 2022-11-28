/* Given a string, find the first non-repeating character in it. For example, if the input string is “GeeksforGeeks”,
  then output should be ‘f’ and if input string is “GeeksQuiz”, then output should be ‘G’. */

import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        
        while(t--!=0)
        {
            String str=sc.next();

            int index=check(str);
            if(index==-1)
                System.out.println(index);
            else
                 System.out.println(str.charAt(index));
        }
    }
    public static int check(String s)
    {
         
        int arr[]=new int[26];
        
        for(int i=0;i<s.length();i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(arr[s.charAt(i)-'a']==1)
                return i;
        }
        return -1;
    }
}
