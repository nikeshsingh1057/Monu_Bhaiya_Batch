package Stack;
import java.util.Stack;
/*
1063. Number of Valid Subarrays
Given an array A of integers, return the number of non-empty continuous subarrays that satisfy the following condition:

The leftmost element of the subarray is not larger than other elements in the subarray. */


public class LeetCode_1063 {

	public static void main(String[] args) {  // monu bahiya logic
		
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

// method 2 (pepcoding) --------------------------------------------------------------------------------------------------------------

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		int arr[] = {1,4,2,5,3};
		int nextSM[] = nextSmallerElement(arr,arr.length);
		
		int ans = 0;
		for(int i=0;i<arr.length;i++)
		    ans += nextSM[i]-i;          // now index se substract kar denge wahi answer hoga.
		
		System.out.println(ans);
	}
    // finding just next smaller of current element in array
    public static int[] nextSmallerElement(int arr[], int n) 
    { 
	int nextSM[]=new int[n];    //nextSM->next smaller
        Stack<Integer> st=new Stack<>();
        
        for(int i=n-1;i>=0;i--){
            
            while(!st.isEmpty() && arr[i]<=arr[st.peek()])
                st.pop();
            
            if(!st.isEmpty())
                nextSM[i]=st.peek();   // index put karenge.
            else
                nextSM[i]=n; // agar koi smaller nahi mila then n put kar denge.
            st.push(i);
        }
        return nextSM;
	} 
}

// method 3rd (optimize 2nd method ) pepcoding. --------------------------------------------------------------------------------------

import java.util.*;
public class Main {

	public static void main(String[] args) {
		
		int arr[] = {1,4,2,5,3};
		int n=arr.length;
		int ans=0;
		
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            
            while(!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            
            int si=n;          // agar next smaller nahi milta hai then array ka size lenge.
            if(!st.isEmpty())
                si=st.peek();   // next smaller index si me put kar lenge
                
            ans += (si-i);
            st.push(i);
        }
        System.out.println(ans);
	}
}

