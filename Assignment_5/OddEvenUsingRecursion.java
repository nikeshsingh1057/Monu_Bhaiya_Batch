import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PrintOddEven(n);
    }
    public static void PrintOddEven(int n){
        if(n==0)
            return;
        if(n%2==1)
            System.out.println(n);
        PrintOddEven(n-1);

        if(n%2==0)
            System.out.println(n);
    }
}
