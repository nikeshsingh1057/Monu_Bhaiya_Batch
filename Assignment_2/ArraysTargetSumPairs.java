//  Take as input N, the size of array. Take N more inputs and store that in an array. Take as input “target”, a number. Write a function which prints all pairs of numbers which sum to target.

// I/P -->1 3 4 2 5 5
// O/P-->1 and 4
//      2 and 3

import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int t=sc.nextInt();
        Arrays.sort(arr);
        int i=0,j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==t)
            {
                System.out.println(arr[i]+" and "+arr[j]);
                j--;
            }
            else if(arr[i]+arr[j]<t)
                i++;
            else
                j--;
        }
    }
}
