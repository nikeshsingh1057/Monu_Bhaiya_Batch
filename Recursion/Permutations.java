// print all permutations of String.

public class Permutations {

	public static void main(String[] args) {
		
		String ques = "abc";
		PrintAnswer(ques,"");
	}
	public static void PrintAnswer(String ques,String ans)
	{
		if(ques.length()==0) {  // or ques.length()== original String length .. (here length will be zero so we pass another length variable)
			
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			
			char ch=ques.charAt(i);
			PrintAnswer(s1+s2,ans+ch);
		}
	}
}
