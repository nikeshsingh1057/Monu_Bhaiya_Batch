                                    /* throws Exception */

import java.util.*;

public class Main
{
	public static void main(String[] args) {
		
		int x=9,y=0;
		int ans=0;
		
		try{
		    ans =calculator(x,y);
		}
		catch(Exception e){
		    System.out.print(e);
		}
		System.out.print(ans);
	}
// yaha par pahele se hum bata denge ki ye method Exception bhej raha hai so jo isko call kar raha hai usko try catch karo.
	public static int calculator(int x,int y) throws ArithmeticException{
	    
	    return div(x,y);
	}
	
	public static int add(int x,int y) throws ArithmeticException{
	    return x+y;
	}
	
	public static int div(int x,int y) throws ArithmeticException{
	    return x/y;
	}
	public static int mul(int x,int y) throws ArithmeticException{
	    return x*y;
	}
}

/* ye exception jab method banate hai usi ke sath laga dete hai  and throw wala method ke ander lagate hai */

/* note hum HAS- A relation ship me bhee ye kar sakte hai i.e alag class me bhee allow hai */
