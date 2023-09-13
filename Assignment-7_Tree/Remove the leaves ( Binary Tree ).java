// Remove the leaves ( Binary Tree )

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
		root=Leave(root);
		Display(root);
    }
	// function to create tree.
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
	// function to delete leaf node.
	public static Node Leave(Node root){

		if(root==null)
		return null;

		if(root.left==null && root.right==null)
			return null;
		
		root.left=Leave(root.left);
		root.right=Leave(root.right);
		return root;
	}
	// function to display tree.
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
