//In MATLAB, there is a handy function called reshape which can reshape an M × N matrix into a new one with a different size R × C keeping its original data. 
//You are given an M × N matrix MAT and two integers R and C

import java.util.*;
public class Main {
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);

        int m=sc.nextInt();
        int n=sc.nextInt();
        ArrayList<Integer> ll=new ArrayList<Integer>();

        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
                ll.add(arr[i][j]);
            }
        }
        int r=sc.nextInt();
        int c=sc.nextInt();

        if(m*n != r*c)
            print(arr);

        else
        {
            int ans[][]=new int[r][c];
            ans=matrixReshape(arr,r,c,ll);
            print(ans);
        }

    }
    public static void print(int[][] ans)
    {
        for(int i=0;i<ans.length;i++)
        {
            for(int j=0;j<ans[i].length;j++)
               System.out.print(ans[i][j]+" ");

            System.out.println();
        }
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c,ArrayList<Integer>ll) {
        
        if(mat.length*mat[0].length!=r*c)
            return mat;
        
        int [][] arr=new int[r][c];
        int count=0;
        int k=0;
        
        while(count<r)      // changing row 
        {
            for(int i=0;i<c;i++)
            {
                arr[count][i]=ll.get(k);
                k++;
            }
            count++;
        }
        return arr;
    }
}
