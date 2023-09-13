// Replace with Sum of greater nodes

/*
Given a binary search tree, replace each nodes' data with the sum of all nodes' which are greater or equal than it. Include the current node's data also.

Input Format
The first line contains a number n showing the length of the inorder array of BST. The next line contains n integers denoting the elements of the array.

Constraints
2 ≤ N ≤ 10^3

Output Format
Print the preorder traversal of the new tree.

Sample Input
7
20 
30 
40 
50 
60 
70 
80
Sample Output
260 330 350 300 150 210 80
*/

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
		int arr[]=new int[n];

		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();

		Node root=InorderSeBST(arr,0,arr.length-1);

        convert(root);
		Display(root);
	}
	// construction of binary serach tree.
	public static Node InorderSeBST(int arr[],int s,int end){
        
        if(s>end)
			return null;
		
		// binary search.
		int mid=s+(end-s)/2;
		Node root=new Node(arr[mid]);

		root.left = InorderSeBST(arr,s,mid-1);
		root.right = InorderSeBST(arr,mid+1,end);

		return root;
    }
	// function to make BST to GST . Note this question is similar/same to leetcode 1008
	// isme hum 0 se start karna hoga.
	public static void convert(Node root){
        
        if (root == null)
        	return ;

    	convert(root.right);   

    	a += root.data;
    	root.data = a; 

    	convert(root.left);
    }
	// function to display updated bst
	public static void Display(Node nn) {
		
		if(nn==null)
			return;

		System.out.print(nn.data+" ");
		Display(nn.left);
		Display(nn.right);
		
	}
}
