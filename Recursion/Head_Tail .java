
// print all head and tail if coin is tossed  i.e if coin is tossed two times o/p is hh ht th tt
public class Head_Tail {

	public static void main(String[] args) {
	
		int coin=3;
		
		print_headTail(coin,""); 
		System.out.println();
		
		System.out.println(countTotal(coin,""));
	}

	public static void print_headTail(int coin,String ans)
	{
		if(coin==0)
		{
			System.out.print(ans+" ");
			return;
		}
		print_headTail(coin-1,ans+"H");
		print_headTail(coin-1,ans+"T");
	}
	
	// also count total number of ans.
	
	public static int countTotal(int coin,String ans)
	{
		if(coin==0)
			return 1;
		
		int a=countTotal(coin-1,ans+"H");
		int b=countTotal(coin-1,ans+"T");
		
		return a+b;
		
	}
}
