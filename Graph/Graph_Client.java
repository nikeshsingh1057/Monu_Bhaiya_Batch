package Graph;

import java.util.HashSet;

public class Graph_Client {

	public static void main(String[] args) {
		
		Graph g=new Graph(7);
		
		g.AddEdge(1, 2, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		
		g.display();
		// question 1st -> check wheather we can reach from one node to another(i.e 1 se t 6 visit kar sakte hai ya nahi).
		HashSet<Integer> visited=new HashSet<>();
		System.out.println(g.IsPath(1, 6,visited));
		
		// question 2nd -> print all path
		visited=new HashSet<>();
		g.print_All_Path(1, 6, visited, "");
	}

}
