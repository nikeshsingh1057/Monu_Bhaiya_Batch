
public class Main
{
	public static void main(String[] args) {
		
		int n=5;
		int star=n;
		int space=0;
		int i=1;
		while(i<2*n)     // note (2*n-1) row print hoga.
		{
		    int k=1;
		    while(k<=space)
		    {
		        System.out.print("  ");
		        k++;
		    }
		    int j=1;
		    while(j<=star)
		    {
		        System.out.print("* ");
		        j++;
		    }
		    
		    if(i<(2*n)/2)
		    {
		        star-=1;
		        space+=2;
		    }
		    else
		    {
		        star+=1;
		        space-=2;
		    }
		    System.out.println();
		    i++;
		}
	}
}
