
class Solution {
    public static int[] help_classmate(int arr[], int n) 
    { 
	int ans[]=new int[n];
        Stack<Integer> st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
                st.pop();
            
            if(!st.isEmpty())
                ans[i]=arr[st.peek()];
            else
                ans[i]=-1;
            st.push(i);
        }
        return ans;
	} 
    }
}

// question based on next smaller in array.
// Leetcode 1063   https://leetcode.ca/all/1063.html
