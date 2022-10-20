// leetcode rotate 2d array by 90 degree.

class Solution {
    public void rotate(int[][] arr) {
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr[0].length;j++)  // we can aslo put j=i but dianonal elmenent not chance go no need to j=1 so we do j=j+1.
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        
        // reverse of matrix according to row wise.
        for(int i=0;i<arr.length;i++)
            Reverse(arr[i]);  // 1st row ka address bhej rahe hai or we can say reference pass kar rahe hai.

    }
    public static void Reverse(int [] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
