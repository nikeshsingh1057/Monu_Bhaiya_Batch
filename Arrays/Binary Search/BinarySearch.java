
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

// binary search in infinite array  //t.c lon(n)

int low =0;
int high=1; 
int target=10000;
while(arr[high]<target){   // ye while loop range pata kar ke de dega ki target element infinite array kis range ke ander present hai uske bad hum niche binary search laga sakte hai.
	low=high;
	high=2*high;     // exponintial growth ho raha hai.
}
return BinarySearch(arr,low,high);        


	
//  binary search floor (just smaller or equal to target element)

    static int findFloor(long arr[], int n, long x)
    {
        int low = 0, high = n-1;
        while(low<=high){
            
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
                return mid;
            
            if(x<arr[mid]) 
                high=mid-1;
                
            else
                low=mid+1;
        }
        return high;
    }

// binary search ceil ( just greater or equal to target element)

    static int findFloor(long arr[], int n, long x)
    {
        int low = 0, high = n-1;
        while(low<=high){
            
            int mid=low+(high-low)/2;
            if(arr[mid]==x)
                return mid;
            
            if(x<arr[mid]) 
                high=mid-1;
                
            else
                low=mid+1;
        }
        return low;
    }
