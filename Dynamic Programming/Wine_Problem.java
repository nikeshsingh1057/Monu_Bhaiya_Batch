package DynamicProgramming;

/* question based on future dp. */

/* wine ka array diye hai jisme cost diya hai (array me). and we can only pick first or last yani pahela wala pick karnege ya last wala
   and year se multipy kareana hai it means sabse pahele 2 ko pick kiye to 1*2 and now year 2 ho gaya jab agla element pick karenge to 
   2 se multiply karna hoga and similarly year badhata ja*/

// another variation is->( Optimal Game Strategy-II assignment ka hai https://hack.codingblocks.com/app/contests/5184/1255/problem)

public class Wine_Problem {

	public static void main(String[] args) {
		
		int [] wine = {2,3,5,1,4};
		System.out.println(maximum_profit(wine, 0, wine.length-1, 1));
		System.out.println(maximum_profitBU(wine));
	}
	// without dp only recursion.
	public static int maximum_profit(int [] wine,int i,int j,int year) {
		
		if(i>j)
			return 0;
		
		int f=wine[i]*year +maximum_profit(wine, i+1, j, year+1);
		int l=wine[j]*year+maximum_profit(wine, i, j-1, year+1);
		
		return Math.max(f,l);
	}
	// with dp
	public static int maximum_profitBU(int [] wine) {
		
		int year=wine.length;
		int [][] dp=new int[wine.length][wine.length];
		for(int i=0;i<dp.length;i++) {
			dp[i][i]=wine[i]*year;
		}
		
		year--;
		for(int slide=1;slide<dp.length;slide++) {
			
			for(int j=slide;j<dp.length;j++) {
				int i=j-slide;
				int f=wine[i]*year+dp[i+1][j];
				int l=wine[j]*year+dp[i][j-1];
				dp[i][j]=Math.max(f,l);
			}
			year--;
		}
		return dp[0][dp.length-1];
	}
}
