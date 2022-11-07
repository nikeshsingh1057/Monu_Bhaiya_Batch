// Strings-Difference in Ascii Codes

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String ans="";
        ans+=str.charAt(0);
        int i=1;

        while(i<str.length())
        {
            int c=str.charAt(i)-str.charAt(i-1);
            ans+=c;
            ans+=str.charAt(i);
            i++;
        }
        System.out.println(ans);
    }
}
