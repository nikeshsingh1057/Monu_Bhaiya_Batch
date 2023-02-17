import java.util.*;
public class Main {

    // modified binary serach
    // note hume array sort karna hoga 
    // logic is hume low yani arr[0] par bhee answer milega lekin hume faltu ka per nahi katna hai so 
    // hum utna he per katane jitna jarurat hai hence hum mid se check karna start karnege .
    public static void main (String args[]) {

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++)
            arr[i]=sc.nextInt();

        Long k=sc.nextLong();

        Arrays.sort(arr);   // hume sort karke bhejna hai.
        int a=bsearch(arr,k);

        System.out.println(a);
    }
    public static int bsearch(int [] arr,Long k)
    {
        int low=0;
        int high=arr[arr.length-1];  // do dry run (hume tree cut karna hai so index nahi value par check karna hoga)
        int ans=0;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            int count=0;

            if(vlaidcut(arr,k,mid)==true){
                
                ans=mid;
                low=mid+1;         //  hume atleast wala lena so jo answer mila hai usko store kar lenge.
            }
            else
                high=mid-1;
                
        }

        return ans;
    }
    public static boolean vlaidcut(int[]arr,Long k,int mid)
    {
        long count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>mid)
            {
                count += arr[i]-mid;
            }
        }
        if(count>=k)
            return true;

        return false;
    }
}
