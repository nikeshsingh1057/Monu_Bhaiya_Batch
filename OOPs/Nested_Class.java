//                                        Nested class

public class Main
{
    static class nik{
        
        void car(){
            System.out.println("non static car ka method.");
        }
        
        static void car2(){
            System.out.println("car2 static hai.");
        }
    }
    
    class abhi{
        
        void bus(){
            System.out.println("hi bus");
        }
        
        /*
        static int aa=0; // now alow 
        
        static void jeep(){      // this is now allow i.e inner class non static hai then uske ander static method nahi create kar sakte hai.
            System.out.println("hi bus");
        } */
    }
    
    void car(){
        System.out.println("hi car");
    }
    
	public static void main(String[] args) {
	    
	    Main m1=new Main();
	    m1.car();
	    
	    nik m2=new nik();
	    nik.car2(); //or ->  m2.car2();
	    m2.car();
	    
	    abhi ab= m1.new abhi(); // or -> Main.abhi ab=m1.new abhi();
	    ab.bus();
	 
	}
}

// working
/*

agar outer class ke ander inner class then two case->
// static inner class.
1. agar inner class static hai then hum direct object create kar sakte hai static inner class ka. outer se koi matla nahi hai see e.g above.
2. agar inner class static hai and uske ander method static hai then inner static class ke name se call karwa sakte hai.

// non static inner class
1. iss case me hum outer class ke object ke dwara inner class ka object create karte hai.
2. non static inner class ke ander static method or static variable declare nahi kar sakte hai.

*/
