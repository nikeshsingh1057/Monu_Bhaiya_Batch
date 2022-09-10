import java.util.*;
public class Main
{
                         1           1
                         1 2       2 1  
                         1 2 3   3 2 1
                         1 2 3 4 3 2 1
	public static void main(String[] args) {
		
        Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();
		int space = 2*n-3; // for space.
	  
		int i=1;
		while(i<=n)
		{
		    int j=1;
		    while(j<=i)
		    {
		        System.out.print(j+"\t");
		        j++;
		    }
		    
		    int k=1;
		    while(k<=space)
		    {
		        System.out.print("\t");
		        k++;
		    }
		    
		    int l=1;    // space print karne ke badd jo digit hai uske liye hai.
		    int v=i;
		    while(l<=i)  // i tak ilsy chalega because jitna space ke pahale hai utna hee badd me bhee hai.
		    {
		        if(v==n)
		        v=n-1;
		        
		        if(l!=n)  // because it print one more digit.(show to avoid it we do it).
		        System.out.print(v+"\t");
		        v--;
		        l++;
		    }
		    i++;
	        space-=2;
		    System.out.println();
		}
	}
}
