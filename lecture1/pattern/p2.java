
public class p2 {
	
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int space=0;
        int star=n;
        while(row<=n)
        {
            int i=1;
            while(i<=space)
            {
                System.out.print("  ");
                i++;
            }
            int j=1;
            while(j<=star)
            {
                System.out.print("* ");
                j++;
            }
            space+=2;
            star--;
            System.out.println();
            row++;
        }
        //isme mirroring  do iska ulta print ho jayega.
        // if else laga kar
    }
}

