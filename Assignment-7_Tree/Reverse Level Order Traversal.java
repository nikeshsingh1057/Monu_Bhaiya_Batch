// Reverse Level Order Traversal

import java.util.*;
class Node{

	int data;
	Node left;
	Node right;
}
public class Main {

    static Scanner sc=new Scanner(System.in);

    public static void main (String args[]) {

         Node root=createtree();
         level(root);
    }
    public static Node createtree() {
		
	int item=sc.nextInt();
	Node nn=new Node();
	nn.data=item;
		
	boolean hlc=sc.nextBoolean();
	if(hlc==true) {
		nn.left=createtree();
	}
		
	boolean hrc=sc.nextBoolean();
	if(hrc==true) {
		nn.right=createtree();
	}

	return nn;
	}
     public static void level(Node root){

        Queue<Node> q = new LinkedList<Node>(); /* to store address of Node */
        Stack<ArrayList<Integer>> st=new Stack<>();
        ArrayList<Integer> ll=new ArrayList<>();
        q.add(root);

        while(true){

             int size=q.size();
             if(size==0)
               break;
        
        while(size-- > 0)
        {
            Node curr=q.poll();
            ll.add(curr.data);
          
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
        }
        st.push(ll);
        ll=new ArrayList<>();
     }
     while(!st.isEmpty()){
          
             for(int i:st.pop())
             System.out.print(i+" ");
        }
     }
}
