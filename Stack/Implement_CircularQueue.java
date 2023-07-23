package Stack;

public class Implement_CircularQueue {

	public static void main(String[] args) throws Exception {
		
		Queue q=new Queue();
		
		q.Enqueue(56);
		q.Enqueue(16);
		q.Enqueue(80);
		q.Enqueue(870);
		
		System.out.println(q.Dequeue());
		System.out.println(q.Dequeue());
		
		q.Enqueue(67);
		q.Enqueue(24);
		
		q.Display();

	}

}
