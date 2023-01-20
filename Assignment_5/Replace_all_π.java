
import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0){

            String str=sc.next();

            // using loop 

           /* String ans="";

            for(int i=0;i<str.length();)
            {
                if(i<str.length()&&str.charAt(i)=='p' && str.charAt(i+1)=='i'){
                ans+="3.14";
                i+=2;}
                else{
                ans+=str.charAt(i); i++;}ans+=str.charAt(i);
               
            }

            System.out.println(ans); */

            // using recursion
            pi(str,"",0);
        }
    }
    public static void pi(String str,String ans,int i)
    {
        if(i==str.length())
        {
            System.out.println(ans);
            return;
        }

        if(i<str.length()&&str.charAt(i)=='p' && str.charAt(i+1)=='i'){

            ans+="3.14";
            pi(str,ans,i+2);
        }
        else{

            ans+=str.charAt(i);
            pi(str,ans,i+1);
        }
    }
}
