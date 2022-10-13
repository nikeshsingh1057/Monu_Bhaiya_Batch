// Deepak has a limited amount of money that he can spend on his girlfriend. So he decides to buy two roses for her. Since roses are of varying sizes, their prices are different. Deepak wishes to completely spend that fixed amount of money on buying roses for her.As he wishes to spend all the money, he should choose a pair of roses whose prices when summed up are equal to the money that he has. Help Deepak choose such a pair of roses for his girlfriend.

import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t--!=0)
        {
            int n=sc.nextInt();
            int [] arr=new int[n];

            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int p=sc.nextInt();

            Arrays.sort(arr);
            int i=0,j=arr.length-1;
            int ans1=0,ans2=0;
            while(i<j)
            {
                if(arr[i]+arr[j]==p)
                {
                    ans1=arr[i];
                    ans2=arr[j];
                    j--;
                }
                else if(arr[i]+arr[j]<p)
                    i++;
                else
                    j--;

            }
            System.out.print("Deepak should buy roses whose prices are "+ans1+" and "+ans2+".");
            System.out.println();
        }
        
    }
}
