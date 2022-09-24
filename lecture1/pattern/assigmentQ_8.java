 
public class Main
{
	public static void main(String[] args) {
		int n=5;
		int k=5;
		for(int i=1;i<=n;i++,k--)
		{
		    for(int j=1;j<=n;j++)
		    {
		        if(j==i || (i!=k && j==k))
		        System.out.print("* ");
		        else 
		        System.out.print("  ");
		    }
		    
		    System.out.println();
		}
	}
}

*       * 
  *   *   
    *     
  *   *   
*       * 
