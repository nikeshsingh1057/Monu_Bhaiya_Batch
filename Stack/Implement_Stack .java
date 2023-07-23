package Stack;

public class Implement_Stack {

	public static void main(String[] args) throws Exception {
		
		Stack st=new Stack(6);
		
		st.push(5);
		st.pop();
		st.push(11);
		st.push(50);
		
		st.push(78);
		st.push(24);
		st.push(89);
		
		st.Display();
		
		System.out.println(st.isEmpty());
		System.out.println(st.isFull());
		System.out.println(st.pop());
		System.out.println(st.peek());
	}

}
