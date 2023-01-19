// print key pad combination



public class keypadcombination {
	public static String [] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void main(String[] args) {
		
		PrintKeyCombination("23","");

		System.out.println();
		
		PrintKey("23", 0, "");
	}

	// method 1st 
	public static void PrintKey(String str,int idx, String combination)
	{
		if(str.length()==0)
		{
			System.out.print(combination+" ");
			return ;
		}
		char curr=str.charAt(0);
		String map=keypad[curr-'0'];
		
		for(int i=0;i<map.length();i++)
			PrintKey(str.substring(1),idx, combination+map.charAt(i));
	}
	// method 2 sir wala.
	public static void PrintKeyCombination(String str,String combination)
	{
		if(str.length()==0)
		{
			System.out.print(combination+" ");
			return ;
		}
		char curr=str.charAt(0);
		String map=keypad[curr-'0'];

		for(int i=0;i<map.length();i++)
			PrintKeyCombination(str.substring(1), combination+map.charAt(i));
	}
}

