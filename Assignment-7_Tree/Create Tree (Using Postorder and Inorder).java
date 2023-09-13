// Create Tree (Using Postorder and Inorder)
/* Given postorder and inorder traversal of a tree. Create the original tree on given information.

Input Format
Enter the size of the postorder array N then add N more elements and store in the array, then enter the size of the inorder array M and add M more elements and store in the array. here M and N are same.

Constraints
None

Output Format
Display the tree using the display function

Sample Input
3
1
3
2
3
1
2
3
Sample Output
1 => 2 <= 3
END => 1 <= END
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
		int post[]=new int[n];
		for(int i=0;i<n;i++)
			post[i]=sc.nextInt();

		int m=sc.nextInt();
		int ind[]=new int [m];
		for(int i=0;i<m;i++)
			ind[i]=sc.nextInt();

		Node root=buildTree(post,ind);
		Display(root);
	}
	public static Node buildTree(int[] post, int[] ind) {
        
        PreIdx=post.length-1;
        return BuildTree(post,ind,0,post.length-1);
    }
	public static Node BuildTree(int[] post, int[] ind, int start, int end) {

        if (start > end || PreIdx==-1)
            return null;

        Node root = new Node();
		root.data=post[PreIdx--];

        int pos=0;
        for(int i=start;i<=end;i++){
            if(ind[i]==root.data){
                pos=i;
                break;
            }
        }

		root.right = BuildTree(post, ind, pos + 1, end);
		root.left = BuildTree(post, ind, start, pos - 1);
		
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
