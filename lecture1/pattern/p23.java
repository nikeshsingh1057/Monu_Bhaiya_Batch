import java.util.*;
public class Main
{
 3 2 1 0 1 2 3 
  2 1 0 1 2   
    1 0 1     
      0       //print this pattern
    1 0 1     
  2 1 0 1 2   
3 2 1 0 1 2 3 
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=2*n+1;
		int sapce=0;
		int count=n;
		while(row<=2*n+1)
		{
		    int i=1;
		    while(i<=sapce)
		    {
		        System.out.print("  ");
		        i++;
		    }
		    
		    int j=1;
		    int num=count;
		    int num2=0;
		    while(j<=star)
		    {
		        
		        if(num>=1){
		            System.out.print(num+" ");
		            num--;}
		            
		        else{
		            System.out.print(num2+" ");
		            num2++;}
		        j++;
		    }
		    
		    int k=1;
		    while(k<=sapce)
		    {
		        System.out.print("  ");
		        k++;
		    }
		   //mirroring kiye hai yaha.
 		   if(row<=(2*n/2))
		   {
 		     star-=2;
 		     sapce+=1;
 		     count--;
 		   }
 		   
 		   else
 		   {
 		       star+=2;
 		       sapce-=1;
 		       count++;
 		   }
 		   System.out.println();
 		   row++;
		}
	}
}
