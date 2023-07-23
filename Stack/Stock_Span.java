package Stack;
import java.util.*;
import java.util.Stack;
// isme previous kitna element chotta hai current posion se (note countious hona chaiye smaller).
//   https://code-gym.codingblocks.com/problems/502
public class Stock_Span {

	public static void main(String[] args) {
		
		int arr[]= {30,35,40,38,35};
		Span(arr);
	}
	public static void Span(int arr[])
	{
		int ans[]=new int[arr.length];
		ans[0]=1;
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]>=arr[st.peek()]) {
				st.pop();
			}
			
			if(st.isEmpty()) {
				ans[i]=i+1;
			}
			else {
				ans[i]=i-st.peek();
			}
			st.push(i);
		}
		System.out.println(Arrays.toString(ans));
	}
}
