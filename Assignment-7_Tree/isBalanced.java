// is balanced binary tree.

/* Given a Binary tree check if it is balanced i.e. depth of the left and right sub-trees of every node differ by 1 or less.

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL */

import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		System.out.println(bt.isBalanced());
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

		public boolean isBalanced() {
			return this.isBalanced(this.root).isBalanced;
		}

		private BalancedPair isBalanced(Node root) {
			
			if(root==null)
				return new BalancedPair();
			
			BalancedPair left=isBalanced(root.left);
			BalancedPair right=isBalanced(root.right);
			BalancedPair currNode=new BalancedPair();

			if(left.isBalanced==true &&  right.isBalanced==true && Math.abs(left.height-right.height)<=1)
				currNode.isBalanced=true;
			else
				currNode.isBalanced=false;

			currNode.height=Math.max(left.height,right.height)+1;  // updating hight for current node
			return currNode;
		}

		private class BalancedPair {
			int height=0;
			boolean isBalanced=true;
		}

	}
}
