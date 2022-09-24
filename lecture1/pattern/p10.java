public class Main
{
  //opposite star pattern. (like this but here i print only star).
                       *           *
                       * *       * *  
                       * * *   * * *
                       * * * * * * *
	public static void main(String[] args) {
		
		int n=4;
		int space=2*n-3; // for space.
	  
		int i=1;
		while(i<=n)
		{
		    int j=1;
		    while(j<=i)
		    {
		        System.out.print("*");
		        j++;
		    }
		    
		    int k=1;
		    while(k<=space)
		    {
		        System.out.print(" ");
		        k++;
		    }
		    
		    int l=1;
		    while(l<=i)
		    {
		        if(l!=n)  // because it print one more digit.(show to avoid it we do it).
		        System.out.print("*");
		        
		        l++;
		    }
		    i++;
	        space-=2;
		    System.out.println();
		}
	}
}
