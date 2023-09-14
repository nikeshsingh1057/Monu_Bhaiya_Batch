
// isme hum bound kar diya hai ki bus number class ko he print karega yani it work only for number.
// similary we can make for String bound etc. yaha extends se hum number class ko inherit kar rahe hai.

class BankAccount<T extends Number>
{
	public void Display(T[] t){
	    
	    for(T i:t)
	        System.out.print(i+" ");
	}
}

public class temp{
    
    public static void main(String[] args){
        
        BankAccount<Number> b1=new BankAccount<>();
        
        Integer [] m1={12,45,122,67};
        
        Double [] m2= {12.5,78.4,34.1,4.4};
        
        /*String [] m3= {"apple","cow","dog","cat","car"};  // this will give error.
        b1.Display(m3); */
        
        b1.Display(m2);
        System.out.println();
        b1.Display(m1);
    }
}




