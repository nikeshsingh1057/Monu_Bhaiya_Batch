import java.util.ArrayList;

public class Tricky_Permutations {

	public static void main(String[] args) {
		
		ArrayList<String> ll=new ArrayList<>();
		String ques = "abcd";
		PrintAnswer(ques,"",ll);
		
		System.out.println(ll);
		
		PrintAnswer_sirWala(ques,"");
	}
	// first method. using arrayLIst
	public static void PrintAnswer(String ques,String ans,ArrayList<String> ll)
	{
		if(ques.length()==0) {  // or ques.length()== original String length .. (here length will be zero so we pass another length variable)
			
			if(ll.contains(ans)==false)
				ll.add(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			
			char ch=ques.charAt(i);
			PrintAnswer(s1+s2,ans+ch,ll);
		}
	}
	// second method sir wala
	public static void PrintAnswer_sirWala(String ques,String ans)
	{
		if(ques.length()==0) {  // or ques.length()== original String length .. (here length will be zero so we pass another length variable)
			
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			
			char ch=ques.charAt(i);
			boolean flag=true;
			for(int j=i+1; j<ques.length() ;j++) {
				
				if(ques.charAt(j)==ch) {
					flag=false;
					break;
				}
			}
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);

			PrintAnswer_sirWala(s1+s2,ans+ch);
		}
	}
}
