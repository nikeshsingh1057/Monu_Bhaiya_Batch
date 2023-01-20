import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        replace(1,0,n);
    }
    public static void replace(int f,int ans,int n){
        
        if(n==0){

            System.out.println(ans);
            return;
        }
        int rem=n%10;
        if(rem==0){
            rem=5*f;
        }
        else
            rem=rem*f;
        replace(f*10,ans+rem,n/10);
    }
}
