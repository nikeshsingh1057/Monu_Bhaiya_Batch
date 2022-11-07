// One of the important aspect of object oriented programming is readability of the code. To enhance the readability of code, developers write function and variable names in Camel Case. You are given a string, S, written in Camel Case. FindAllTheWordsContainedInIt.

import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int i=0;
        while(i<str.length())
        {
            String ans=check(str,i);
            System.out.println(ans); // print the return string.

            i+=ans.length(); // to increase the counter.
        }
    }
    public static String check(String str,int i)
    {
        String ans="";
        ans+=str.charAt(i);
        int j=i+1;

        while(j<str.length() && !(str.charAt(j)>='A' && str.charAt(j)<='Z')){
            ans+=str.charAt(j);
            j++;
        }
        return ans;
    }
}
