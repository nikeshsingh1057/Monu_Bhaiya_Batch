// no two head together.

public class NoTwoHeadTogether {
	
	public static void main(String[] args) {
		
		int coin=3;
		
		No_tow_Head_Together(coin,"");
	}
	public static void No_tow_Head_Together(int coin,String ans)
	{
		if(coin==0)
		{
			System.out.print(ans+" ");
			return;
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
			No_tow_Head_Together(coin-1,ans+"H");
		
		No_tow_Head_Together(coin-1,ans+"T");
	}
}
