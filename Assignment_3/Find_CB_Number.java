// Finding CB Numbers

import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str=sc.next();
		System.out.println(PrintSubString(str));

	}
	// check length wise substring.
	public static int PrintSubString(String str)
	{
		int count=0;
		boolean visited[]=new boolean [str.length()];
		for(int len=1;len<=str.length();len++)
		{
			for(int j=len;j<=str.length();j++)
			{
				int i=j-len;
				String s=str.substring(i,j);
				long num=Long.parseLong(s);
				
				if(isCBnumber(num)==true && isvisited(visited,i,j-1)==true) {
					count++;
					
					for(int k=i;k<=j-1;k++)
						visited[k]=true;
				}
			}
		}
		return count;
	}
	// check cb number.
	public static boolean isCBnumber(long num)
	{
		if(num==1|| num==0)
			return false;
		
		int arr[]= {2,3,5,7,11,13,17,19,23,29};
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
				return true;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(num%arr[i]==0)
				return false;
		}
		return true;
	}
	// checking visited element i.e if digit is already visited.
	public static boolean isvisited(boolean [] visited,int i,int j)
	{
		for(int k=i;k<=j;k++)
		{
			if(visited[k]==true)
				return false;
		}
		return true;
	}
}
