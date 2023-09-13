// Sibling ( Binary Tree)

/*Given a binary tree print all nodes that don’t have a sibling

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL */

import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.sibling();
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

		public void sibling() {
			this.sibling(this.root);
		}

		private void sibling(Node node) {
			
			ArrayList<Integer> ll=new ArrayList<>();
        	check(node,ll);
        	Collections.sort(ll);
			for(int i:ll)
			System.out.print(i+" ");
		}
		public void check(Node root,ArrayList<Integer> ll){
        
        if(root==null)
            return;
            
        check(root.left,ll);
        check(root.right,ll);
        
        if(root.left!=null && root.right==null){
            ll.add(root.left.data);
        }
        if(root.right!=null && root.left==null)
            ll.add(root.right.data);
    }
	}

}
