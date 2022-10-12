/*It is Alex’s birthday and she wants to go shopping. She only has ‘A’ units of money and she wants to spend all of her money. However, she can only purchase one kind of item. She goes to a shop which has ‘n’ types items with prices A0,A1,A2,…,An-1. The shopkeeper claims that he has atleast ‘k’ items she can choose from. Help her find out if the shopkeeper is correct or not.*/
//input
4
100 200 400 100
5
100 2
200 3
500 4
600 4
800 4
//output.
Yes
Yes
No
No
Yes

import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        int q=sc.nextInt();
        while(q--!=0)
        {
            int p=sc.nextInt();
            int t=sc.nextInt();
            int count=0;
            for(int i=0;i<n;i++)
            {
                if(p%arr[i]==0)
                    count++;
            }
            if(count>=t)
            {
                System.out.println("Yes");    
            }
            else
                System.out.println("No");
        }
    }
}
