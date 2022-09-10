
import java.util.*;
public class Main {
  *
 ***
*****  // code of this pattern note. --> no. of n/row is always odd.
 ***
  *
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n = 5;
		int row = 1;
		int space = n/2;
		int star = 1;
		while (row <= n) {

			int i = 1;
			while (i <= space) {
				System.out.print(" ");
				i++;
			}
			int j = 1;
			while (j <= star) {
				System.out.print("*");
				j++;
			}
			if (row <= (n) / 2) {
				star+=2;
				space--;
			} else {
				star-=2;
				space++;
			}
			row++;
			System.out.println();

		}

	}

}
