package Trie;

import java.util.Scanner;

// implementation of Tree 

public class BinaryTree {
	
	public class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	
	public BinaryTree() {
		root=createtree();
	}
	
	Scanner sc=new Scanner(System.in);
	
	private Node createtree() {
		
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
	
	public void Display() {
		Display(root);
	}
	
	private void Display(Node nn) {
		
		if(nn==null)
			return;
		
		String s="";
		s="<--"+nn.data+"-->";
		if(nn.left!=null)
			s=nn.left.data+s;
		else
			s="."+s;
		
		if(nn.right!=null)
			s=s+nn.right.data;
		else
			s=s+".";
		System.out.println(s);
		
		Display(nn.left);
		Display(nn.right);
	}
}
