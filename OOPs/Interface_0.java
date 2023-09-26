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
