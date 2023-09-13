// Level Order ( Zigzag , Binary Tree)

/* Given a binary tree. Print the zig zag order i.e print level 1 from left to right, level 2 from right to left and so on. This means odd levels should get printed from left to right and even levels should be printed from right to left.

Input Format
Enter the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL */

import java.util.*;
public class Main {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		Main m = new Main();
		BinaryTree bt = m.new BinaryTree();
		bt.levelOrderZZ();
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

		public void levelOrderZZ() {
        
        Stack<Node> mn =new Stack<>();   // main stack
        Stack<Node> child =new Stack<>(); // child Stack
        mn.push(root);
        
        int level=1;
        
        while(true){
            
            int size=mn.size();
            if(size==0)
				break;
            
            while(size-->0){
                
                root=mn.pop();
				System.out.print(root.data+" ");
                
                if(level%2==1){
                    
                    if(root.left!=null)
                        child.push(root.left);
                    if(root.right!=null)
                        child.push(root.right);
                }
                else{
                    
                     if(root.right!=null)
                        child.push(root.right);
                     if(root.left!=null)
                        child.push(root.left);
                }
            }
            level++;
            mn=child;
            child=new Stack<>();
        	}
		}

	}

}
