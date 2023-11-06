// count of possible n-queen in matrix

import java.util.*;
public class Main {
    static int count=0;
    public static void main(String args[]) {
        count=0;
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        boolean [][] board=new boolean[n][n];
        printPath(board,0 , n);
        System.out.println(count);
    }
    public static void printPath(boolean [][] board,int row,int tq)  //tq= total queen  (jitna row utna queen)
	{ 
		if(tq==0)
		{
			count++;
			return;
		}
		
		if(row==board.length)
			return;
		
		for(int col=0;col<board.length;col++)
		{
			if(isitPossible(board,row,col)==true)
			{
				board[row][col]=true;
				
				printPath(board,row+1,tq-1);
				
				board[row][col]=false;	
			}
		}
		
	}
    public static boolean isitPossible(boolean board[][] ,int row,int col)
	{
		// upper case
		int r=row;
		
		while(r>=0)
		{
			if(board[r][col]==true)
				return false;
			
			r--;
		}
		
		// left diagnol
		r=row;
		int c=col;
		
		while(r>=0 && c>=0)
		{
			if(board[r][c]==true)
				return false;
			
			r--;
			c--;
		}
		
		// right diagnol
		r=row;
		c=col;
		
		while(r>=0 && c<board.length)
		{
			if(board[r][c]==true)
				return false;
			
			r--;
			c++;
		}
		
		return true;
		
	}
}
