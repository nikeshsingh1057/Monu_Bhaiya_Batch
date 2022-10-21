// Sprial print of 2d Array

// 1st type sprial matrix.

public class Sprial_Print {

	public static void main(String[] args) {
	
		int [][] arr= {{1,2,3,4},    
			       {5,6,7,8},       // O/P -> 1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10
			       {9,10,11,12},
			       {13,14,15,16}};
		PrintSprial(arr);
		
	}
	public static void PrintSprial(int [][] arr)
	{
		int minr=0;
		int minc=0;
		int maxr=arr.length-1;
		int maxc=arr[0].length-1;
		int te=arr.length*arr[0].length;
		int count=0;
		while(count<te)
		{
		   for(int i=minc;i<=maxc && count<te;i++)
		   {
			   System.out.print(arr[minr][i]+" ");
			   count++;
		   }
		minr++;
		   for(int i=minr;i<=maxr && count<te;i++)
		   {
			   System.out.print(arr[i][maxc]+" ");
			   count++;
		   }
		maxc--;
		   for(int i=maxc;i>=minc && count<te;i--)
		   {
			   System.out.print(arr[maxr][i]+" ");
			   count++;
		   }
		maxr--;
		   for(int i=maxr;i>=minr && count<te;i--)
		   {
			   System.out.print(arr[i][minc]+" ");
			   count++;
		   }
		minc++;
		}
	}
}

// sprial matrix type II .

public class Sprial_Print_II {

	public static void main(String[] args) {
		
		int[][] arr = { { 1, 2, 3, 4 }, 
			        { 5, 6, 7, 8 },   // O/P -> 1,5,9,13,14,15,16,12,8,4,3,2,6,10,11,7
			        { 9, 10, 11, 12 }, 
			        { 13, 14, 15, 16 } };
		PrintSprial(arr);
	}
	public static void PrintSprial(int [][] arr)
	{
		int min_row=0;
		int min_col=0;
		int max_row=arr.length-1;
		int max_col=arr[0].length-1;
		int total=arr.length*arr[0].length;    // row*column
		int count=0;
		while(count<total)
		{
			               // left wall
			for(int i=min_row, j=min_col;i<=max_row && count<total;i++)
			{
				System.out.print(arr[i][j]+" ");
				count++;
			}
			min_col++;
			              // bottom wall
			for(int i=min_col,j=max_row;i<=max_col && count<total;i++)
			{
				System.out.print(arr[j][i]+" ");
				count++;
			}
			max_row--;
			              // right wall
			for(int i=max_row,j=max_col;i>=min_row && count<total;i--)
			{
				System.out.print(arr[i][j]+" ");
				count++;
			}
			max_col--;			  // top wall
			for(int i=max_col,j=min_row;i>=min_col && count<total;i--)
			{
				System.out.print(arr[j][i]+" ");
				count++;
			}
			min_row++;
		}
	}

}

