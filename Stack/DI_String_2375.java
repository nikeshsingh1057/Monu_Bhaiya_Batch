// DI_String_2375

import java.util.Stack;

public class DI_String_2375 {

	public static void main(String[] args) {
		
		String Pattern="IIIDIDDD";
		
		System.out.println(smallestNumber(Pattern));
	}
    public static String smallestNumber(String str) {
        
    	Stack<Integer> st=new Stack<>();
          
        String  ans="";
          
        for(int i=0;i<=str.length();i++)
        {
            if(i==str.length() || str.charAt(i)=='I'){
                
                ans+=(i+1);
                
                while(!st.isEmpty()){
                    ans+=st.pop();
                }
            }
            else
                st.push(i+1);
        }
        return ans;  
      }
}
