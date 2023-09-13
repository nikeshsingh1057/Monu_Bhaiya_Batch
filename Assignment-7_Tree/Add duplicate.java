// Add duplicate ( BST 
/* For each node in a binary search tree, create a new duplicate node, and insert the duplicate as the left child of the original node.

Input Format
Enter the number of nodes N and add N more numbers to the BST */

import java.util.*;

class Node {

    int data;
    Node left;
    Node right;

	Node(int data){
		this.data=data;
		left=right=null;
	}
}

public class Main {
	static int a;
	public static void main(String [] args){

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		Node root=null;

		while(n-- != 0){
			int ele=sc.nextInt();
			root=bst_Preorder(root,ele);
		}
		a=0;
        
		doubleTree(root);
		Display(root);
	}
	// construction of binary serach tree.
	public static Node bst_Preorder(Node root,int value){
        
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(value<=root.data)
            root.left=bst_Preorder(root.left,value);
        else
            root.right=bst_Preorder(root.right,value);
        
        return root;
    }
	// function to double tree
	public static void doubleTree(Node root){

		if(root==null)
            return ;
        
        doubleTree(root.left); 
        
		// here  i am creating new node and atteched root ke left me kar de rahe and
		// root.left wale ko temp me store kar rahe so newNode ke left me temp attech kar rahe hai. O.k
        Node NewNode = new Node(root.data);
        Node temp=root.left;
        root.left=NewNode;
        NewNode.left=temp;
        
        doubleTree(root.right);
	}
	// function to display updated bst
	public static void Display(Node nn) {
		
		if(nn==null)
			return;
		
		String s="";
		s=" => "+nn.data+" <= ";
		if(nn.left!=null)
			s=nn.left.data+s;
		else
			s="END"+s;
		
		if(nn.right!=null)
			s=s+nn.right.data;
		else
			s=s+"END";
		System.out.println(s);
		
		Display(nn.left);
		Display(nn.right);
	}
}


   
