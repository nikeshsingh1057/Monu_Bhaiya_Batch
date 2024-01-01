// compare string builder and normal stirng.

public class String_Vs_StringBulider {

	public static void main(String[] args) {
		
		StringCom();
		StringBuilderCom();

	}
	public static void StringCom() {
		
		String s = "";
		for (int i = 0; i < 100000; i++) {
			s = s + i;
		}
		System.out.println(s);
	}
	public static void StringBuilderCom() {
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 100000; i++) {
			sb.append(i);
		}
		System.out.println(sb);
	}

}
/*--------------------------------------------------------------------------------------------------------------------------------------*/

// comparasion between stringbuilder and normal string which one faster.

public class Main{  
    
 	public static void main(String[] args){  
 	    
 		long startTime = System.currentTimeMillis();  
 		
 		// String 
 		String str="";
 		
 		for (int i=0; i<100000; i++){  
 			str+="car";
 		}  
 		System.out.println("Time taken by String: " + 	(System.currentTimeMillis() - startTime) + "ms"); 
 		
 		// StringBuilder
 		startTime = System.currentTimeMillis();  
 		
 		StringBuilder sb2 = new StringBuilder("Java");  
 		for (long i=0; i<100000; i++){  
 			sb2.append("Tpoint");  
 		} 
 		
 		System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
 	}  
}  

//Time taken by String: 1293ms
//Time taken by StringBuilder: 4ms
