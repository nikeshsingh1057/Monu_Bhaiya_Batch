// reverse of array using function

public class reverseArray {

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7};
		reverse(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	public static void reverse(int [] arr)
	{
		int size=arr.length;
		for(int i=0;i<size/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[size-i-1];
			arr[size-i-1]=temp;
		}
	}

}
