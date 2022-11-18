// print all the substring of string

public class SubStringPrint {

	public static void main(String[] args) {
		
		String str="cha";
		for(int i=0;i<str.length();i++)
		{

			for(int j=i;j<str.length();j++)
			{
				System.out.println(str.substring(i,j+1)); //this will aslo print same ans. we do j+1 since substring fn run 1 less .
				
//				Substring(str,i,j);
//				System.out.println();
			}
		}
		
	}
	// substring printing built function implementation.
	public static void Substring(String str,int i,int j)
	{
		while(i<=j)
		{
			System.out.print(str.charAt(i));
			i++;
		}
	}

}
