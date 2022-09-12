*     *
**   **
*** ***
*******     // code of this pattern.
*** ***
**   **
*     *
public class p19
{
	public static void main(String[] args) {
		
		int n=4;
		int row=1;
		int star=1;
		int space=2*n-1;
		
		while(row<=2*n+1)
		{
		    int i=1;
		    while(i<=star)
		    {
		        System.out.print("*");
		        i++;
		    }
		    
		    int j=1;
		    while(j<=space)
		    {
		        System.out.print(" ");
		        j++;
		    }
		    
		    int k=1;
		    if(row==2*n/2+1) //to avoid one more star to print.
		        k=2;
		        
		    while(k<=star)
		    {
		        System.out.print("*");
		        k++;
		    }
		    if(row<=(2*n/2))
		    {
		       star++;
		       space-=2;
		       
		    }
		    else
		    {
		        star--;
		        space+=2;
		    }
		    row++;
		    System.out.println();
		}
	}
}
