package DynamicProgramming;

// https://www.spoj.com/problems/EDIST/            (leetcode par bhee hai).
public class Edit_Distance {

	public static void main(String[] args) {
		
		String s1="FOOD";
		String s2="MONEY";
		System.out.println(edit_distance(s1, s2, 0, 0));
		
	}
	// i->s1, j->s2
	public static int edit_distance(String s1,String s2,int i,int j) {
		
		if(i==s1.length())
			return s2.length()-j;
		if(j==s2.length())
			return s1.length()-1;
		
		int ans=0;
		if(s1.charAt(i)==s2.charAt(j)) {
			ans=edit_distance(s1, s2, i+1, j+1);
		}
		
		else {
			int d=edit_distance(s1, s2, i+1, j);
			int r=edit_distance(s1, s2, i+1, j+1);
			int I=edit_distance(s1, s2, i, j+1);
			ans=Math.min(I,Math.min(r, d))+1;
		}
		return ans;
	}

}
