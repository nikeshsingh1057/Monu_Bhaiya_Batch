// flip a and b (maimum k at a time to filp) so that string make equal.
// method 1.

import java.util.*;
public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        int k=sc.nextInt();
        String str=sc.next();

        int flip_a=Flip_Char(str,k,'b','a');
	int flip_b=Flip_Char(str,k,'a','b');
		
	System.out.println(Math.max(flip_a,flip_b));

    }

    public static int Flip_Char(String str,int k,char ch1,char ch2)
	{
		int i=0;
		int flip=0;
		int ans=0;
		int j=0;
		int max=0;
		while(i<str.length())
		{
			if(str.charAt(i)!=ch2)
				flip++;
			
			while(flip>k)
			{
				if(str.charAt(j)==ch1)
					flip--;
				j++;
			}
			max=i-j+1;
			ans=Math.max(max, ans);
			i++;
		}
		return ans;
	}
}



// method 2 only passing single charector.

public class Kartik_Bhaiya_and_String {

	public static void main(String[] args) {
		
		String str="abba";
		int k=2;
		
	    int a_filp=Perfetness_Maximum_length(str,k,'a');
		int b_filp=Perfetness_Maximum_length(str,k,'b');
		
		System.out.println(Math.max(a_filp, b_filp));
	}
	public static int Perfetness_Maximum_length(String str,int k,char ch)
	{
		int flip=0;
		int si=0;
		int ei=0;
		int ans=0;
		while(ei<str.length())
		{
			if(str.charAt(ei)==ch)
				flip++;
			
			while(flip>k)
			{
				if(str.charAt(si)==ch)
					flip--;
				si++;
			}
			ans=Math.max(ans, ei-si+1);
			ei++;
		}
		return ans;
	}
}
