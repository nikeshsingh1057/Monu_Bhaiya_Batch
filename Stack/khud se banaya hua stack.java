package Stack;

// khud se banaya hua stack.

public class Stack {
	
	protected int[] arr;                  // array ko private bayaye thee.
	int tos;
	
	public Stack() {   // constructor hai.
		
		arr=new int[5];
		tos=-1;
	}
//	
	public Stack(int n) { //
		
		arr=new int[n];
		tos=-1;
	}
	
	public boolean isEmpty() {
		
		return tos==-1;
	}
	
	public boolean isFull() {
		
		return tos==arr.length-1;
	}
	
	public void push(int item) throws Exception{
		
		if(isFull()) {
			throw new Exception("bklol stack full hai");
		}
		tos++;
		arr[tos]=item;
	}
	public int size() {
		
		return tos+1;
	}
	
	public int pop()throws Exception {
		
		if(isEmpty()) {
			throw new Exception("bklol stack Empty hai");
		}
		
		int x=arr[tos];
		tos--;
		return x;
	}
	
	public int peek() throws Exception {
		
		if(isEmpty()) {
			throw new Exception("bklol stack Empty hai");
		}
		int x=arr[tos];
		return x;
	}
	
	public void Display() {
		
		for(int i=0;i<=tos;i++) {
			System.out.print(arr[i]+"->");
		}
		System.out.println();
	}
}
