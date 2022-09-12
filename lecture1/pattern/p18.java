
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int space=n-1;
		int space2=1;
		int star=1;
		int row=1;
		while(row<=n)
		{
		    int i=1;
		    while(i<=space)
		    {
		        System.out.print("  ");
		        i++;
		    }
		    int j=1;
		    int nu=j*star;
		    while(j<=star)
		    {
		        System.out.print(nu+" ");
		        j++;
		        nu--;
		    }
		    int k=1;
		    while(k<space2)
		    {
		        System.out.print("  ");
		        k++;
		    }
		    int l=1;
		    if(row==1|| row==n)
		    {
		        l=2;
		    }
		    int n2=1;
		    while(l<=star)
		    {
		        System.out.print(n2+" ");
		        l++;
		        n2++;
		    }
		    
		    if(row<n/2+1)
		    {
		        
		        space2+=2;
		        space-=2;
		        star+=1;
		    }
		    else
		    {
		        space2-=2;
		        space+=2;
		        star-=1;
		    }
		    System.out.println();
		    row++;
		}
	}
}

        1 
    2 1     1 2 
3 2 1         1 2 3 
    2 1     1 2 
        1 
