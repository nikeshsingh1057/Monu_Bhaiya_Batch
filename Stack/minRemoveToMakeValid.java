// Minimum Remove to Make Valid Parentheses leet 1249

// simple method solve my me but not efficient
class Solution {
    public String minRemoveToMakeValid(String s) {
        
        int open=0;
        
        Stack<String> st=new Stack<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                st.push(s.charAt(i)+"");
            
            else if(s.charAt(i)=='(' ){
                st.push("(");
                open++;
            }
            else{
                
                open--;
                if(open<0){
                    
                    open=0;
                    continue;
                } 
                
                String temp=")";   
                while(!st.isEmpty() && st.peek()!="("){     
                    temp+=st.pop();
                    
                } 
                temp+=st.pop();    
                st.push(temp);
            }
        }
        String ans="";
        while(!st.isEmpty()){
            
            if(open>0 && st.peek()=="(")
                 st.pop();
            else  
                ans+=st.pop();
        }
        ans=reverse(ans);
        return ans;
    }
    // function to reverse string
    public static String reverse(String ans)
    {
        int i=ans.length()-1;
        String temp="";
        
        while(i>=0){
            temp+=ans.charAt(i--);
        }
        return temp;   
    }
}

// efficient method after watching logic.
class Solution {
    public String minRemoveToMakeValid(String s) {
        
        char [] arr=s.toCharArray();
        
        Stack<Integer> st=new Stack<>();
        
        // note we are only storing the index of opening barcket and not charecter.
        
        for(int i=0;i<arr.length;i++)
        {
            char ch=arr[i];
            
            if(ch=='(')              
                st.push(i);
            
            else if(ch==')'){
                
                if(!st.isEmpty() && arr[st.peek()]=='(') // we are not using while loop because we get opening bracket on peek of stack because we not storing charecter.
                    st.pop();
                else
                    st.push(i); // he we put index of closing bracket so that this index will remain in stack and this index is the invalid so we make it false by * and put in array.
            }
        }
        while(!st.isEmpty()){  // jo element stack me bach gaye wo invalid hai unko ans me include nahi karna hai so we mark is as '*' at that index.
            arr[st.pop()]='*';
        }
        
        String ans="";
        for(int i=0;i<arr.length;i++){
            
            if(arr[i]!='*')    // if '*' is appear than it will invalid bracket and we ignore it.
                ans+=arr[i];
        }
        return ans;
    }
}

