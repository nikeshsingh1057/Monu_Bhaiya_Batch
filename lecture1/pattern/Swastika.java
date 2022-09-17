//Swastika pattern

public class Main
{
*   * * * 
*   *     
* * * * * 
    *   * 
* * *   * 
	public static void main(String[] args) {
		
		int n=7; //(note take odd value)
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		        if(i==n/2+1|| j==n/2+1 || i==1 && j>=n/2+2 ||i==n && j<=n/2 || i<=n/2 && j==1 ||i>=n/2+2 && j==n)
		        System.out.print("* ");
		        else
		        System.out.print("  ");
		    }
		    System.out.println();
		}
	}
}
