//rectanglar pattern
public class p1
{
 public static void main(String[] args) {
     
 int n=5;
 int row=1;
 int star;
 while(row<=n)
 {
     star=0;
     while(star<row)
     {
         System.out.print("*"+" ");
         star++;
     }
     System.out.println();
     row++;
 }
}

}
