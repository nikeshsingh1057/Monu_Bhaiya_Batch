// implementation of linked list.

public class Implement_LindedList {
	
	 public class Node{
		
		int val;
		Node next;
		
	}
	
	private Node head;
	private int size;
	private Node tail;
	
	public void AddFirst(int item) {      // adding element in first of linkedlist. 
		
		Node nn=new Node();
		
		nn.val=item;
		
		if(size==0) {
			
			this.head=nn;
			this.tail=nn;
			this.size++;
		}
		else {
			nn.next=head;
			head=nn;
			this.size++;
		}
	}
	
	// adding last elemetn in linkedlist
	public void AddLast(int item)
	{
		if(size==0)
		{
			AddFirst(item);
		}
		else {
			
			Node nn=new Node();
			nn.val=item;
			tail.next=nn;
			tail=nn;
			this.size++;
		}
	}
	// printing of linkedlist element.
	public void display() {
		
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.val+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	
	// for adding element in any position we first get address of that node so by traveshing we get head of that position.
	public Node GetNode(int k) throws Exception{
		
		if(k<0 || k>=size) {
			throw new Exception("Bklol k range me dedo");
		}
		Node temp=head;
		for(int i=1;i<=k;i++) {
			temp=temp.next;
		}
		return temp;    // this function return address of specific index node.
	}
	public void Add_at_Index(int item,int k) throws Exception{
		
		if(k<0 || k>size) {
			throw new Exception ("Bklol k range me dedo");
		}
		if(k==0) {
			AddFirst(item);
		}
		else if( k==size) {
			AddLast(item);
		}
		else {
			
			Node nn=new Node();
			nn.val=item;
			Node k_1th = GetNode(k-1);     // previous Node ka address le liye.
			Node kth = k_1th.next;         // agle Node ka address le liye.
			k_1th.next = nn;
			nn.next=kth;
			size++;
			
		}
	}
	
	public  int getFirst() {
		
		return head.val;
	}
	
	public  int getLast() {
		
		return head.val;
	}
	
	public int get_at_Index(int k) throws Exception {
		
		return GetNode(k).val;
	}
	public int remove_first() throws Exception
	{
		if(size==0) {
			throw new Exception ("Bklol size zero hai yani no element in linkedlist");
		}
		int rv=head.val;
		if(size==1) {
			
			head=null;
			tail=null;
			size--;
		}
		else {
			
			Node temp=head;
			head=head.next;
			temp.next=null;
			size--;
		}
		return rv;
	}
	public int removeLast() throws Exception{
		
		if(size==0) {
			throw new Exception ("Bklol size zero hai yani no element in linkedlist");
		}
		if(size==1) {
			
			return remove_first();
		}
		else {
			
			int rv=tail.val;
			Node n=GetNode(size-2);
			tail=n;
			tail.next=null;
			size--;
			return rv;
		}
	}
	public int remove_at_index(int k) throws Exception 
	{
		if(size==0) {
			throw new Exception ("Bklol size zero hai yani no element in linkedlist");
		}
		
		if(k==0) {
			return remove_first();
		}
		else if(k==size-1) {
			return removeLast();
		}
		else {
			
			Node k_1th= GetNode(k-1);
			Node kth=k_1th.next;
			k_1th.next=kth.next;
			kth.next=null;
			size--;
			return kth.val;
		}
	}
	public static void main(String[] args) throws Exception {
		
		Implement_LindedList ll=new Implement_LindedList();    // creating object 
		
		ll.AddFirst(5);
		ll.AddFirst(23);
		ll.AddFirst(89);
		ll.AddFirst(45);
		ll.AddLast(56);
		
		ll.Add_at_Index(202, 1);
		ll.remove_at_index(0);
		ll.display();
		ll.remove_first();
		ll.display();
		
		System.out.println(ll.get_at_Index(2));
		
	}
}
