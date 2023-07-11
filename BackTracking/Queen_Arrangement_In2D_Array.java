package BackTracking;

public class Queen_Arrangement_In2D_Array {
	
	// queen ko 2d array me kitne tarike se baitha sakte hai (abhi ke liye vo eak dusre ko nahi kategi).
	// hume 2 queen ko 2d arrye me total kitne ways se baitha sakte hai uska way print karo.(no dublicate allow).

	public static void main(String[] args) {
		
		Queen_2D(0,0,2,"",2,2);                     
	}
	// method 1st (coding block wale sir)
	public static void Queen_2D(int r,int c,int qtp, String path,int tots_r, int tots_c)       // qts -> queen to place. tots_r -> total row 
	{
		if(qtp==0) {
			
			System.out.println(path);
			return;
		}
		if(c==tots_c) {
			c=0;
			r++;     // agar column last tak pauch jata hai then row ko change kar do .
		}
		if(r==tots_r)
			return;
		
		Queen_2D(r,c+1,qtp-1,path+"Q{"+r+","+c+"}",tots_r,tots_c);
		Queen_2D(r,c+1,qtp,path,tots_r,tots_c);
	}
}

/*Q{0,0}Q{0,1}
Q{0,0}Q{1,0}
Q{0,0}Q{1,1}
Q{0,1}Q{1,0}
Q{0,1}Q{1,1}
Q{1,0}Q{1,1}*/
