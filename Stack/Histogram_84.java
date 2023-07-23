package Stack;
import java.util.Stack;
class Histogram_84 {

	public static void main(String[] args) {
		
		int arr[]= {2,1,5,6,2,3};
		int ans=Area(arr);
		System.out.println(ans);
	}
	public static int Area(int [] arr) {
		
		int ans=0;
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				
				int h=arr[st.pop()];// h matlab jis element ka area calculate karna hai. i.e jiska previous smaller and next smaller mil gaya hai.
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
		// if element is left in stack than we calculate it outside.
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
