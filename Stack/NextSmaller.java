
import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
		
		int arr[]={0,3,5,4,6,1,7};              // next Samller of arr is ->> [-1 1 4 1 1 -1 -1]
		
		int ans[]=new int[arr.length];
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=arr.length-1;i>=0;i--)
		{
		    while(!st.isEmpty() && st.peek()>=arr[i])
		    {
		        st.pop();
		    }
		    if(st.isEmpty())
		        ans[i]=-1;
		        
		    else 
		        ans[i]=st.peek();
		    
		    st.push(arr[i]);
		}
		
		// for displaying answer.
		for(int i=0;i<arr.length;i++)
		{
		  System.out.print(ans[i]+" ");
		}
	}
}
