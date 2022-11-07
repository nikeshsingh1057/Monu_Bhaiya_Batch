// Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        
        String ans="";
        int i=0;
        while(i<str.length())
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                
                
                ans+=(char)(str.charAt(i)-32);
            }
            else{

                ans+=(char)(str.charAt(i)+32);
            }
            i++;
        }
        System.out.println(ans);
    }
}
