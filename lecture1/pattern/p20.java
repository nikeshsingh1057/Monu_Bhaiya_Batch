import java.util.*;
public class p20
{
3           3 
3 2       2 3 
3 2 1   1 2 3  //print pattern in this type.
3 2 1 0 1 2 3 
3 2 1   1 2 3 
3 2       2 3 
3           3 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=1;
		int space=2*n-1;
		
		while(row<=2*n+1)
		{
		    int i=1;
		    int num=n;
		    while(i<=star)
		    {
		        System.out.print(num+" ");
		        i++;
		        num--;
		    }
		    
		    int j=1;
		    while(j<=space)
		    {
		        System.out.print("  ");
		        j++;
		    }
		    
		    int num2=num+1;
		    int k=1;
		    if(row==2*n/2+1) //to avoid one more star to print.
		       {
		           k=2;
		           num2=1;
		       }
		       
		    while(k<=star)
		    {
		        System.out.print(num2+" ");
		        k++;
		        num2++;
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
