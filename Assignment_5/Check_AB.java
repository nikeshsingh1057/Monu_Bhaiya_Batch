import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        System.out.println(check(str));

    }
    // method 1st.
    public static boolean check(String str)
    {
        if(str.length()==0)
            return true;
        
        if(str.charAt(0)=='a')
        {
            if(str.substring(1).length() > 1 && str.substring(1,3).equals("bb"))
                return check(str.substring(3));
            
            else
                return check(str.substring(1));
        }
        
        return false;
    }
    // method 2
    public static boolean check(String str)
    {
        if(str.length()==0)
            return true;

        if(str.charAt(0)=='a'){
           
            return check(str.substring(1));
        }

        else if(str.length()>1 && str.charAt(0)=='b'&& str.charAt(1)=='b'){
            
            return check(str.substring(2));
        }
        else
            return false;
    }
}
