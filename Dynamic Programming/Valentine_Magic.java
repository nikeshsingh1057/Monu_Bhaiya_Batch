package DynamicProgramming;

import java.util.Arrays;

// https://codeskiller.codingblocks.com/problems/281    (coding block ka hai).
public class Valentine_Magic {

	public static void main(String[] args) {
		
		int [] boys= {2,11,3};
		int [] girls= {5,7,3,2};
		
		Arrays.sort(boys);
		Arrays.sort(girls);
		System.out.println(minDiff(boys, girls, 0, 0));
	}
	public static int minDiff(int [] boys,int [] girls,int i,int j) {
		
		if(i==boys.length)
			return 0;
		if(j==girls.length)
			return 9999999;
		int pair = Math.abs(boys[i]-girls[j]) + minDiff(boys, girls, i+1, j+1);
		int No_Pair = minDiff(boys, girls, i, j+1);
		return Math.min(pair,No_Pair);
	}
}
