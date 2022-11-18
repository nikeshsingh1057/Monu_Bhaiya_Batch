// compare two String 

package String;

public class StringCompare {

	public static void main(String[] args) {
		
		String str1="hbtnn";
		String str2="hbt";
		
		System.out.println(str1.compareTo(str2));
		
		// internally compareTo function code implemented by this way.
		System.out.println(Compare(str1,str2));
	}
	public static int Compare(String str1,String str2)
	{
		int i=0;
		int j=0;
		while(i<str1.length() && j<str2.length())
		{
			if(str1.charAt(i)!=str2.charAt(j))
			{
				return str1.charAt(i)-str2.charAt(j);
			}
			i++;
			j++;
		}
		return str1.length()-str2.length();
	}
}
