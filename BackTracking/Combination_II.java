package BackTracking;

import java.util.Arrays;

public class Combination_II {

	public static void main(String[] args) {
		
		int coin[]={10,1,2,7,6,1,5};
        Arrays.sort(coin);

        combinationPrint(8,coin,"",0);
	}
	public static void combinationPrint(int amount,int [] coin,String ans,int j)
	    {
	        if(amount==0)
	        {
	            System.out.print(ans+" ");
	            return;
	        }
	        for(int i=j;i<coin.length;i++)
	        {
	            if(i==j || coin[i]!=coin[i-1]){
	               
	              if(amount>=coin[i]){

	                combinationPrint(amount-coin[i], coin, ans+coin[i],i+1);
	              }
	                
	            }
//	            while(i<coin.length-1 && coin[i]==coin[i+1])     // we can also use it in place of it for checking dublicate.
//	                 i++;
	        }
	    }
}
