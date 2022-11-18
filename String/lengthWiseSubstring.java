
// print substring according to length wise.

public class lengthWiseSubstring {

	public static void main(String[] args) {
		
		String str="apple";
		PrintSubString(str);

	}
	// funtion to print substirg using lengthwise.
	public static void PrintSubString(String str)
	{
		for(int len=1;len<=str.length();len++)
		{
			for(int j=len;j<=str.length();j++)
			{
				int i=j-len;
				
				//System.out.println(str.substring(i,j));  // this is sortcut.
				
				String s=str.substring(i,j);  // we can also do like this way.
				System.out.println(s);
			}
		}
	}
}
