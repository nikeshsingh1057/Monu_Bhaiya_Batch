package BitMasking;

public class LeetCode_421 {

	public static class Node{
		
		Node zero;
		Node one;
	}
	public static void Insert(Node root,int val) {
		
		Node curr= root;
		for(int i=31; i>=0 ;i--) {
			
			int bit=(val & (1<<i));
			if(bit==0) {
				if(curr.zero!=null)
					curr =curr.zero;
				else {
					Node nn=new Node();
					curr.zero=nn;
					curr=nn;
				}
			} 
			else {
				if(curr.one!=null) {
					curr=curr.one;
				}
				else {
					Node nn=new Node();
					curr.one=nn;
					curr=nn;
				}
			}
		}

	}
	public static void main(String[] args) {
		
		int [] arr= {3,10,5,25,2,8};
		Node root=new Node();
		
		for(int val:arr) {
			Insert(root, val);
		}
		int ans=Integer.MIN_VALUE;
		
		for(int val:arr)
			ans=Math.max(ans,getXor(root,val));
	}
	public static int getXor(Node root,int val) {
		
		Node curr=root;
		int xor=0;
		for(int i=31;i>=0;i--) {
			int bit=(val&(1<<i));
		}
	}
}
