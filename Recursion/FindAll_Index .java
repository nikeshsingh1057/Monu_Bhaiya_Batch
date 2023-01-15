// print all indexes where element present in array.

import java.util.Arrays;

public class FindAll_Index {
    // find all index if element present in array.
    public static void main(String[] args) {

        int arr[]={3,71,3,3,97,3,90,6,3,0};
        int item=3;
        int size=0;   // ye hume size batayega ki kiten length ki hume array return karwan hai function se (All_Index).

        int [] index=All_Index(arr,0,item,size);

        System.out.println(Arrays.toString(index));
    }
    public static int [] All_Index(int [] arr,int i,int item,int size)
    {
        if(i==arr.length)
            return new int[size];

        if(arr[i]==item)
        {
            int [] x = All_Index(arr, i+1, item, size+1);  //x me store kar rahe hai index jo upper se aaya hai.
            x[size]=i;
            return x;
        }
        else
            return All_Index(arr, i+1, item, size);
    }
}
