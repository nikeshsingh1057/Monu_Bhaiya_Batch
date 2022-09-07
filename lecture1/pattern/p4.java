public class p4 {
	
    public static void main(String[] args) {
        
        int row=0;
        int n=5;
        int space=n;
        int k=1;
        while(row<n)
        {
            int i=0;
            while(i<space-1)
            {
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<2*k)
            {
                System.out.print("*");
                j++;
            }
            space--;
            row++;
            k++;
            System.out.println();
        }
    }
}
