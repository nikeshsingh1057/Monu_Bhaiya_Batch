// rotate Matrix 90 degree.
// second varient.

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        // transpose of matrix
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        // reverse of matrix column_wise
        for(int c=0;c<n;c++)
        {                            // column will be fix and row will be vary.
            
            for(int r=0;r<n/2;r++)
            {
                int temp=arr[r][c];
                arr[r][c]=arr[n-r-1][c];   // arr[n-r-1][c] will give last value to be swap from the first arr[r][c]
                arr[n-r-1][c]=temp;
               
            }
        }

        // display of matrix.
        for(int i=0;i<n;i++)
        {
           for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
