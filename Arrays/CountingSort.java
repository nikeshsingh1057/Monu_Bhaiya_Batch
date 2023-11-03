import java.util.Arrays;          /*  counting sort */

public class Counting_Sort {

	public static void main(String[] args) {
		
		int [] arr= {2,1,1,0,1,2,5,4,0,2,8,7,9,2,6,1,9};
		arr=Sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static int[] Sort(int [] arr) {
		 
		int max=Arrays.stream(arr).max().getAsInt();     
		int [] frq=new int[max+1];
		for(int i=0;i<arr.length;i++) {
			frq[arr[i]]++;
		}
		
   /*commulative sum nikal rahe hai (prefix sum he hai-> prefix sum me jis index par hai uske uske piche tak ka sum hota hai. */
		for(int i=1;i<frq.length;i++) { 
			frq[i]=frq[i-1]+frq[i];
		}
		int [] ans=new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			int c=frq[arr[i]]-1;            // c=count or idx for ans array
			ans[c]=arr[i];
			frq[arr[i]]--;                 // commulative frq wale eak se decrease karna hota hai.
		}
		return ans;
	}
}
// isme element ka order change nahi hota hai yani agar two time one hai to pahela 1 pahele aayega and 2nd one uske badd i.e order of element is same.
// first step me array se maximum nikal lenge
// then commulative sum nikalenge
// uske badd commulative sum jitna new array banayenge and uske badd  original array ko piche se travesh karenge 
