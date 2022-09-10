
import java.util.*;
public class Main {

	public static void main(String[] args) {
  * * * * * 
  * *   * * 
  *       *   //print this star.
  * *   * * 
  * * * * *
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int space = -1;
		int star = n / 2 + 1;
		while (row <= n) {

			int i = 1;
			while (i <= star) {
				System.out.print("* ");
				i++;
			}
			int j = 1;
			while (j <= space) {
				System.out.print("  ");
				j++;
			}
			
			int k = 1;
			if (row == 1 || row == n) {  // important line if we remove it than it will print one  star extra for row first.
				k = 2;
			}
			while (k <= star) {
				System.out.print("* ");
				k++;
			}
			if (row <= n / 2) {
				star--;
				space += 2;
			} else {
				star++;
				space -= 2;
			}
			row++;
			System.out.println();

		}

	}

}
