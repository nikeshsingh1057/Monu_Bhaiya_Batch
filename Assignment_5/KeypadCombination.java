import java.util.*;
public class Main {

    public static String [] mobile={".","abc","def","ghi","jkl","mno","pqrs","tuv","wx","yz"};
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int a=key(str,"");
        System.out.print("\n"+a);
    }
    public static int key(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.print(ans+" ");
            return 1;
        }
        char ch=str.charAt(0);
        String keyMap=mobile[ch-'0'];
        int a=0;
        for(int i=0;i<keyMap.length();i++)
        {
            a += key(str.substring(1),ans+keyMap.charAt(i));
        }
        return a;
    }
}
