// Binary Tree Maximum Path Sum
/* 
Given a binary tree, find the maximum path sum in it.
The path is defined as a sequence of nodes that follows parent-child connection.Path may start from any node and end at any node.

Input Format
The first line of input contains level order traversal of the tree.In the input , a -1 value represent a null child while any other value represent a node in the tree.

Constraints
1<=number of nodes in the tree <=10^5

Output Format
Print a single integer equal to maximum path sum in the given tree.

Sample Input
1 4 6 -1 -1 -1 -1
Sample Output
11
*/

import java.util.*;
class Node{

    int data;
    Node left;
    Node right;

    Node(int d){
        data=d;
        left=right=null;
    }
}
public class Main {

    static int maxSum;
    public static Node CreateTree(){

        Scanner sc=new Scanner(System.in);
        Queue<Node> q=new ArrayDeque<>();
        int ele=sc.nextInt();
        if(ele==-1)
            return null;

        Node root=new Node(ele);
        q.add(root);
        while(q.size()>0){

            Node curr=q.poll();
            int l=sc.nextInt();
            if(l!=-1){
                curr.left=new Node(l);
                q.add(curr.left);
            }
            int r=sc.nextInt();
            if(r!=-1){
                curr.right=new Node(r);
                q.add(curr.right);
            }
        }
        return root;
    }
    // main function hai.
    public static void main (String args[]) {

        Node root=CreateTree();
        maxPathSum(root);
        System.out.println(maxSum);
    }
    public static int maxPathSum(Node root) {
        
        maxSum = Integer.MIN_VALUE;
        maxSumHelper(root);
        return maxSum; // as maxSum will always store the result
    }
    public static int maxSumHelper(Node root) {
		
		// base case
        if (root == null) return 0; 
		
		// recursing through left and right subtree
        
        int leftMax = maxSumHelper(root.left);;;;;
        int rightMax = maxSumHelper(root.right);;;;;;

		// finding all the four paths and the maximum between all of them
        
        int maxRightLeft = Math.max(leftMax, rightMax);
        int maxOneNodeRoot = Math.max(root.data, (root.data + maxRightLeft));
        int maxAll = Math.max(maxOneNodeRoot, leftMax + rightMax + root.data);
		
		// Storing the result in the maxSum holder
        
        maxSum = Math.max(maxSum, maxAll);
		
		// returning the value if root was part of the answer
        return maxOneNodeRoot;

    }
}
