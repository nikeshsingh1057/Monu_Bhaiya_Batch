// Replace with Sum ( BST )
/*
Replace each node with the sum of all greater nodes in a given BST

Input Format
Enter the number of nodes N and add N more numbers to the BST

Constraints
None

Output Format
Display the resulting tree

Sample Input
3
2
1
3
Sample Output
5 => 3 <= 0
END => 5 <= END
END => 0 <= END
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
		Node root=null;

		while(n-- != 0){
			int ele=sc.nextInt();
			root=bst_Preorder(root,ele);
		}
		a=0;
        convert(root);
		Display(root);
	}
	// construction of binary serach tree.
	public static Node bst_Preorder(Node root,int value){
        
        if(root==null){
            root=new Node(value);
            return root;
        }
        if(value<=root.data)
            root.left=bst_Preorder(root.left,value);
        else
            root.right=bst_Preorder(root.right,value);
        
        return root;
    }
	// function to make BST to GST . Note this question is similar/same to leetcode 1008
	// isme hum 0 se start karna hoga.
	public static void convert(Node root){
        
        if (root == null)
        	return ;

    	convert(root.right);   

    	int oldRootData = root.data;
    	root.data = a; 
		a += oldRootData; 

    	convert(root.left);
    }
	// function to display updated bst
	public static void Display(Node nn) {
		
		if(nn==null)
			return;
		
		String s="";
		s=" => "+nn.data+" <= ";
		if(nn.left!=null)
			s=nn.left.data+s;
		else
			s="END"+s;
		
		if(nn.right!=null)
			s=s+nn.right.data;
		else
			s=s+"END";
		System.out.println(s);
		
		Display(nn.left);
		Display(nn.right);
	}
}


   
