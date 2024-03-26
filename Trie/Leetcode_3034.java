// https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/
// trie.

class Solution {
    
    
	class Node{
		
		char data;
		boolean isTerminal;
		HashMap<Character,Node> child = new HashMap<>();
	}
	
	private Node root;
	
	public void Trie() {
        
		// System.out.print("helll");
		Node nn=new Node();
		nn.data='*';
		root=nn;
	}
	public void insert(String word) {
		
		Node curr=root;
		
		for(int i=0;i<word.length();i++) {
			
			char ch = word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			}
			else {
				Node nn = new Node();
				nn.data=ch;
				curr.child.put(ch,nn);
				curr=nn;
			}
		}
		curr.isTerminal=true;
	}
	public boolean search(String word) {
		
		Node curr=root;
		
		for(int i=0;i<word.length();i++) {
			
			char ch=word.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr = curr.child.get(ch);
			}
			else {
				return false;
			}
		}
		return curr.isTerminal;
	}
	public int startsWith(String prefix) {
		
		Node curr=root;
        int count=0;
		for(int i=0;i<prefix.length();i++) {
			
			char ch=prefix.charAt(i);
			if(curr.child.containsKey(ch)) {
				curr=curr.child.get(ch);
                count++;
			}
			else {
				return count;
			}
		}
		return count;
	}
    
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        
        Solution t = new Solution();
        t.Trie();
        for(int i=0;i<arr1.length;i++){
            
            t.insert(arr1[i]+"");
        }
        
        int max=0;
        for(int i=0;i<arr2.length;i++){
            
            max=Math.max(max,t.startsWith(arr2[i]+""));
        }
        return max;
    }
}
