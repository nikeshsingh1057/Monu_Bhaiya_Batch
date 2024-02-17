// Rat in a Maze
// https://hack.codingblocks.com/app/contests/3908/11/problem
 
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
            System.out.println("-1");
       
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

        if(f==true)   // iss line se only eak path milega agar isko hata diye to sara path mil jayega
            return;

        if(cr<0 || cc<0 || cr>=maze.length || cc>=maze[0].length || maze[cr][cc]=='X'){

            return;
        }
        maze[cr][cc]='X';
        ans[cr][cc]=1;
        
        PrintPath(maze,cr,cc+1,ans);//right
        PrintPath(maze,cr+1,cc,ans);//down  

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
