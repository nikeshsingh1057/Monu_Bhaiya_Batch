import java.util.*;
public class Main {

    static int count;
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        count=0;
        solve(str,0,"","");
    }
   
    public static void solve(String str,int i,String ans1,String ans2)
    {
        if(i==str.length())
        {
            System.out.println(count);
            System.out.println(ans1);
            System.out.println(ans2);
            return ;
        }
        if(i<str.length()-1 && str.charAt(i)=='h' && str.charAt(i+1)=='i'){

            count++;
            ans2+="bye";
            solve(str,i+2,ans1,ans2);
        }
        else{

            ans2+=str.charAt(i);
            ans1+=str.charAt(i);
            
            solve(str,i+1,ans1,ans2);
        }
    }
}
