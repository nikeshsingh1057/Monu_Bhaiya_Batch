// type one with singel argument
class Main
{
  public static void main (String[] args)
  {
        Integer arr1[] = {5,6,4,4,5,12,56,9}; // note generic is only work on wrapper class not on premetive data types.
        String arr2[] = {"apple","cow","banana","car","dog","kela","dance"};
      
        print(arr1);
        System.out.println();
        print(arr2);
  }
  public static <T> void print(T [] arr)     // void type hai. No return type hai. generic
  {
        for(T i:arr)
            System.out.print(i+" ");
  } 
}

// type 2 with two argument.

class Demo
{
  static <V, T> void display (V v, T t)
  {
    System.out.println(v.getClass().getName()+" = " +v);           // java.lang.Integer = 88
    System.out.println(t.getClass().getName()+" = " +t);           // java.lang.String = This is string
  }
  public static void main(String[] args)
  {
    display(88,"This is string");
  }
}

// generic method with return type
// 1st type.
public class Main
{
	public static void main(String[] args) {
		
	      Integer arr[]={4,5,3,5,2,1,54,6};
	      System.out.print(show(arr));
	}
	public static <T> int show(T [] arr){          // yaha hum int , boolean kuch bee return karwa sakte hai.
	    
	    for(T i: arr){
	        
	        System.out.print(i+" ");
	    }
	    System.out.println();
	    return 9;
	}
}

// 2nd way
public class GenericMethodExample {

    // Generic method with a return type
    public static <T> T someGenericMethod() {
        // Implementation of the generic method
        // This example returns a String for demonstration purposes
        return (T) "Hello, World!";
    }

    public static void main(String[] args) {
        // Assign the result of the generic method to a variable
        Object result = someGenericMethod();

        // Check the type of the result using instanceof
        if (result instanceof String) {
            String stringValue = (String) result;
            System.out.println("Result is a String: " + stringValue);
        } else if (result instanceof Integer) {
            Integer intValue = (Integer) result;
            System.out.println("Result is an Integer: " + intValue);
        } else {
            System.out.println("Result is of an unknown type");
        }
    }
}

// 3rd type 

public class GenericMethodExample {

    // Generic method to count elements divisible by 2
    public static <T extends Number> int countEvenNumbers(T[] arr) {
        int count = 0;

        for (T element : arr) {
            double value = element.doubleValue(); // Convert to double for numeric comparison
            if (value % 2 == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6 };
        Double[] doubleArray = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };

        int evenCountInt = countEvenNumbers(intArray);
        int evenCountDouble = countEvenNumbers(doubleArray);

        System.out.println("Number of even integers: " + evenCountInt);
        System.out.println("Number of even doubles: " + evenCountDouble);
    }
}
