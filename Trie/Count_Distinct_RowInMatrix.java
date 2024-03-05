package Trie;

public class Count_Distinct_RowInMatrix {
	
	class Node{
		
		Node child[];
		Node(){
			child=new Node[2];
		}
	}
	
	Node root;
	Count_Distinct_RowInMatrix() {  // first time call karwane ke liye. and root ko iniliaze karne ke liye.
		Node nn=new Node();
		root=nn;
	}
	
	public boolean insert(int [][] arr,int row) {
		
		Node curr=root;
		int flag=0;
		for(int i=0;i<arr[0].length;i++) {
			
			int idx=arr[row][i];
			if(curr.child[idx]==null) {
				curr.child[idx]=new Node();
				flag=1;
			}
			curr=curr.child[idx];
		}
		return flag==0;
	}
	public static void main(String[] args) {
		
		Count_Distinct_RowInMatrix t=new Count_Distinct_RowInMatrix();
		int ans=0;
		int matrix[][] = {{1,0,0},{0,1,0},{1,0,0},{0,1,0},{0,1,1}};
		
		for(int i=0;i<matrix.length;i++) {
			
			if(t.insert(matrix, i)==false)
				ans++;
		}
		System.out.println(ans);
	}
}
