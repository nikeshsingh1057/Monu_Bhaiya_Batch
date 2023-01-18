// 22. Generate Parentheses

public class GenerateParenthasis {

	public static void main(String[] args) {
		
		int n=2;
		Parentheses(n,"",0,0);

	}
	public static void Parentheses(int n,String ans,int open,int close)
	{
		if(open==n && close==n)
		{
			System.out.print(ans+" ");
			return;
		}
		if(open<n) {
			Parentheses(n,ans+"(",open+1,close); 
		}
		if(close<open)  {
			Parentheses(n,ans+")",open,close+1);
		}
	}

}
