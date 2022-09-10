import java.util.*;
public class p12
{
  *********
  **** ****
  ***   ***   //print in this formate.
  **     **
  *       *
	public static void main(String[] args) {
	    
	    int n=5;
	    int i=0;
	    int j=(2*n-1)/2;
	    int space=-1;
	    while(i<=n)
	    {
	        int k=0;
	        while(k<=j)
	        {
	            System.out.print("*");
	            k++;
	        }
	        
	        int s=1;
	        while(s<=space)
	        {
	            System.out.print(" ");
	            s++;
	        }
	        
	        int p = 1;             
			    if (i == 0 || i == n) // very very important line if we remove it than it will print one * (star) extra for row first.
				        p = 2;
	        while(p<=j+1)
	        {
	            System.out.print("*");
	            p++;
	        }
	        i++;
	        space+=2;
	        j--;
	        System.out.println();
	    }
	}
}
