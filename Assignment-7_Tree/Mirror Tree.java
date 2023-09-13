// Mirror Tree
/*
Given a binary tree , Check if its mirror image is equal to the tree itself.

Input Format
The first line of the input contains level order traversal of the tree as space separated integers . In the level order traversal , -1 represent a null child while any other value represent a node of the tree.

Constraints
1<=number of nodes in the tree <=10^5

Output Format
Print "YES" without quotes if the mirror image of the tree is equal to the tree itself , else print "NO" without quotes.

Sample Input
1 2 2 -1 -1 -1 -1
Sample Output
YES
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
    public static void main (String args[]) {

        Node root=CreateTree();
        if(isSymmetric(root))
        System.out.println("YES");
        else
        System.out.println("NO");
    }
    public static boolean isSymmetric(Node root) {
        
        if(root==null)
            return false;
        if(check(root.left,root.right))
            return true;
        return false;
    }
    public static boolean check(Node ll,Node rr){
        
        if(ll==null && rr==null)
            return true;
        
        if(ll==null || rr==null)
            return false;
        
        if(ll.data!=rr.data)
            return false;
        
        boolean left=check(ll.left,rr.right);
        boolean right=check(ll.right,rr.left);
        
        return left && right;
    }
}
