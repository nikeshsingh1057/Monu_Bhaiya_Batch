                        /* checked and unchecked Exception */
                        
import java.io.FileInputStream;
public class Main
{
	public static void main(String[] args) {
		
		// checked exception or compiled time exception.
		FileInputStream fis = new FileInputStream("F:/abc.txt");
		
     // o/p when try to compile: unreported exception FileNotFoundException; must be caught or declared to be thrown
        
        // runtime exception or unchecked exception.
        String n=null;
        System.out.println(n.length());
	}
}
