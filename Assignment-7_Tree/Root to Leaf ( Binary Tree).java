// Root to Leaf ( Binary Tree)
/* Given a binary tree and a number k, print out all root to leaf paths where the sum of all nodes value is same as the given number.

Input Format
First line contains the values of all the nodes in the binary tree in pre-order format where true suggest the node exists and false suggests it is NULL.
Second line contains the number k.*/

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
        int k=sc.nextInt();

		ArrayList<ArrayList<Integer>> ans=printPaths(root,k);

		for(int i=0;i<ans.size();i++){
			// isme ans ke eak eak list ko for each se print krwa rahe hai.
			for(int ele:ans.get(i))    // ans.get(i) me ith postion ka list jo ans ke list me hai.
				System.out.print(ele+" ");
		}
		System.out.println();
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
	// gfg ka code hai question => Paths from root with a specified sum
    // same question hai vaha solve thaa ya paste kar diye hai. O.K
	public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer>ll=new ArrayList<>();
        path(root,ans,ll,sum);
        return ans;
    }
    public static void path(Node root,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer>ll,int sum){
        
        if(root==null)
        return;
        
        ll.add(root.data);
        if(sum==root.data && root.left==null && root.right==null){
            ans.add(new ArrayList<>(ll));
        }
        
        path(root.left,ans,ll,sum-root.data);
        path(root.right,ans,ll,sum-root.data);
        
        ll.remove(ll.size()-1);
    } 
}
