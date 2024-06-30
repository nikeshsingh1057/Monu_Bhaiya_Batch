/*---------------------------------try catch block to handle Exception-----------------------------------------*/

public class Main
{
	public static void main(String[] args) {
		
		/*
		int a=10;
		int b=0;
		int ans=a/b;
		System.out.print(ans);  // error dega-> Exception in thread "main" java.lang.ArithmeticException: / by zero .
		
		*/
		try{
		    int a=10;
    		int b=0;
    		int ans=a/b;
    		System.out.print(ans);
		}
		catch(Exception e){
		    System.out.println(e);
		}
		
		System.out.println("code terminate nahi hoga try catch se and jaha bhee Exception aayega uske catch me handle kar lega");
	}
}
