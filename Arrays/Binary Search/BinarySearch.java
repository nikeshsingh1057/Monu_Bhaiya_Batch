
  // Binary search in array.
         
public class BinarySearch {

	public static void main(String[] args) {
		
		int arr[]= {1,4,5,6,7,8,9,11,23,45,67};
		int target=23;
		System.out.println(BinarySearch(arr,target));
	}
	public static int BinarySearch(int arr[],int target)
	{
		int low=0,high=arr.length-1;
		
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==target)
				return mid;
			
			else if(target<arr[mid])
				high=mid-1;
			
			else
				low=mid+1;
		}
		return -1;
	}
} 
