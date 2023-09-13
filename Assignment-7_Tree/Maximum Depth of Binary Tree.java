// Maximum Depth of Binary Tree      i.e hight pata karn hai tree ka
/*
Given a binary tree, find the maximum depth of the tree.

Input Format
Enter the value of the node then the Boolean choice i.e whether the node has a left child , then enter the left child's data . The input acts in a recursive manner i.e when the left child's children are made only then we move onto the parent's right child

Constraints
None

Output Format
Print the depth of the binary tree.

Sample Input
10 true 20 true 73 false false true 50 false false true 
Output 
3
*/
import java.util.*;
class Node{

	int data;
	Node left;
	Node right;
}
public class Main {

    static Scanner sc=new Scanner(System.in);

    public static void main (String args[]) {

        Node root=createtree();
        System.out.println(hight(root));
    }
    public static Node createtree() {
		
		int item=sc.nextInt();
		Node nn=new Node();
		nn.data=item;
		
		boolean hlc=sc.nextBoolean();
		if(hlc==true) {
			nn.left=createtree();
		}
		
		boolean hrc=sc.nextBoolean();
		if(hrc==true) {
			nn.right=createtree();
		}

		return nn;
	} 
	public static int hight(Node root){

		if(root==null)
			return 0;
		
		return Math.max(hight(root.left),hight(root.right))+1;
	}
}
