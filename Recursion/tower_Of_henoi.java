public class tower_Of_henoi {

	public static void main(String[] args) {
		
		int n = 3;
		toh(n, "A", "B", "C");
	}
	
	public static void toh(int n, String src, String hlp, String des) {
		
		if(n==0) {       // note here if we do n==1 then we have to print last disc (i.e sabse bada wala) inside this block.
			
			return ;
		}

		toh(n - 1, src, des, hlp);
		System.out.println("Move " + n + "th" + " disc from " + src + " " + des);
		toh(n - 1, hlp, src, des);
	}
}
