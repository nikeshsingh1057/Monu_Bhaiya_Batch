package Stack;

// ye dynamic stack banaye hai isme kitna bhee number add kar sakte hai iska class DyanmicStack hai
public class Dynamic_Stack_client {

	public static void main(String[] args)  throws Exception{
		
		DynamicStack ds=new DynamicStack();
		
		ds.push(67);
		ds.push(56);
		ds.push(90);
		ds.push(23);
		ds.push(11);
		ds.push(13);
		ds.push(00);
		ds.pop();
		
		ds.Display();
		
	}

}
