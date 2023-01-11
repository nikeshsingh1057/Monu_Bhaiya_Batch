
// count All subsequance of String, also print subsequance.

public class count_All_Sbusrquance {
	
	public static void main(String[] args) {
		
		String str="abc";
	
		System.out.println(count(str,""));
	}
	public static int count(String str,String ans)
	{

		if(str.length()==0)
		{
			return 1;
		}
		char ch=str.charAt(0);
		
		int a=count(str.substring(1),ans);
		int b=count(str.substring(1),ans+ch);
		return a+b;
	}
}

// o/p==  c b bc a ac ab abc 8
