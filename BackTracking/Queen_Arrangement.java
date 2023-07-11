package BackTracking;

// 2 select karne ka ways kitna ho sakta hai.
// uska code abhi nahi like hai.
// 2 queen ko kitne tarika se 1 d array me arrange kar sakte hai (no ducbicate allow).

public class Queen_Arrangement {

	public static void main(String[] args) {
		
		String str="aac";
		Arrangement(str,"");
		
	}
	public static void Arrangement(String str,String ans)
	{
	
		if(ans.length()==2)
		{
			System.out.print(ans+" ");           //ac ac aa 
			return;
		}
		
		if(str.length()==0) {
			return;
		}
	
		char ch=str.charAt(0);
		
		Arrangement(str.substring(1),ans);
		Arrangement(str.substring(1),ans+ch);
	}
	// now for queen arrangement
	
	public static void queen1D() {
		
	}
}

// ac ac aa 
