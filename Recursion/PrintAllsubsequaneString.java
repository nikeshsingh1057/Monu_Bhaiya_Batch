//print all subsequance.

public class subsequaneString {

	public static void main(String[] args) {
		
		String str="abc";
		String ans="";
		PrintSubsequance(str,ans);
	}
	public static void PrintSubsequance(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.print(ans+" ");
			return;
		}
		char ch=str.charAt(0);
		
		PrintSubsequance(str.substring(1),ans);
		PrintSubsequance(str.substring(1),ans+ch);

	}
}
