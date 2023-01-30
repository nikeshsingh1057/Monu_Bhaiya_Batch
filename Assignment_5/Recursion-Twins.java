
import java.util.*;
public class Main {
    static int count=0;
    public static void main(String args[]) {
    
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int i = 0;
        printwin(str, i);

        System.out.println(count);
    }
    public static void printwin(String str, int i) {
    
        if (i >= str.length() - 2) {
           
            return;
        }
        if (str.charAt(i) == str.charAt(i + 2) && str.charAt(i) != str.charAt(i + 1)) {
            count++;
        }
        printwin(str, i + 1);
    }
}
