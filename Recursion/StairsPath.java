// Get all Stairs Path (see on youtube sumit mallik)

public class Board_Path {

	public static void main(String[] args) {
		
		int n=4;
		PrintPath(0,n,"");

	}
	public static void PrintPath(int src,int des,String ans)
	{
		if(src==des) {
			System.out.print(ans+" ");
			return;
		}
		if(src>des)
			return;
		
      /*  PrintPath(src+1,des,ans+1);
		PrintPath(src+2,des,ans+2);
		PrintPath(src+3,des,ans+3); */
		
		// we can also print with loop if n is very greater because we cannot write manually PrintPath for large testcase.
		for(int dice=1;dice<=des;dice++)
		{
			PrintPath(src+dice,des,ans+dice);
		}
		
	}
}
