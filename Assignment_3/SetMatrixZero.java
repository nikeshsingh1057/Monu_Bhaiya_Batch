/* Given a M x N matrix consisting of only 0 or 1, change all elements of row i and column j to 0 if cell (i, j) has value 0. 
   Do this without using any extra space for every (i, j) having value 0. */
     
// method 1-> brute force solution using extra space on m*n array.

import java.util.*;
public class Main {
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int [m][n];
        int arr2[][]=new int [m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt(); 
                arr2[i][j]=1;
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i][j]==0)
                {
                    row_change(arr2,i,n);
                    col_change(arr2,j,m);
                }
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

    }
    // making row 0 in arr2
    public static void row_change(int [][] arr2,int row,int n)
    {
        for(int i=0;i<n;i++)
        {
            arr2[row][i]=0;
        }
    }
    // making column 0 arr2
    public static void col_change(int [][] arr2,int col,int m)
    {
        for(int i=0;i<m;i++)
        {
            arr2[i][col]=0;
        }
    }
}
