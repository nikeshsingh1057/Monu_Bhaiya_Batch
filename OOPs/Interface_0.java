// Java program to demonstrate working of
// interface

import java.io.*;

// A simple interface
interface In1 {

	// public, static and final
	final int a = 10;

	// public and abstract
	void display();
}

// A class that implements the interface.
class TestClass implements In1 {

	// Implementing the capabilities of
	// interface.
	public void display(){
	System.out.println("Geek");
	}

	// Driver Code
	public static void main(String[] args)
	{
		TestClass t = new TestClass();
		t.display();
		System.out.println(a);
	}
}

/*
  note:-> we cannote create object of In1 class because it is and interface class so we not able to create ists object we can do like as
  In1 t=new TestClass();  // aisa kar sakte hai
  In1 t=new In1();        // but this is not possible show error (In1 is abstract; cannot be instantiated)
  
*/

//---------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;

interface In1 {
    
	final int a = 10;
	void display();
}

class Main implements In1 {

	public void display(){                   // In1 ke method ko body diye hai.
	    System.out.println("Geek");
	} 
	public void play(){                      // Main class ka andar play method banaye hai.
	    System.out.println("Geek tum khelo ab");
	}
	public static void main(String[] args)
	{
	     /* note: Main Class ke object se hum Interface ke method as well 
	              own class ke (yaha jo Main class me play method hai.) method ko call karwa sakte hai. E.g is -> */
	    Main m=new Main();    
		m.display();                      
	    m.play();
		/* O.P :  Geek
                  Geek tum khelo ab   */
                  
        /* Now If we do like " In1 t=new Main(); " agar iss tarh se object banate hai to 't' ke dwara sirf interface
           ke method ko call karewa sakte hai play ko nahi because play method is not present in In1 (interface).  */
         
            In1 t=new Main();
            t.display();       // this will work fine
            t.Main();          // this will give error (cannot find symbol).
	}
}
