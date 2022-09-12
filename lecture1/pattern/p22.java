import java.util.*;
public class Main
{
*********
 ******* 
  *****  
   ***   // code of this pattern 
    *    
   ***   
  *****  
 ******* 
*********
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=2*n+1;
		int sapce=0;
		while(row<=2*n+1)
		{
		    int i=1;
		    while(i<=sapce)
		    {
		        System.out.print(" ");
		        i++;
		    }
		    
		    int j=1;
		    while(j<=star)
		    {
		        System.out.print("*");
		        j++;
		    }
		    
		    int k=1;
		    while(k<=sapce)
		    {
		        System.out.print(" ");
		        k++;
		    }
		   //mirroring kiye hai yaha.
 		   if(row<=(2*n/2))
		   {
 		    star-=2;
 		    sapce+=1;
 		   }
 		   
 		   else
 		   {
 		       star+=2;
 		       sapce-=1;
 		   }
 		   System.out.println();
 		   row++;
		}
	}
}
