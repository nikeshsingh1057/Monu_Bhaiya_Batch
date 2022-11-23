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
