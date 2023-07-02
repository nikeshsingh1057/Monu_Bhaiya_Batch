//finding prime factorization

public static void main(String[] args) {
		
        int n=100;
	int i=1;
	 while(n!=1) 
	{
	        if(n%i==0)
	        {
	                System.out.print(i+" ");
	               n=n/i;
	        }
	         else 
	           i++;
	}
}
