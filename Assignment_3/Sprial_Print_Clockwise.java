// Arrays-Spiral Print Clockwise

import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }

        // Arrays-Spiral Print Clockwise
        int te=m*n;
        int count=0;
        int minRow=0;
        int maxRow=n-1;
        int minCol=0;
        int maxCol=m-1;

        while(count<te)
        {
            for(int i=minCol;i<=maxCol && count<te; i++){  //minRow is Fix.
                System.out.print(arr[minRow][i]+","+" ");
                count++;
            }
            minRow++;

            for(int i=minRow;i<=maxRow && count<te; i++){
                System.out.print(arr[i][maxCol]+","+" "); // maxCol is fix.
                count++;
            }
            maxCol--;

            for(int i=maxCol;i>=minCol && count<te; i--){
                System.out.print(arr[maxRow][i]+","+" "); // maxRow is fix.
                count++;
            }
            maxRow--;

            for(int i=maxRow;i>=minRow && count<te; i--){
                System.out.print(arr[i][minCol]+","+" "); // minCol is fix.
                count++;
            }
            minCol++;
        }
        System.out.print("END");
    }
}
