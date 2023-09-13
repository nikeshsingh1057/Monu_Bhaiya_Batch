// Lowest Common Ancestor (Binary Tree )
// https://hack.codingblocks.com/app/contests/4948/416/problem

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

        int ele1=sc.nextInt();
		int ele2=sc.nextInt();

		ArrayList<Integer> p1=lca(root,ele1);
		ArrayList<Integer> p2=lca(root,ele2);

		int i=p1.size()-1;
        int j=p2.size()-1;

        while(i>=0 && j>=0 && p1.get(i)==p2.get(j)){  
            i--; j--;
        }
		System.out.println(p1.get(i+1));
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
	public static ArrayList<Integer> lca(Node root,int val){

		if(root==null)
			return new ArrayList<Integer>();
		 ArrayList<Integer> ll=new ArrayList<>();
		 if(root.data==val){
			ll.add(root.data);
			return ll;
		 }
		 ll=lca(root.left,val);
		 if(ll.size()>0){
			 ll.add(root.data);
			 return ll;
		 }
		 ll=lca(root.right,val);
		 if(ll.size()>0){
			 ll.add(root.data);
			 return ll;
		 }
		 return ll;
	}
}
