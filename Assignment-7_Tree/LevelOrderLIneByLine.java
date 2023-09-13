// Level Order ( New Line, Binary Tree)
// https://hack.codingblocks.com/app/contests/4948/430/problem

import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderNewLine();
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

		public void levelOrderNewLine() {

			 Queue<Node> q = new LinkedList<Node>(); /* to store address of Node */

        if(root==null) return;
        q.add(root);
        q.add(null);

        while(q.size()>1)    /* to print level order traveshal line by line */
        {
            Node curr=q.poll();
            if(curr==null){
                System.out.println();       /* this code to print level order line by line. */
                q.add(null);
                continue;   /* continue is nessesery to avoid null pointer exception */
            }
            System.out.print(curr.data+ " ");
          
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
        }
		}

	}

}
