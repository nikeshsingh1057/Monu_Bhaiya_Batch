                                    /*Tyeps of ways to print Exception in catch */

public class Main
{
	public static void main(String[] args) {
		
		try{
		    
		    int a=100;
		    int b=0;
		    int c=a/b;
		    System.out.println(c);
		}
		catch(Exception e){
		    
		    e.printStackTrace(); // 1st way -> ye best tarika hai Exception print karne ka.
		    System.out.println(e); // 2nd way
		    System.out.println(e.toString()); // 3rd way   (2nd and 3rd same output dega.)
		    System.out.println(e.getMessage()); // 4th way
		}
	}
}
