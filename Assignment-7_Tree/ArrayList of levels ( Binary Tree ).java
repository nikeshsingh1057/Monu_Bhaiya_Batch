// ArrayList of levels ( Binary Tree )

/* Given a Binary tree, write code to create a separate array list for each level. You should return an arraylist of arraylist.

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL */

import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt1 = m.new BinaryTree();
		System.out.println(bt1.levelArrayList());
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

		public ArrayList<ArrayList<Integer>> levelArrayList() {

			ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        	ArrayList<Integer> ll=new ArrayList<>();
			Queue<Node> q = new LinkedList<Node>();

        if(root==null) return ans;
        q.add(root);
		while(true){
			int s=q.size();
			if(s==0)
				break;
        while(s-- >0)
        {
            Node curr=q.poll();
           
            ll.add(curr.data);
          
            if(curr.left!=null)
            q.add(curr.left);
            if(curr.right!=null)
            q.add(curr.right);
        } // while braces.
			ans.add(ll);
			ll=new ArrayList<>();
		}// main while braces.
		return ans;
		}  // main bracket is block ka.
	}

}
