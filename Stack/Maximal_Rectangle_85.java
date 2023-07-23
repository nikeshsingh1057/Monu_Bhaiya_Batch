package Stack;

import java.util.Stack;

// This question is variation of Histogram first understand histogram than do this question. 

public class Maximal_Rectangle_85 {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
		
	/*	int max=-1;
		int ans[]=new int[matrix[0].length];
		
		for(int i=0;i<matrix[0].length;i++)
			ans[i]=matrix[matrix.length-1][i];         // sabse last wala row ko ans wale me add kiye hai
		
		max=Area(ans);  // first wale se area check karenge.
		for(int i=matrix.length-2;i>=0;i--) {
	
			max=Math.max(max, histogram(matrix[i],ans));
		}
		System.out.println(max); */
		
		// sir wala (upper wala khud se like hai);
		
		int[] arr = new int[matrix[0].length];
		int n = matrix.length;
		int answer = 0;
		
		for (int i = n - 1; i >= 0; i--) {
			for (int j = 0; j < arr.length; j++) {
				if (matrix[i][j] == 1) {
					arr[j] = arr[j] + 1;
				} else {
					arr[j] = 0;
				}
			}
			int area = Area(arr);
			answer = Math.max(answer, area);

		}
		System.out.println(answer);

	}
	// function to adding 1 or 0 like histogram .
	public static int histogram(int arr[],int[] ans)
	{
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==1)
			{
				ans[i]=ans[i]+1;
			}
			else {
				ans[i]=0;
			}
		}
		max=Area(ans);
		return max;
	}
	// function to calculate maximum area. (histogram ka code hai)
	public static int Area(int [] arr) {
		
		int ans=0;
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				
				int h=arr[st.pop()];
				int r=i;
				
				if(st.isEmpty())
				{
					int a=h*r;
					ans=Math.max(ans, a);
				}
				else {
					
					int l=st.peek();
					int a=h*(r-l-1);
					ans=Math.max(ans, a);
				}
			}
			st.push(i);
		}
		int r=arr.length;
		
		while(!st.isEmpty()) {
			
			int h=arr[st.pop()];
			
			if(st.isEmpty())
			{
				int a=h*r;
				ans=Math.max(ans, a);
			}
			
			else {
				
				int l=st.peek();
				int a=h*(r-l-1);
				ans=Math.max(ans, a);
			}
		}
		return ans;
		
	}

}
