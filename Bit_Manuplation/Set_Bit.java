package BitMasking;

public class Set_Bit {

	public static void main(String[] args) {
		
		int n=7;
		int pos=3;
		int mask=(1<<pos);
		
		if((n&mask)==0)
			System.out.println("not set");
		
		else 
			System.out.println("set bit");
		
	}

}
