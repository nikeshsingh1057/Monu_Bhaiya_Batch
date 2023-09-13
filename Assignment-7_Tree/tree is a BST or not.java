// tree is a BST or not
/*
Given a binary tree, determine whether it is a BST.

Input Format
Level order traversals given where -1 means child is NULL

Constraints
-10^5<=nodes.data<=10^5

Output Format
true or false

Sample Input
20 10 30 -1 -1 5 40 -1 -1 -1 -1 
Sample Output
false
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

    static int prev=-1;
    public static void main(String[] arges){

        Node root=CreateTree();
        boolean f=check(root);
        System.out.println(f);
    }
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
    // fucntion to check bst
    public static boolean check(Node root){
        if(root==null)
            return true;
        boolean f=check(root.left);
        if(f==false)
            return false;
        if(prev>root.data)
            return false;
        prev=root.data;
        f=check(root.right);
        if(f==false)
            return false;
        return true;
    }
}
