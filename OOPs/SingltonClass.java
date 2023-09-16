// Singlton Class in java.

import java.security.Signature;

/* Singlton class in java : jika sirk eak object creat hota hai usko singlton class kahate hai.
 * 
   In object-oriented programming, a java singleton class is a class that can have only one object       (see on gfg).
   The primary purpose of a java Singleton class is to restrict the limit of the number of object creations to only one. */

public class Singleton{ 
	
    private Singleton() {    // private banay hai sirf isi class me access hoga bhar nahi ho sakta hai. yani kisi aur class se call nahi hoga ye.
    	
    }
    
    private static Singleton instance;  // instance me reference store karwaye hai./  niche GetInstance se constructor call hua hai.
    
    public static Singleton GetInstacnce() { // yaha se Constructor ko call karwayenge hai.
    	
    	if(instance==null) {
    		instance=new Singleton();
    	}
    	return instance;
    }
    public static void car() {
    	System.out.println("run karo beta");
    }
    public static void main(String[] args){
        
    	/* note hum aise bhee call karwa sakte hai lekin aisa call nahi karna hai because 
    	
    	Singleton t=new Singleton(); yaha ye kai object creat ho sakta hai lekin Constructor private hai isly other class me call nahi ho payega. iss trah.
    	Singleton v=new Singleton();
    	
    	*/
    	
    	Singleton obj =Singleton.GetInstacnce();   // yaha GetInstacne static method hai isly Class ke name se call ho gaya hai.
    	System.out.println(obj);
    	Singleton obj2=Singleton.GetInstacnce();
    	System.out.println(obj2);
    	
    }
}
// ye same reference dega new nahi.
// Oops.Singleton@2626b418
// Oops.Singleton@2626b418




