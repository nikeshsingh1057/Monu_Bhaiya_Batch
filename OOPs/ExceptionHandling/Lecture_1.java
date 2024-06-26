                                    /* Exception Handling in Java  */


/* Exception-> suppose teacher hai and hum eak institue me padhane jate hai apne ghar se 5 km dur smart programmin 
               class me . ye mera daily ka task hai and hum roj cycle se jate hai . now eak din suddenly cycle pancher
               ho gaya then humare normal routine/or flow me eak badha aa gaya jisko unexpcted event bol sakte hai. hence 
               cycle puncer hona normal flow ko distrub karna and this is called exception.
               
       defination:->  An exception is an unwanted or unexpected event which occurs during the execution of a program i.e
                      at run time , that distrupts the noraml flow of the program.
                      
                      now Handling: find alternate way to over come such type of error is called excepton Handling.
*/      


public class Main
{
	public static void main(String[] args) {
	    
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		System.out.println("4");
		System.out.println(100/0);
		System.out.println("5");
		System.out.println("6");
		System.out.println("7");
		System.out.println("8");
		System.out.println("9");
		System.out.println("10");
	}
}

/*
1
2
3
4
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:24)
*/
 
 /* yaha upper output me 1 to 4 tak koi error nahi thaa hece succesfully print kiya but uske badd 100/0 error hai
    hence waha par program ruk gaya but hume iss error ko handle karna hai so that jaise error aaye vo handle ho jaye
    and uske aage ka code properly work kare.
 */
