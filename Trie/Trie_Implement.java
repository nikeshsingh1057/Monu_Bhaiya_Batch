package Trie;

class Node{
	
	boolean isTerminal;
	Node [] child;       // ye address store kar ke rakhgega.
	Node(){
		child=new Node[26];
	}
}

class Trie_Implement {
	
	Node root;
	Trie_Implement() { // first time isko call karenge because star ('*') ka value set karna hai  yani parent banana hai.
		
		Node nn=new Node();
		nn.isTerminal=false;
		root=nn;
	}
	
	public void insert(String str) {
		
		Node curr=root;   // abhi curr node me parent root dal diye yani star ('*') wala ka Node root.
		for(int i=0;i<str.length();i++) {
			
			int idx=str.charAt(i)-'a';
			if(curr.child[idx]==null) 
				curr.child[idx]=new Node();
			
			curr=curr.child[idx];
		}
		curr.isTerminal=true;   // last me string insert hone ke badd true mark kar denge so search karne wqt pata chal jaye ye string hai ke nahi.
	}
	
	public boolean search(String str) {
		
		Node curr=root;
		for(int i=0;i<str.length();i++) {
			
			int idx=str.charAt(i)-'a';
			if(curr.child[idx]==null)
				return false;
			curr=curr.child[idx];
		}
		return curr.isTerminal;
	}
	public boolean startWith(String str) { // startWith matlab string beech me he mil jaye i.e kisi ka prefix ho 
		
		Node curr=root;
		for(int i=0;i<str.length();i++) {
			
			int idx=str.charAt(i)-'a';
			if(curr.child[idx]==null)
				return false;
			curr=curr.child[idx];
		}
		return true;     // yani ye string prefix hai i.e ye string present hai.
	}
	// delete in trie
	public Node Delete(Node root,String str,int i) {
		
		if(root==null) return null;
		
		if(i==str.length()) {
			
			root.isTerminal=false;
			if(isEmpty(root)==true) { // isEmpty me ye check karnege ki ye string single hai ya uske array me koi aur string path bana raha hai.
				return null;
			}
			return root;
		}
		
		int idx=str.charAt(i)-'a'; // to cheking iss index par address hai ya nahi.
		root.child[idx]=Delete(root.child[idx],str,i+1);
		if(isEmpty(root)&& root.isTerminal==false)
			return null;
		return root;
		
	}
	public boolean isEmpty(Node root) {
		
		for(int i=0;i<26;i++) {
			
			if(root.child[i]!=null)  // ye check karega ki koi aur node to iske array me se connect hua hai ya nahi.
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Trie_Implement t=new Trie_Implement();
		t.insert("apple");
		t.insert("app");
		t.insert("cow");
		t.insert("app");
		t.insert("watermelon");
		
		t.Delete(t.root, "apple", 0);
		System.out.println(t.search("apple"));
		System.out.println(t.startWith("app"));
		System.out.println(t.Delete(t.root, "apple", 0));
		System.out.println(t.search("apple"));
		System.out.println(t.Delete(t.root, "cowasdf", 0)); 
		System.out.println(t.search("cow"));
	}
}
