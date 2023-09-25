                                          /* Extending Interfaces */

/* One interface can inherit another by use of keyword extends. When a class implements an interface that inherit another interface, 
 it must provide implementation for all method required by the interface inheritance chain. */

interface A {
	void method1();
	void method2();
}
// B now includes method1 and method2
interface B extends A {
	void method3();
}
// the class must implement all method of A and B.
class gfg implements B {
	public void method1()
	{
		System.out.println("Method 1");
	}
	public void method2()
	{
		System.out.println("Method 2");
	}
	public void method3()
	{
		System.out.println("Method 3");
	}
}

/*---------------------------------------------------------------------------------------------------------------------------------------*/

interface Student
{
	public void data();
	
}
class avi implements Student
{
	public void data ()
	{
		String name="avinash";
		int rollno=68;
		System.out.println(name);
		System.out.println(rollno);
	}
}
public class inter_face
{
	public static void main (String args [])
	{
		avi h= new avi();
		h.data();
	}
}

/*---------------------------------------------------------------------------------------------------------------------------------------*/

// Java Program for
// implementation Level wise
import java.io.*;
import java.lang.*;
import java.util.*;

// Level 1
interface Bank {
	void deposit();
	void withdraw();
	void loan();
	void account();
}

// Level 2
abstract class Dev1 implements Bank {
	public void deposit()
	{
		System.out.println("Your deposit Amount :" + 100);
	}
}

abstract class Dev2 extends Dev1 {
	public void withdraw()
	{
		System.out.println("Your withdraw Amount :" + 50);
	}
}

// Level 3
class Dev3 extends Dev2 {
	public void loan() {}
	public void account() {}
}

// Level 4
class GFG {
	public static void main(String[] args)
	{
		Dev3 d = new Dev3();
		d.account();
		d.loan();
		d.deposit();
		d.withdraw();
	}
}
