// Root to Leaf - ||
// https://hack.codingblocks.com/app/contests/4948/1680/problem

/* Given a binary tree and an integer sum,Print count of root-to-leaf paths that have path's sum equal to given integer sum.

Input Format
The first line contains level order traversal of the tree . In the level order traversal given, -1 represent a null child while any other value represent a node of the tree.
Next line contains a single integer sum.

Constraints
1<=number of nodes in the tree <=10^5

Output Format
Print a single integer equal to number of root to leaf paths with given sum.

Sample Input
1 2 3 -1 -1 -1 -1
3
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

    static Scanner sc=new Scanner(System.in);
    public static Node CreateTree(){

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
    public static void main (String args[]) {

        Node root=CreateTree();
        int t=sc.nextInt();
        System.out.println(Path(root,t));
    }
    public static int Path(Node root, int t){
        if(root==null)
            return 0;

        if(root.left==null && root.right==null && root.data==t){
            return 1;
        }
        int l=Path(root.left,t-root.data);
        int r=Path(root.right,t-root.data);

        return l+r;
    }
}
