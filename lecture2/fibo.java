//fibonacci series.

public class fibo {
    public static void main(String[] args) {

        int a=1,b=0,c=0;
        int n=14;

        for(int i=0;i<n;i++)
        {
            System.out.print(c+" ");

            c=a+b;
            a=b;
            b=c;
            
        }
    }
}
