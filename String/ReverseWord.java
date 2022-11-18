
public class Reverse_Word {

	public static void main(String[] args) {
		
		// str.trim() -> is used to remove leading and traling space.
		
		String str="      the sky      is blue       "          ;
		
		System.out.println(reverseWords(str));
	}   
	
	public static String reverseWords(String str)
	{
		 str=str.trim();
		
		String[] arr=str.split("\s+");     // s.split("\s+") pluse islay lagaye hai because agar string me eak se jayada space hoga to usko remove kar dega.
		// agar simpley space laga dete to string ke beach wala space nahi remove karta hai.
		
		String ans="";
		
		for(int i=arr.length-1;i>=0;i--)
		{
			ans+=arr[i]+" ";
		}

		ans=ans.trim();
		return ans;
	}
}
