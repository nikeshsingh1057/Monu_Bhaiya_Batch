
public class lexicographically_printing {

	public static void main(String[] args) {
		
		int n=100;
		
		// method 1st
		Lexicograhically(0,n);
		
		// method 2
		
	/*	for(int i=1;i<=9;i++)
			lexoPrint(i,n);     */

	}
	// sumit sir wala.
	public static void lexoPrint(int i, int n) {
		
		if(i>n)
			return;
		
		System.out.println(i);
		
		for(int j=0;j<=9;j++)
			lexoPrint(i*10+j,n);
		
	}
	// monu bhaiya wala.
	public static void Lexicograhically(int curr,int num)
	{
		if(curr>num)
		{
			return;
		}
		
		System.out.print(curr+" ");
		int i=0;
		
		if(curr==0) {
			i=1;
		}
		
		for(; i<=9; i++)
		{
			Lexicograhically(curr*10+i,num);
		}
	}
}
