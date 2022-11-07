// Take as input S, a string. Write a function that removes all consecutive duplicates. Print the value returned.

import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String ans="";
        int i=0;
        while(i<str.length())
        {
            ans+=str.charAt(i);
            int count=Total_Count(str,i);
            i+=count;
        }
        System.out.println(ans);
    }
    public static int Total_Count(String str, int i)
    {
        int count=1;
        int j=i+1;

        while(j<str.length() && str.charAt(i)==str.charAt(j))
        {
            count++;
            j++;
        }
        return count;
    }
}
