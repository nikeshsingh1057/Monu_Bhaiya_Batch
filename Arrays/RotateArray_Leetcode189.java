// rotate array using reversal Algorathim.
// reversal Algorathim is specially made for this question.

class Solution {
    public void rotate(int[] arr, int k) {
        
        k=k%arr.length;
        int i=arr.length-k;

        reverse(arr,i,arr.length-1);
        
        reverse(arr,0,i-1);
        
        reverse(arr,0,arr.length-1);
    }
   public static void reverse(int [] arr,int i, int j)
	{
		while(i < j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
} 
