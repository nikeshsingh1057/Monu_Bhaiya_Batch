package pattern;

public class p7 {
	
    public static void main(String[] args) {
        
        int row=0;
        int n=5;
        int space=n;
        int star=1;
        while(row<n)
        {
            int i=0;
            while(i<space-1)
            {
                System.out.print(" ");
                i++;
            }
            int j=1;
            int p=1;
            while(j<2*star)
            {
               System.out.print(p);j++;
               if(p<n/2+1)p++;
               else
            	   p--;
            }
            space--;
            row++;
            star++;
            System.out.println();
        }
    }
}
