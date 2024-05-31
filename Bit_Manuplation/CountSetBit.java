package BitMasking;

//public class CountSetBit {
//	
//	public static void main(String[] args) {
//		
//		int ans=0;
//		int n=7;
//		
//		while(n>0) {
//			
//			if((n&1)!=0) 
//				ans++;
//			n = n>>1;
//		}
//		System.out.println(ans);
//	}
//}
// t.c-> log(n)

// another method and efficient method.

/*
  public class CountSetBit {
	
	public static void main(String[] args) {
		
		int ans=0;
		int n=7;
		
		while(n!=0) {
			n=n&(n-1);
			ans++;
		}
		
	}
}
*/

// anoter method to count set bit

public class CountSetBit {
	
	public static void main(String[] args) {
		
		int n=7;
		int count=0;
		
		for(int i=31;i>=0;i--) {  // here 31 liye hai becasue maximum range int ka 31 tak hota hai bit me (16 ,8,4 bhee le sakte hai lekin number ka range utna he hona chaiye)
			
			if((n&(1<<i)) != 0)
				count++;
		}
		// ye bhee work karega
		/*for(int i=0;i<32;i++) { 
			if((n&(1<<i)) != 0)
				count++;
		}*/

		/*for(int i=0;i<32;i++) { 
			if((n>>i) & 1 != 0)
				count++;
		}*/
		System.out.println(count);
	}
}
