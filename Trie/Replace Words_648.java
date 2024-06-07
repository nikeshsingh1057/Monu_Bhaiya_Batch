// https://leetcode.com/problems/replace-words/

class Node{
	
	boolean isTerminal;
	Node [] child;       // ye address store kar ke rakhgega.
	Node(){
		child=new Node[26];
	}
}

class Trie_Implement {
	
	Node root;
	Trie_Implement() {  // first time call karenge jisase root me first time ka address aa jaye.
		
		Node nn=new Node();
		nn.isTerminal=false;
		root=nn;
	}
	
	public void insert(String str) {
		
		Node curr=root;   
        
		for(int i=0;i<str.length();i++) {
			
			int idx=str.charAt(i)-'a';
			if(curr.child[idx]==null) 
				curr.child[idx]=new Node();
			
			curr=curr.child[idx];
		}
		curr.isTerminal=true;   
	}
	
	public void search(String str, StringBuilder sb) {
		
		Node curr=root;
        StringBuilder temp=new StringBuilder();

		for(char c : str.toCharArray()) {
			
			int idx=c-'a';
            temp.append(c);
			if(curr.child[idx]==null){ // present nahi hai dict me 
                sb.append(str);
				return ;
            }
            curr=curr.child[idx];  
            if(curr.isTerminal==true){ 
                sb.append(temp);
                return;
            }
		}
        sb.append(str); // suppose in e.g 1 sentance contain "ca" then tab ke liye. becasue ca ka prefix present hai but ca is not present in dictionary so ca ko direct outside add karna hoga.
	}
} 
class Solution {
    public String replaceWords(List<String> dictionary, String str) {
        
        Trie_Implement t=new Trie_Implement();
        String arr[]= str.split(" ");
        
        for(String s : dictionary)
            t.insert(s);
        
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<arr.length;i++){
            
            t.search(arr[i],sb);
            if(i<arr.length-1)
                sb.append(" ");
        }
        
        return sb.toString();
    }
}
