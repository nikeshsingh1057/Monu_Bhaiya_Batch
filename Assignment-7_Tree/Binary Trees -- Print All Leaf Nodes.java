// Binary Trees -- Print All Leaf Nodes
// Given a Binary Tree Print all the leaf nodes.

//https://hack.codingblocks.com/app/contests/4948/925/problem
import java.util.*;

class Node{

	int data;
	Node left;
	Node right;

	Node(int d){
		data=d;
		left=right=null;
	}
}

public class Main {
    public static void main(String args[]) {
		
		Node root=Create();
		deleteLeaf(root);
    }
	// function for creatin tree 
	public static Node Create(){

		Scanner sc=new Scanner(System.in);
		int ele=sc.nextInt();

		Node root=new Node(ele);
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);

		while(q.size()>0){

			Node rootNode = q.poll();    // now root se e1 and e2 ko connect karne ka kamm.
			int e1=0,e2=0;
			e1=sc.nextInt();
			e2=sc.nextInt();

			if(e1!=-1){
				rootNode.left=new Node(e1);
				q.add(rootNode.left);
			}
			if(e2!=-1){
				rootNode.right=new Node(e2);
				q.add(rootNode.right);
			}
		}
		return root;
	}
	public static void deleteLeaf(Node root){

		if(root==null)
		return ;

		deleteLeaf(root.left);
		deleteLeaf(root.right);

		if(root.left==null && root.right==null)
		System.out.print(root.data+" ");
	}
}
