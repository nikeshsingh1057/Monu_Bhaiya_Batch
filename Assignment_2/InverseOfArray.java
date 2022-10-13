// Take as input N, a number. Take N more inputs and store that in an array. Write a recursive function which inverses the array. Print the values of inverted array

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int num[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            num[arr[i]]=i;
        }
        for(int i=0;i<n;i++)
        System.out.print(num[i]+" ");
        
    }
}
