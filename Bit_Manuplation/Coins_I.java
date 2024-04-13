package BitMasking;

import java.util.Arrays;

// https://atcoder.jp/contests/dp/tasks/dp_i
public class Coins_I {

	public static void main(String[] args) {
		
		double [] c= {0.30,0.60,0.80};
		int n=c.length;
		
		double [][] dp =new double[n+1][(n+4)/2];
		
		for(double [] a: dp)
			Arrays.fill(a,-1);
		
		System.out.println(Probability_Head(c,0,(n+1)/2,dp));

	}
	public static double Probability_Head(double[] c,int i,int h,double [][] dp) {
		
		if(h==0) {
			return 1;
		}
		if(i==c.length)
			return 0;
		
		if(dp[i][h]!=-1) {
			return dp[i][h];
		}
		double ans= c[i] * Probability_Head(c, i+1, h-1,dp) + (1-c[i])*Probability_Head(c, i+1, h,dp);
		
		return dp[i][h]=ans;
	}
}
