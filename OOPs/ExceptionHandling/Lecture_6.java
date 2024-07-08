                                                  /* Throw Keyword in java */
/*
Java throw
  The throw keyword in Java is used to explicitly throw an exception from a method or any block of code. We can throw either checked or 
  unchecked exception. The throw keyword is mainly used to throw custom exceptions. 

  hum throw kewyord se apna khud ka message pass karsakte hai jab bhee koi error / exception aata hai  e.g_1
  */

public class usingThrowKeyword {       //e.g_1
    public static void main(String[] args) {
      
        try {
            checkAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) {
      
        if (age < 18) {
            throw new IllegalArgumentException("Age must be at least 18");
        } else {
            System.out.println("Access granted");
        }
    }
}
/* e.g_1 yaha IllegalArgumentException ke through apna error message pass kar rahe hai note yaha arthmatic / runtime kuch bhee laga sakte 
         hai jo java ke exception class me present hai.
          Hum apna khud ka bhee custom exception bana sakte hai see in eg_2
*/

class AgeRestrictionException extends Exception {     // khud ka custom exception banay hai 
    public AgeRestrictionException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            checkAge(15);
        } catch (AgeRestrictionException e) {
            System.out.println(e.getMessage());
        }
    }

    static void checkAge(int age) throws AgeRestrictionException {
        if (age < 18) {
            throw new AgeRestrictionException("Age must be at least 18");
        } else {
            System.out.println("Access granted");
        }
    }
}
