package Stack;
import java.util.Stack;
/*
1063. Number of Valid Subarrays
Given an array A of integers, return the number of non-empty continuous subarrays that satisfy the following condition:

The leftmost element of the subarray is not larger than other elements in the subarray. */


public class LeetCode_1063 {

	public static void main(String[] args) {
		
		int arr[]= {1,4,2,5,3};
		int ans=0;
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0;i<arr.length;i++) {
			
			while(!st.isEmpty() && arr[i]<arr[st.peek()])
				st.pop();
			st.push(i);
			ans+=st.size();
		}
		System.out.println(ans);
	}

}
