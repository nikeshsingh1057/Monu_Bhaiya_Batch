// second variation of maze path having one step jump diagionally.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);

        int dr=sc.nextInt();
        int dc=sc.nextInt();

        int a=getMaze(1,1,dr,dc,"");
        System.out.print("\n"+a);
    }
    public static int getMaze(int sr,int sc, int dr,int dc,String ans)
    {
        if(sr==dr && sc==dc)
        {
            System.out.print(ans+" ");
            return 1;
        }
        int a=0;
        
        if(sr<dr)
            a += getMaze(sr+1, sc, dr, dc, ans+"V");  // increasing sc(source column ) with one if it is less than its boundary
        
        if(sc<dc)
            a += getMaze(sr, sc+1, dr, dc, ans+"H");  // increasing sr(source row ) with one if it is less than its boundary

        if(sr<dr && sc<dc)                      // here we need both boundary checking
            a += getMaze(sr+1,sc+1,dr,dc,ans+"D");
         
        return a;
    }  
}
