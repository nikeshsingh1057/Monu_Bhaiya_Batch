package BitMasking;

public class Bit_Trick {

	public static void main(String[] args) {
		
		System.out.println((char)('A'+32));  // upper to lower
		System.out.println((char)('a'-32));  // to lower case
		
		// check power of two
		int n=16;
		
		if((n & (n-1))==0)
			System.out.println("yes power of two");
		
		else 
			System.out.println("no");
		
		// swap two number using xor
		int a=6;
		int b=4;
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println(a+" "+b);
	}

}
