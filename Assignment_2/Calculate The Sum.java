// https://discuss.codechef.com/t/ciradd-editorial/87767

import java.util.*;
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		    arr[i]=sc.nextInt();
		 
		 int q=sc.nextInt();     // input q operation and for each x is input to perform circular operation on array
         int temp[]=new int[n];  // temp is used to store the updated element after each operation.

		 while(q-- > 0)
		 {
		     int x=sc.nextInt();
             x=x%n;                // we do mod because x is less than array.

		     for(int i=0;i<n;i++)
		     {
		        temp[i] = (arr[i]+arr[(i+n-x)%n]);  // i+n-x is used to fetch circurar element in specific index of array.
		     }
             for(int i=0; i<n; i++)      // after we update arr with temp value to make next opeartion correctly.
                arr[i]=temp[i];
		 }

        //System.out.print(Arrays.toString(arr)+" ");
        int sum = 0;
        for(int i=0; i<n; i++)
            sum += arr[i];
 
        System.out.println(sum % ((int)Math.pow(10, 9) + 7));
	}
}
 
