// Bottom Up Level Order
/* 
Given a Binary tree, print the bottom-up level order traversal of its nodes, i.e. from left to right, each level from leaf to root.

Input Format
The only line of input contains N space-separated values, i.e. integers or N denoting a null node in their level-order traversal.

Constraints
|node.Value| ≤ 105

Output Format
Print each level on a new line, where the values of each node in the level are separated by a space.

Sample Input
3 9 2 N N 5 7
Sample Output
5 7
9 2
3
*/
import java.util.*;

class Node{

    int data;
    Node left;
    Node right;

    Node(int d){
        data=d;
        left=right=null;
    }
}
class Main {

    public static void main(String args[]) {

       Node root = CreateTree();

       //System.out.println(root.right.left.data);
       //System.out.println(root.right.right.data);

       level(root);      // calling revere order function.
    }
    public static Node CreateTree(){

        Scanner sc=new Scanner(System.in);
        Queue<Node> q=new ArrayDeque<>();

        String ele=sc.nextLine();
        String[] str = ele.split(" ");
        //System.out.println(Arrays.toString(str));
        //System.out.println(str[0]+" "+str[1]+" "+str[2]+" "+str[3]+" "+str[4]+" "+str[5]+" "+str[6]);
        if(str.equals("N"))
            return null;

        Node root=new Node(Integer.valueOf(str[0]));
        int i=1;
        q.add(root);
        while(!q.isEmpty() && i<str.length){

            Node curr=q.poll();

            if(!str[i].equals("N")){
                curr.left=new Node(Integer.valueOf(str[i]));
                q.add(curr.left);
               
            }
            i++;
            if(i<str.length && !str[i].equals("N")){
                curr.right=new Node(Integer.valueOf(str[i]));
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static void level(Node root){
        
        if(root==null)
            return;

        Queue<Node> q = new LinkedList<Node>(); /* to store address of Node */
        Stack<ArrayList<Integer>> st=new Stack<>();
        ArrayList<Integer> ll=new ArrayList<>();
        q.add(root);

        while(true){

             int size=q.size();
             if(size==0)
               break;
        
        while(size-- > 0)
        {
            Node curr=q.poll();
            ll.add(curr.data);
          
            if(curr.left!=null)
                q.add(curr.left);
            if(curr.right!=null)
                q.add(curr.right);
        }
        st.push(ll);
        ll=new ArrayList<>();
     }
     while(!st.isEmpty()){
          
             for(int i:st.pop())
                System.out.print(i+" ");
            System.out.println();
        } 
     }
}
