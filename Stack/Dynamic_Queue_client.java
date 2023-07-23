package Stack;

public class Dynamic_Queue_client {

	public static void main(String[] args) throws Exception{
		
		Dynamic_Queue dq=new Dynamic_Queue();
		
		dq.Enqueue(13);
		dq.Enqueue(123);
		dq.Enqueue(90);
		dq.Enqueue(45);
		dq.Enqueue(98);
		dq.Enqueue(66);
		
		System.out.println(dq.Dequeue());
		System.out.println(dq.Dequeue());
		
		dq.Enqueue(844);
		
		dq.Display();
	}

}
