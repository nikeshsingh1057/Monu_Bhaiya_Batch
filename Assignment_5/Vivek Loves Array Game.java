import java.util.*;
public class Main {
    public static void main(String args[]) {
   
   Scanner sc = new Scanner(System.in);
   ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

   int tt=sc.nextInt();

   for(int ii=1;ii<=tt;ii++)
   {
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) 
            arr[i] = sc.nextInt();
    

        int sum = 0;
        for (int i = 0; i < n; i++) 
            sum += arr[i];
    

        System.out.println(sumcheck(arr, 0, n - 1,sum));
   }

}
public static int sumcheck(int[] A, int start, int end,int sum) {
    
    if (start == end) {
      return 0;
    }
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
    int left_Sum = 0;

    for (int i = start; i < end; i++) {

      left_Sum += A[i];

      int right_Sum = sum - left_Sum;

      if (left_Sum == right_Sum) {

        return 1 + Math.max(sumcheck(A, start, i, left_Sum),
            sumcheck(A, i + 1, end, right_Sum));
      }

    }
    return 0;
  }

}
