package lecture3;
// convert one base to another base.
import java.util.*;
public class base_coverter {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int base=sc.nextInt();
		int sum=0;
		int multiply=1;
		while(num>0)
		{
			int rem=num%base;
			sum=sum+rem*multiply;
			num=num/base;
			multiply=10*multiply;
		}
		System.out.println(sum);
	}

}
