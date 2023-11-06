package BackTracking;
import java.util.*;

public class rat_cheese {
	static boolean f=false;
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        char maze[][]=new char[n][m];
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            for(int j=0;j<m;j++)
            {
                maze[i][j]=s.charAt(j);
            }
        }
        int ans[][]=new int[n][m];

        PrintPath(maze,0,0,ans);

        if(f==false)
            System.out.println("NO PATH FOUND");
       
    }
    public static void PrintPath(char[][] maze,int cr,int cc,int ans[][])
    {
        if(cr==maze.length-1 && cc==maze[0].length-1 &&  maze[cr][cc]!='X')
        {
            f=true;
            ans[cr][cc]=1;
            display(ans);
            ans[cr][cc]=0;
            return;
        }
        if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc]=='X'){

            return;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        
        // here we use 1_d array for row and column  and entry below direction (loop laga diye basically).
    /*  PrintPath(maze,cr-1,cc,ans);//up
        PrintPath(maze,cr+1,cc,ans);//down
        PrintPath(maze,cr,cc+1,ans);//right
        PrintPath(maze,cr,cc-1,ans);//left */
        
        int [] r= {-1,1,0,0};
        int [] c= {0,0,1,-1};
        
        for(int i=0;i<c.length;i++) {
        	
        	PrintPath(maze,cr+r[i],cc+c[i],ans);
        }

        maze[cr][cc]='O';
        ans[cr][cc]=0;
    }
    public static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

}
/*  
ip
5 4
OXOO    // direct compiler par paste kar do chal jayega.
OOOX
XOXO
XOOX
XXOO

op
1 0 0 0 
1 1 0 0 
0 1 0 0 
0 1 1 0 
0 0 1 1 

*/


/*---------------------------------------------------------------------------------------------------------------------------------------*/
// https://hack.codingblocks.com/app/contests/5184/525/problem

import java.util.*;
public class Main {
    static boolean f=false;
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        char maze[][]=new char[n][m];
        for(int i=0;i<n;i++)
        {
            String s=sc.next();
            for(int j=0;j<m;j++)
            {
                maze[i][j]=s.charAt(j);
            }
        }
        int ans[][]=new int[n][m];

        PrintPath(maze,0,0,ans);

        if(f==false)
            System.out.println("NO PATH FOUND");
       
    }
    public static void PrintPath(char[][] maze,int cr,int cc,int ans[][])
    {
        if(cr==maze.length-1 && cc==maze[0].length-1 &&  maze[cr][cc]!='X')
        {
            f=true;
            ans[cr][cc]=1;
            display(ans);
            ans[cr][cc]=0;
            return;
        }
        if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc]=='X'){

            return;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;

        PrintPath(maze,cr-1,cc,ans);//up
        PrintPath(maze,cr+1,cc,ans);//down
        PrintPath(maze,cr,cc+1,ans);//right
        PrintPath(maze,cr,cc-1,ans);//left

        maze[cr][cc]='O';
        ans[cr][cc]=0;
    }
    public static void display(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
