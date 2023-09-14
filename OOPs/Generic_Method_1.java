class Main
{
  public static void main (String[] args)
  {
        Integer arr1[] = {5,6,4,4,5,12,56,9}; // note generic is only work on wrapper class not on premetive data types.
        String arr2[] = {"apple","cow","banana","car","dog","kela","dance"};
      
        print(arr1);
        System.out.println();
        print(arr2);
  }
  public static <T> void print(T [] arr)     // void type hai. No return type hai. generic
  {
        for(T i:arr)
            System.out.print(i+" ");
  } 
}
  
