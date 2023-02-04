public class Split_Array{

    // ye split array wala hai. 
    public static void main(String[] args) {
        
        int arr[]={1,2,3};

        SubsetPrint(arr,"","",0,0,0);
    }
    public static void SubsetPrint(int arr[],String ans,String ans2,int i,int a,int b)
    {


        if(i==arr.length && a==b)
        {
            System.out.println(ans+" "+ans2);
            return;
        }
      
       if(i>=arr.length)
       return;

       
        SubsetPrint(arr, ans+arr[i],ans2,i+1,a+arr[i],b);

        SubsetPrint(arr, ans,ans2+arr[i],i+1,a,b+arr[i]);
        
    }
}
