// second variation of board/stair path

import java.util.*;
public class Main {
    public static void main(String args[]) {
       
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int m=sc.nextInt();
       System.out.println("\n" + PrintPath(0,n,"",m));
    }
    public static int PrintPath(int src,int des,String ans,int m)
	{
		if(src==des) {
			System.out.print(ans+" ");
			return 1;
		}
		// if(src>des)                       // note here if we remove it then we have to write (&& dice+src<=des) inside for loop other this statement.
		// 	return 0;
		
		int a=0;
		for(int dice=1;dice<=m && dice+src<=des;dice++)
		{
			a=a+PrintPath(src+dice,des,ans+dice,m);
		}
		return a;
	}
}
