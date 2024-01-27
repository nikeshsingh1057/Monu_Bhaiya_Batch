                                   // static keyword.

// note: static variable belongs to class not to object similarly static method belongs to class not to object.
// we cannot create outer static class but we can create innner static class.
// note : agar same class ke ander static method hai then class name bhee likne ke need nahi dircet method ke name se method call ho jata hai.


class test{
    
    static int a=10;
    
    static void car1(){
        
        System.out.println("static method hai-> test.car1() se direct call ho jayega ");
        // no need to create object of test to call static method.
    }
    static void car2(){
        
        System.out.println("static method ");
    }
    void car3(){
        
        System.out.println("isko call karne ke liye test class ka object create karna padega.");
        // i.e -> test t=new ();
        //        t.car2(); 
    }
}
public class Main
{
	public static void main(String[] args) {
	    
		test.car1();
		test.car2();
		System.out.println(test.a);
	}
	public static void bus(){
		// isko call karne ke liye Main ka object create nahi karna hai only bus() name se call ho jayega since bus() method static ke
		// ander hai i.e within the call hai so dircet call ho jayega.
		System.out.println("Main class ke ander bus() method and static bhee  hai aur within class hai so dircect call ho jayega");
	}
	public void bus2(){
		System.out.print("ye method within class ke ander hai lekin isko call karne  ke lime main ka object create karna hoga.");
		// i.e -> Main m=new Main();
	 	//        m.bus2();
	}
}
