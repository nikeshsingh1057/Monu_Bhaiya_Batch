/* 
Given preorder and inorder create the tree

Input Format
Enter the size of the preorder array N then add N more elements and store in the array denoting the preorder traversal of the tree. Then enter the size of the inorder array M and add M more elements and store the inorder traversal of the array.

Constraints
1 <= N, M <= 10^4

Output Format
Display the tree using a modified preorder function. For each node , first print its left child's data , then the data of the root itself , then the data of its right child. Do this for each node in a new line in preorder manner. If one of the children does not exist print END in its place. Refer to the sample testcase.

Sample Input
3
1 2 3
3
3 2 1
Sample Output
2 => 1 <= END
3 => 2 <= END
END => 3 <= END
*/

import java.util.*;

class Node {

	int data;
	Node left;
	Node right;
}
public class Main {
	static int PreIdx;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int pre[]=new int[n];
		for(int i=0;i<n;i++)
			pre[i]=sc.nextInt();

		int m=sc.nextInt();
		int ind[]=new int [m];
		for(int i=0;i<m;i++)
			ind[i]=sc.nextInt();

		Node root=buildTree(pre,ind);
		Display(root);
	}
	public static Node buildTree(int[] pre, int[] ind) {
        
        PreIdx=0;
        return BuildTree(pre,ind,0,pre.length-1);
    }
	public static Node BuildTree(int[] pre, int[] ind, int start, int end) {

        if (start > end)
            return null;

        Node root = new Node();
		root.data=pre[PreIdx++];

        int pos=0;
        for(int i=start;i<=end;i++){
            if(ind[i]==root.data){
                pos=i;
                break;
            }
        }
        root.left = BuildTree(pre, ind, start, pos - 1);
        root.right = BuildTree(pre, ind, pos + 1, end);

        return root;
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
