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


//----------> https://www.programiz.com/java-programming/nested-inner-class   (link for knowing more about nesting class).

/*In Java, you can define a class within another class. Such class is known as nested class. For example, */

class OuterClass {
    // ...
    class NestedClass {
        // ...
    }
}
/*
There are two types of nested classes you can create in Java.

Non-static nested class (inner class)
Static nested class

*/
				/*Let's first look at non-static nested classes.*/

// Non-Static Nested Class (Inner Class)
class CPU {
    double price;
    // nested class
    class Processor{

        // members of nested class
        double cores;
        String manufacturer;

        double getCache(){
            return 4.3;
        }
    }

    // nested protected class
    protected class RAM{

        // members of protected nested class
        double memory;
        String manufacturer;

        double getClockSpeed(){
            return 5.5;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        // create object of Outer class CPU
        CPU cpu = new CPU();

       // create an object of inner class Processor using outer class
        CPU.Processor processor = cpu.new Processor();

        // create an object of inner class RAM using outer class CPU
        CPU.RAM ram = cpu.new RAM();
        System.out.println("Processor Cache = " + processor.getCache()); //Processor Cache = 4.3
        System.out.println("Ram Clock speed = " + ram.getClockSpeed());  //Ram Clock speed = 5.5
    }
} 
/*
In the above program, there are two nested classes: Processor and RAM inside the outer class: CPU. We can declare the inner class as protected. Hence, we have declared the RAM class as protected.

Inside the Main class,

we first created an instance of an outer class CPU named cpu.
Using the instance of the outer class, we then created objects of inner classes:
CPU.Processor processor = cpu.new Processor;

CPU.RAM ram = cpu.new RAM();
Note: We use the dot (.) operator to create an instance of the inner class using the outer class.
*/

//Accessing Members of Outer Class within Inner Class
/*We can access the members of the outer class by using this keyword. If you want to learn about this keyword, visit Java this keyword.*/

//Example 2: Accessing Members...-->

class Car {
    String carName;
    String carType;

    // assign values using constructor
    public Car(String name, String type) {
        this.carName = name;
        this.carType = type;
    }

    // private method
    private String getCarName() {
        return this.carName;
    }

// inner class
    class Engine {
        String engineType;
        void setEngine() {

           // Accessing the carType property of Car
            if(Car.this.carType.equals("4WD")){

                // Invoking method getCarName() of Car
                if(Car.this.getCarName().equals("Crysler")) {
                    this.engineType = "Smaller";
                } else {
                    this.engineType = "Bigger";
                }

            }else{
                this.engineType = "Bigger";
            }
        }
        String getEngineType(){
            return this.engineType;
        }
    }
}

public class Main {
    public static void main(String[] args) {

// create an object of the outer class Car
        Car car1 = new Car("Mazda", "8WD");

        // create an object of inner class using the outer class
        Car.Engine engine = car1.new Engine();
        engine.setEngine();
        System.out.println("Engine Type for 8WD= " + engine.getEngineType());

        Car car2 = new Car("Crysler", "4WD");
        Car.Engine c2engine = car2.new Engine();
        c2engine.setEngine();
        System.out.println("Engine Type for 4WD = " + c2engine.getEngineType());
    }
}
// Engine Type for 8WD= Bigger
// Engine Type for 4WD = Smaller

/*	Static Nested Class

In Java, we can also define a static class inside another class. Such class is known as static nested class. Static nested classes are not called static inner classes.
Unlike inner class, a static nested class cannot access the member variables of the outer class. It is because the static nested class doesn't require you to create an instance of the outer class.
*/

class MotherBoard {

   // static nested class
   static class USB{
       int usb2 = 2;
       int usb3 = 1;
       int getTotalPorts(){
           return usb2 + usb3;
       }
   }

}
public class Main {
   public static void main(String[] args) {

       // create an object of the static nested class
       // using the name of the outer class
       MotherBoard.USB usb = new MotherBoard.USB();
       System.out.println("Total Ports = " + usb.getTotalPorts());
   }
}

// Example 4: Accessing members of Outer class inside Static Inner Class
class MotherBoard {
   String model;
   public MotherBoard(String model) {
       this.model = model;
   }

   // static nested class
   static class USB{
       int usb2 = 2;
       int usb3 = 1;
       int getTotalPorts(){
           // accessing the variable model of the outer classs
           if(MotherBoard.this.model.equals("MSI")) {
               return 4;
           }
           else {
               return usb2 + usb3;
           }
       }
   }
}
public class Main {
   public static void main(String[] args) {

       // create an object of the static nested class
       MotherBoard.USB usb = new MotherBoard.USB();
       System.out.println("Total Ports = " + usb.getTotalPorts());
   }
}
/*
When we try to run the program, we will get an error:

error: non-static variable this cannot be referenced from a static context
This is because we are not using the object of the outer class to create an object of the inner class. Hence, there is no reference to the outer class Motherboard stored in Motherboard.this. */
