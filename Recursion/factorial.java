// calculate factorial 

public class factorial {

	public static void main(String[] args) {
		
		int num=4;
		
		int fact=factorialCal(num);
		
		System.out.println(fact);

	}
	public static int factorialCal(int num) {
		
		if(num==0)
			return 1;
		
		int fn=num*factorialCal(num-1);
		
		return fn;
		
	}
}
