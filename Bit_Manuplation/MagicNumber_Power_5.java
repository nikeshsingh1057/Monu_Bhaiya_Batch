package BitMasking;

// a magic number is defince as a number which can be expressed as a power of 5 or sum of unique power of 5 . first few magic number are
// 5,25 30(5+25),125,130(125+5),150(125+25), 155(125,25+5) ,625, 630(625+5), 650,655,750.....
// not dublicate nahi leke add nahi karenge sare unique hone chaiye i.e we cant take 10 since 5+5 but 5 is two which is dublicate.

// https://www.geeksforgeeks.org/problems/magic-number4431/1

public class MagicNumber_Power_5 {

	public static void main(String[] args) {
		
		int n=12;
		int mul=5;
		int sum=0;
		
		while(n>0) {
			
			if((n&1)==1)
				sum += mul;
			n >>=1;
			mul *= 5;
		}
		System.out.println(sum);
	}

}
