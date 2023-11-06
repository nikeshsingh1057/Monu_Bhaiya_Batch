// https://hack.codingblocks.com/app/contests/3908/265/problem

// N_night problem
import java.util.*;
public class Main {
    static int count=0;
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean board[][]=new boolean[n][n];

        knightPlace(0,0,board,"",n);
        System.out.println();
        System.out.println(count);
    }
 public static void knightPlace(int r,int c, boolean [][] board,String ans,int qtp)
    {
        if(qtp==0)
        {
            count++;
            System.out.print(ans+" ");
            return;
        }
        if(c==board.length) // here column 0 kar de rahe and row ko increse kar de rahe hai.
        {
            r++;
            c=0;
        }
        if(r==board.length)
            return;
        
        if(isitsafemove(board,r,c)==true){

            board[r][c]=true;
            knightPlace(r,c+1,board,ans + "{" + r + "-" + c + "} ",qtp-1);
            board[r][c]=false; 
        }
        knightPlace(r, c+1, board, ans, qtp);
    }
    public static boolean isitsafemove(boolean[][] board,int r,int c)
    {
       
         //left
        if(r-1>=0 && c-2>=0 && board[r-1][c-2]==true)
            return false;

        // right
        if(r-1>=0 && c+2<board.length && board[r-1][c+2]==true)
            return false;

        // upper left
        if(r-2>=0 && c-1>=0 && board[r-2][c-1]==true)
            return false;

        // upper right
        if(r-2>=0 && c+1<board.length && board[r-2][c+1]==true)
            return false;
        
        return true;
    }
}

