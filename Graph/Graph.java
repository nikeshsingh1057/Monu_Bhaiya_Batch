package Graph;// date-01/11/2023 (lecture-1)

// storing graph.        /* graph implementation */
import java.util.*;

public class Graph {
	
	HashMap<Integer,HashMap<Integer,Integer>> map=new HashMap<>();
	public Graph(int v) {
		
		map=new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i,new HashMap<>());
		}
	}
	// edge connect karwa rahe hai.
	public void AddEdge(int v1,int v2,int cost) {
		map.get(v1).put(v2,cost);
		map.get(v2).put(v1,cost);
	}
	// v1 and v2 me beech me connection hai ya hai vo check kar rahe hai.
	public boolean ContainsEdge(int v1,int v2) {
		return map.get(v1).containsKey(v2);
	}
	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}
	public int no_Of_Edge() {
		
		int ans=0;
		for(int nbrs:map.keySet()) {     // nbrs-> neighbor
			ans+=map.get(nbrs).size();
		}
		return ans/2;
	}
	public void removeEdge(int v1,int v2) {
		map.get(v1).remove(v2);
		map.get(v2).remove(v1);
	}
	
	// remove kar rahe hai kisi value ko (i.e 4 ko graph se remove karna hai.)
	// first 4 ke sare connected ko remove karenge uske badd 4 ko delete karenge.
	public void removeVertex(int v1) {
		for(int nbrs:map.get(v1).keySet()) {
			map.get(nbrs).remove(v1);
		}
	}
	public void display() {
		for(int key:map.keySet())
			System.out.println(key+" "+map.get(key));
	}
	
	// question 1st -> check wheather we can reach from one node to another(i.e 1 se t 6 visit kar sakte hai ya nahi).
	public boolean IsPath(int src,int des,HashSet<Integer>visited) {
		
		if(src==des)
			return true;
		
		visited.add(src);
		for(int nbrs:map.get(src).keySet()) {
			
			if(!visited.contains(nbrs)) {                  // jo visited ho gaya hai usko mark karne ke liye.
				boolean ans=IsPath(nbrs, des,visited);
				if(ans)
					return ans;
			}
		}
		return false;
	}
	// question 2nd -> print all path
	public void print_All_Path(int src,int des,HashSet<Integer> visited,String ans) {
		
		if(src==des) {
			System.out.println(ans+des);
			return;
		}
		visited.add(src);
		for(int nbrs:map.get(src).keySet()) {
			
			if(!visited.contains(nbrs)) {                  
				print_All_Path(nbrs,des,visited,ans+"->"+nbrs);
			}
		}
		visited.remove(src);
	}
}
