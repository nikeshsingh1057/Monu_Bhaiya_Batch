// Largest BST in a Binary Tree

/*Given a Binary Tree, write a program that returns the size of the largest subtree which is also a Binary Search Tree (BST)

Input Format
The first line of input will contain an integer n. The next line will contain n integers denoting the the preorder traversal of the BT.
The next line will contain n more integers denoting the inorder traversal of the BT.

Sample Input
4
60 65 50 70
50 65 60 70

Sample Output
2
*/

import java.util.Scanner;

class Main {
	static class BinaryTree {

		private class Node {
			int data;
			Node left;
			Node right;

			Node(int data, Node left, Node right) {
				this.data = data;
				this.left = left;
				this.right = right;
			}
		}

		private Node root;
		private int size;

		public int size() {
			return this.size;
		}

		public boolean isempty() {
			return this.size == 0;
		}

		public BinaryTree() {
			Scanner scn = new Scanner(System.in);
			this.root = this.takeinput(scn, null, false);
		}

		private Node takeinput(Scanner scn, Node parent, boolean leftorright) {
			if (parent == null) {
				System.out.println("Enter the data for root");
			} else {
				if (leftorright) {
					System.out.println("Enter the data for left child of" + parent.data);
				} else {
					System.out.println("Enter the data for right child of" + parent.data);
				}
			}
			int cdata = scn.nextInt();
			Node child = new Node(cdata, null, null);
			this.size++;
			boolean choice = false;
			System.out.println("Do you want have left child for" + child.data);
			choice = scn.nextBoolean();
			if (choice) {
				child.left = this.takeinput(scn, child, true);
			}
			System.out.println("Do you have a right child");
			choice = scn.nextBoolean();
			if (choice) {
				child.right = this.takeinput(scn, child, false);
			}
			return child;
		}

		public void display() {
			this.display(this.root);
		}

		private void display(Node node) {
			if (node.left != null) {
				System.out.print(node.left.data + " =>");
			} else {
				System.out.print("END =>");
			}
			System.out.print(node.data + "<= ");
			if (node.right != null) {
				System.out.print(node.right.data);
			} else {
				System.out.print("END");
			}
			System.out.println();
			if (node.left != null) {
				this.display(node.left);
			}
			if (node.right != null) {
				this.display(node.right);
			}
		}

		/////////////////// New Constructor//////////

		public BinaryTree(int[] pre, int[] in) {
			// this.root = this.construct(pre, 0, pre.length - 1, in, 0, in.length -
			// 1);//for preorder
			this.root = this.construct(pre, in, 0, in.length - 1);// for
																	// postorder

		}

		private static int preIndex = 0;

		private Node construct(int[] pre, int[] in, int isi, int iei) {
			if (isi > iei) {
				return null;
			}
			Node tNode = new Node(pre[preIndex++], null, null);

			if (isi == iei) {
				return tNode;
			}

			int inIndex = search(in, isi, iei, tNode.data);
			tNode.left = construct(pre, in, isi, inIndex - 1);
			tNode.right = construct(pre, in, inIndex + 1, iei);
			return tNode;

		}

		private int search(int[] arr, int si, int ei, int data) {
			for (int i = si; i <= ei; i++) {
				if (arr[i] == data)
					return i;
			}
			return -1;
		}

		// ye pair class hai jisme information hoga humara.
		// yani isme jum apna information rakhange valid largest BST ka.
		
		class BstPair {

			boolean isbst = true;
			long min = Long.MAX_VALUE;
			long max = Long.MIN_VALUE;
			int size = 0;

		}

		public int largestBSTinBT() {

			return largestBSTinBT(root).size;
		}

		//Complete this // ISKE ANDER CODE LIKHAN HAI o.k
		// here we werite code.
		
		public BstPair largestBSTinBT(Node root) {
			
			if (root == null) {
				return new BstPair();
			}
			BstPair lbp = largestBSTinBT(root.left);
			BstPair rbp = largestBSTinBT(root.right);
			
			BstPair sbp = new BstPair();

			sbp.max = Math.max(lbp.max, Math.max(rbp.max, root.data));
			sbp.min = Math.min(root.data, Math.min(lbp.min, rbp.min));

			if (lbp.isbst && rbp.isbst && lbp.max < root.data && rbp.min > root.data) {
				sbp.isbst = true;
				sbp.size = lbp.size + rbp.size + 1;

			} else {
				sbp.isbst = false;
				sbp.size = Math.max(lbp.size, rbp.size);
			}
			return sbp;
		}

	}

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] pre = new int[n];
		int[] in = new int[n];
		for (int i = 0; i < n; i++) {
			pre[i] = scn.nextInt();
		}
		for (int i = 0; i < n; i++) {
			in[i] = scn.nextInt();
		}

		BinaryTree bt = new BinaryTree(pre, in);
//		bt.display();
		System.out.println(bt.largestBSTinBT());
	}
}
