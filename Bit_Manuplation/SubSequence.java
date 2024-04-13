package BitMasking;

public class SubSequence {

	public static void main(String[] args) {
		
		String str = "abc";
		//subsequence(str);
		Subsequence(str,str.length());
	}
	
	private static void Subsequence(String str,int len) {
		
		for(int i=0;i<(1<<len);i++) {    // 2^n    tak chalega
			
			int n=i;                     // yaha i -> , n ban jayega see code of count all bit.
			String ans="";
			for(int j=0;j<len;j++) {
				
				if((n&(1<<j)) != 0) 
					ans+=str.charAt(j);		
			}
			System.out.println(ans);
		}
	}
	
	
	public static void subsequence(String str) {
		
		int n=str.length();
		
		for(int i=0;i<(1<<n);i++) 
			GeneratePattern(str,i);
		
	}
	public static void GeneratePattern(String str,int i) {
		
		int pos=0;
		while(i>0) {
			
			if((i&1) != 0) {
				System.out.print(str.charAt(pos));
			}
			pos++;
			i >>= 1;
		}
		System.out.println();
	}
}
