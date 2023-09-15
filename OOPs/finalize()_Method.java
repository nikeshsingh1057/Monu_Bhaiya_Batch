// Garbage collector -> we see manually how garbage collector work in java

public class temp{
    
    public static void main(String[] args){
        
    	A obj;
    	for(int i=0;i<10000000;i++) {     // ye choti value par work nahi karega becaue heap memory jab full hoga then ye delete karna suru karega.
    		
    		obj=new A("Random Nmae");
    	}
    }
}
class A{
	
	String name;
	A(String name){
		this.name=name;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println("object is destroyed");
	}
}
