package BackTracking;

public class N_Queen {

	public static void main(String[] args) {
		
		int n=4;

        boolean [][] board=new boolean[n][n];

        printPath(board,0 , n);
	}
	public static void printPath(boolean [][] board,int row,int tq)  //tq= total queen  (jitna row utna queen)
	{ 
		if(tq==0)
		{
			display(board);
			System.out.println();
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
	// checking it is possible to place queen 
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
	// for displaying board
	public static void display( boolean[][] board )
	{
	    for(int i=0;i<board.length;i++)
	    {
	        for(int j=0;j<board.length;j++)
	        {
	           System.out.print(board[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}


/*false true false false 
false false false true 
true false false false 
false false true false 

false false true false 
true false false false 
false false false true 
false true false false */
