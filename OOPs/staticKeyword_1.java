                                   // static keyword.

// note: static variable belongs to class not to object similarly static method belongs to class not to object.
// we cannot create outer static class but we can create innner static class.

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
}
