// Search a 2D Matrix II (leetcode_240)

public class Search_a_2D_Matrix_II {

	public static void main(String[] args) {
		
		int arr[][]={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int item=70;
		
		System.out.println(Search(arr,item));
	}
	public static boolean Search(int[][] arr,int item)
	{
		int row=0,col=arr[0].length-1;
		while(row<arr.length && col>=0)
		{
			if(item==arr[row][col])
				return true;
			
			else if(item<arr[row][col])
				col--;
			
			else
				row++;
		}
		return false;
	}

}
