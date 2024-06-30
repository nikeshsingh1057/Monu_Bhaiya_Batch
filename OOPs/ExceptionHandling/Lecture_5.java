                                /*try catch finally */

public class Main
{
	public static void main(String[] args) {
		// first way.
		try{
		    
		    int a=100;
		    int b=0;
		    int c=a/b;
		    System.out.println(c);
		}
		catch(Exception e){
		    
		    e.printStackTrace(); // 1st way -> ye best tarika hai Exception print karne ka.
		    System.out.println(e); // 2nd way
		}
		finally{
		    System.out.println("finally hamesa Execute hoga i.e chaie error aaye ya nahi aaye finally hamesa chlega");
		}
		
		/*
		try{
		    
		    int a=100;
		    int b=0;
		    int c=a/b;
		    System.out.println(c);
		}
		finally{
		    System.out.println("iss case me error aane par catch block nhai hone ke karan show nahi karega");
		    // so ye code sahi hai but error ka pata nahi chalege error aane par.
		}
		*/
	}
}
