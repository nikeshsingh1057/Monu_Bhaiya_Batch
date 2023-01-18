// print all  maze path in matrix.

public class Matrix_path {
	
	public static void main(String[] args) {
		
		int r=1,c=1;
		int dc=4,dr=4;
		Maze_Path(r,c,dc,dr,"");
		
		System.out.println();
		
		PrintMazePathSir(0,0,3,3,"");
		
	}
	public static void Maze_Path(int r,int c,int dr,int dc,String ans)           
	{
		// 1st method
		
		if(r==dr-1 && c==dc-1)                                                      
		{
			System.out.print(ans+" ");
		}
		
		if(r<dr)
			Maze_Path(r+1,c,dr,dc,ans+"h");
		
		if(c<dc)
			Maze_Path(r,c+1,dr,dc,ans+"v"); 
		
		
	}
	public static void PrintMazePathSir(int r,int c,int dr,int dc,String ans)
	{
		        // 2nd method
				if(r==dr-1 && c==dc-1) {
					
					System.out.print(ans+" ");
					return;
				}
				if(r>=dr || c>=dc) {
					return;
				}
				PrintMazePathSir(r+1,c,dr,dc,ans+"H");
				PrintMazePathSir(r,c+1,dr,dc,ans+"V");
	}
}
