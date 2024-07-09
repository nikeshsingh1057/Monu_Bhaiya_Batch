import java.util.*;

public final class Main 
{
	public static void main(String[] args) {
	    
	    char [] c = {'d','a','b','c'}; // String is a sequence of Character.
	    String s=new String(c);      // this will concated all Character of c together.
		System.out.println(s);
		
		Main m=new Main();
	}
}

/*
1. String eak final class hai. note: Integer,Float,Double ye sab bhee eak class hai aur final class hai so user not overrid it.
2. String is an object  and object is immutable.
3. String s = new String();    ye immutable object create karta hai 
*/

/* String constant pool:- String constant pool is an area in heap memory where java stores literal values. */

String s=new String("hello"); // aise decleration me two object banega first one heap ke ander and 2nd one heap inside
                              // String pool constant ke ander.
String s="hello"; // iss case me only one object create hoga vo bhee String pool constant ke ander . efficient hota hai.

