import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
    public static void reverseStack(Stack<Integer>st){
        
        if(st.size()==0)
            return;
        
        int a = st.pop();
        reverseStack(st);
        reverse(st,a);
    }
    public static void reverse(Stack<Integer>st,int a){
        
        if(st.size()==0){
            st.push(a);
            return;
        }
        int b = st.pop();
        reverse(st,a);
        st.push(b);
    }
}
