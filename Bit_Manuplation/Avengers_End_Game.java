package BitMasking;

public class Avengers_End_Game {
	
    // coding block question
	// number ka common diviser nahi lena hai only unique divisible lena hai.
	// aisa sum jisme 2,3,5 se divide karne par unique count aaye unka sum lena hai.
	
	public static void main(String[] args) {
		
		int [] prime= {2,3,5};
		
		int n=1000;
		
		System.out.println(count(prime, n));
	}
	public static int count(int [] prime,int n) {
		
		int len=prime.length;
		int ans=0;
		
		for(int i=1;i<(1<<len);i++) {
			
			if((FastCount(i) & 1) !=0) {
				ans += InterSection(prime,n,i);
			}
			else {
				ans -= InterSection(prime,n,i);
			}
		}
		return ans;
	}
	
	public static int InterSection(int [] prime,int n,int i) {
		
		int p=1;
		int pos=0;
		while(i>0) {
			
			if((i&1)!=0) {
				p *= prime[pos];
			}
			pos++;
			i >>= 1;
		}
		return n/p;
	}
	public static int FastCount(int n) {
		
		int ans=0;
		
		while(n!=0) {
			
			n=n&(n-1);
			ans++;
		}
	    return ans;
	}
}
