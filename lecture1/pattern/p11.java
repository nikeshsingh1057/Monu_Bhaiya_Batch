public class Main
{
  1     1
  12   21 // print this pattern.
  123 321
  1234321
	public static void main(String[] args) {
		
		int n=4;
		int space=2*n-3; // for space.
	  
		int i=1;
		while(i<=n)
		{
		    int j=1;
		    while(j<=i)
		    {
		        System.out.print(j);
		        j++;
		    }
		    
		    int k=1;
		    while(k<=space)
		    {
		        System.out.print(" ");
		        k++;
		    }
		    
		    int l=1;    // space print karne ke badd jo digit hai uske liye hai.
		    int v=i;
		    while(l<=i)  // i tak ilsy chalega because jitna space ke pahale hai utna hee badd me bhee hai.
		    {
		        if(v==n)
		        v=n-1;
		        
		        if(l!=n)  // because it print one more digit.(show to avoid it we do it).
		        System.out.print(v);
		        v--;
		        l++;
		    }
		    i++;
	        space-=2;
		    System.out.println();
		}
	}
}
