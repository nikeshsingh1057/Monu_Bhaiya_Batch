// Binary Tree - Max Path Sum
// https://hack.codingblocks.com/app/contests/4948/1339/problem

/* Given a binary tree , print its max path sum.
For this problem, a path is defined as any sequence of nodes from some starting node to any node in the tree along the parent-child connections. The path must contain at least one node and does not need to go through the root.

Input Format
Single line input containing space separated integers denoting the preorder input of the tree. NULL indicates that the node does not exist.

Constraints
1 <= No of nodes <= 10^5

Output Format
Print a single integer denoting the max path sum for the given tree.

Sample Input
8 3 4 1 2 NULL NULL NULL 9 7 NULL NULL NULL 10 NULL 5 NULL NULL NULL 
Sample Output
38
*/

// THIS QUESTION IS SAME AS LEETCODE 124.
// AND ITS ANOTHER VARIATION IS ON GFG => Maximum Path Sum between 2 Special Nodes
// https://practice.geeksforgeeks.org/problems/maximum-path-sum/1

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
    static Scanner sc=new Scanner(System.in);
    public static Node CreateTree(){

        String ele=sc.next();    // taking input.
        if(ele.equals("NULL"))
            return null;

        Node root=new Node(Integer.parseInt(ele));

        root.left=CreateTree();
        root.right=CreateTree();

        return root;
    }
    static int maxSum;;
    public static void main (String args[]) {

        Node root=CreateTree();
        maxSum=Integer.MIN_VALUE;
        maxSumHelper(root);
        System.out.println(maxSum);
    }
    public static int maxPathSum(Node root) {
        
        maxSum = Integer.MIN_VALUE;;;;
        maxSumHelper(root);;;;
        return maxSum; //  maxSum will always store the result

    }

    public static int maxSumHelper(Node root) {
	
        if (root == null) return 0; 
        
        int leftMax = maxSumHelper(root.left);;;;;
        int rightMax = maxSumHelper(root.right);;;;;;
        
        int maxRightLeft = Math.max(leftMax, rightMax);;;;;
        int maxOneNodeRoot = Math.max(root.data, (root.data + maxRightLeft));;;;
        int maxAll = Math.max(maxOneNodeRoot, leftMax + rightMax + root.data);;;;
        
        maxSum = Math.max(maxSum, maxAll);;;;
	
        return maxOneNodeRoot;
    }
}
