package BackTracking;

public class Coin_Permutations {
    
    public static void main(String[] args) {

        // method 1st by own
        coin(10,0,"");
        
        System.out.println();
        
        // mehtod 2nd sir wala.
        int coin[]={2,3,5};
        coin_permutation_Sir(10,coin,"");
    }
    
    // method 1_st.
    public static void coin(int t,int sum,String ans)
    {

        if(sum==t)
        {
            System.out.print(ans+" ");
            return;
        }
        if(sum<t)
            coin(t, sum+2,ans+"2");

        if(sum<t)
            coin(t, sum+3,ans+"3");

        if(sum<t)
            coin(t, sum+5,ans+"5");
    }
    // method 2nd.
    public static void coin_permutation_Sir(int amount,int [] coin,String ans)
    {
        if(amount==0)
        {
            System.out.print(ans+" ");
            return;
        }
        for(int i=0;i<coin.length;i++)
        {
            if(amount>=coin[i]){
            	
                coin_permutation_Sir(amount-coin[i], coin, ans+coin[i]);
            }
        }
    }
}

//22222 2233 2323 2332 235 253 3223 3232 325 3322 352 523 532 55 
//22222 2233 2323 2332 235 253 3223 3232 325 3322 352 523 532 55 
