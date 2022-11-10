//  Arrays-Sum Of Two Arrays

import java.util.*;
public class Main {
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();

        int arr1[]=new int[a];
        for(int i=0;i<a;i++)
            arr1[i]=sc.nextInt();

        int b=sc.nextInt();

        int arr2[]=new int[b];
        for(int i=0;i<b;i++)
            arr2[i]=sc.nextInt();

        int carry=0;
        
        int i=a-1,j=b-1;
        ArrayList<Integer> ll=new ArrayList<>();

        while(i>=0 && j>=0)
        {
            int ans=(carry+arr1[i]+arr2[j])%10;      // to generate sum
                carry=(carry+arr1[i]+arr2[j])/10;   // to generate carry

            ll.add(ans);
            i--;
            j--;
        }

        while(i>=0){
            
            int ans=(carry+arr1[i])%10;
                carry=(carry+arr1[i])/10;

            ll.add(ans);
            i--;
        }

        while(j>=0){
            
            int ans=(carry+arr2[j])%10;        // to generate sum
                carry=(carry+arr2[j])/10;     // to generate carry

            ll.add(ans);
            j--;
        }
        if(carry!=0)     
            ll.add(carry);

        for(int k=ll.size()-1;k>=0;k--)
            System.out.print(ll.get(k)+","+" ");
        System.out.print("END");
    }
}
