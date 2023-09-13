// Sum of the nodes (Binary tree)
/* Given a binary tree find sum of all the nodes.*/

import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.sumOfNodes());
	}

	private class BinaryTree {
		private class Node {
			int data;
			Node left;
			Node right;
		}

		private Node root;
		private int size;

		public BinaryTree() {
			this.root = this.takeInput(null, false);
		}

		public Node takeInput(Node parent, boolean ilc) {
			
			int cdata = scn.nextInt();
			Node child = new Node();
			child.data = cdata;
			this.size++;

			// left
			boolean hlc = scn.nextBoolean();

			if (hlc) {
				child.left = this.takeInput(child, true);
			}

			// right
			boolean hrc = scn.nextBoolean();

			if (hrc) {
				child.right = this.takeInput(child, false);
			}

			// return
			return child;
		}

		public int sumOfNodes() {
			return this.sumOfNodes(this.root) ;
		}
		
		public int sumOfNodes(Node node) {
			
			return sum(node);
		}
		public int sum(Node root){

			if(root==null)
				return 0;
			int l=sum(root.left);
			int r=sum(root.right);

			
			return l+r+root.data;
		}
	}
}
