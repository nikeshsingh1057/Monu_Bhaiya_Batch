package Stack;
import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {
		
		Stack<Integer> st=new Stack<>();
		
		int arr[] = {4,12,5,3,1,2,5,3,1,2,4,6};
		
		int [] ans=new int[arr.length];
		
		// method 1st monu sir wala.
		
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) 
				ans[st.pop()]=arr[i];
			st.push(i);
		}
		
		for(int i=0;i<ans.length;i++){
			if(ans[i]==0)
			    ans[i]=-1;
		}
		System.out.println(Arrays.toString(ans)); 
	}
	
// method 2nd (right se travesh karna).
class Solution
{
    //Function to find the next greater element for each element of the array.
    public static long[] nextLargerElement(long[] arr, int n)
    { 
        long ans[]=new long[n];
        Stack<Integer> st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            
            while(!st.isEmpty() && arr[i]>=arr[st.peek()])
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
	
//---------------------------------------------------------------------------------------------------------------------------------------	
// also valid to find next greater element if array is given circular..		
// method third to find next greater element.(this is valid for both circular array. just make it with i%arr.length and run it by 2*n
		
		for(int i=2*arr.length-1;i>=0;i--)           // 4,12,5,3,1,2,5,3,1,2,4,6
		{
			
			while(!st.isEmpty() && st.peek()<=arr[i%arr.length]) 
					st.pop();
			
			if(i<arr.length) {
				
				if(!st.isEmpty())
					ans[i]=st.peek();
				
				else
					ans[i]=-1;
			}
			
			st.push(arr[i%arr.length]);     // we are doing here i%arr.length because it will also check for circular array.
		}
		
		System.out.println(Arrays.toString(ans));
		
	}
	
}

// next greater in circular array (just remove 2*n and run loop to n and also remove all % (mod) then it is valid for no circular array).

class Solution { // own
    // t.c-> 2*n+2*m
    public int[] nextGreaterElements(int[] arr) {
        
        int n=arr.length;
        int ans[]=new int[n];
        Arrays.fill(ans,-1);

        Stack<Integer> st=new Stack<>();

        for(int i=0;i<2*n;i++){
            
            while(!st.isEmpty() && arr[st.peek()%n] < arr[i%n]){
                if(i%n<n)
                    ans[st.pop()%n]=arr[i%n];
                
            }
            st.push(i%n);
        }
        for(int i=0;i<n;i++)
            if(ans[i]==-1) 
                ans[i]=-1;
        return ans;
    }
}
