// ye HackerEarth ka question hai original name (Monk and Power of Time)

// ye question queue se bhee solve hoga but yaha hum isko arrayList se solve kar rahe hai

// HackerEarth question link https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-power-of-time/

import java.util.*;

public class Main{


	public static void main(String args[]){


		Scanner input_low = new Scanner(System.in);

		ArrayList<Integer> ll1=new ArrayList<>();
		ArrayList<Integer> ll2 =new ArrayList<>();

		int n = input_low.nextInt();


		for(int k=0; k<n; k++){

			ll1.add(input_low.nextInt());
		}


		for(int o=0; o<n; o++){
			ll2.add(input_low.nextInt());
		}

		int count=0;
	    int i=0;

		while(ll1.size()>0 && ll2.size()>0){
		    
		    if(ll1.get(i)==ll2.get(i)){
		        
		        count++;
		        ll1.remove(i);
		        ll2.remove(i);
		    }
		    else{
		        
		        count++;
		        int pop=ll1.get(i);
		        ll1.remove(i);
		        ll1.add(pop);
		    }
		}
		System.out.println(count);
	}
}
