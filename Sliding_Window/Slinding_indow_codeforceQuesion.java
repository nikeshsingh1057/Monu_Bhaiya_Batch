// https://codeforces.com/contest/1873/problem/F
// sliding window amazing question. above is link of code   (F. Money Trees codeforce round 898).
import java.util.*;
 
public class Main{
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    public static void main(String args[]){
        
        Scanner sc =new Scanner(System.in);
        ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
        int t=sc.nextInt();
        
        while(t-->0){;
        
            int n=sc.nextInt();
            int k=sc.nextInt(); //target
            int fruit[] = new int[n];
            for(int i=0;i<n;i++){
                fruit[i]=sc.nextInt();
            }
            int h[] = new int[n];
            for(int i=0;i<n;i++){
                h[i]=sc.nextInt();
            }
            int ans=0;
            long sum=0;
            int start=0;    //start and end of subarray
            
            for(int end=0;end<n;end++){
                
                if(end>0 && h[end-1]%h[end]!=0){    //move to the next subarray
                    sum=0;
                    start=end;
                }
                
                sum+=fruit[end];
                
                while(start<=end && sum>k){
                    sum-=fruit[start];  //moving the sliding window
                    start++;
                }
                
                int currwindowlength=end-start+1;
                ans=Math.max(ans, currwindowlength);;;;;;;;;;;;;;;;;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}
