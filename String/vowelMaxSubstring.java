// print the maximum substing vowel in string.

public class vowelMaxSubstring {

	public static void main(String[] args) {
		
		String str="chaeicdeaeo";
		
		int ans=0;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
				
				char ch=str.charAt(i);
				
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				{
					count++;
				}
				else
				{
					ans=Math.max(ans, count);
					count=0;
				}
				
		}
		ans=Math.max(ans, count);   // if we string contain only vowel.
		System.out.println(ans);
	}

}
