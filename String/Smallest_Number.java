//  2375. Construct Smallest Number From DI String

// very important question ..(note-> match the pattern and fill the count according to pattern.)

// jab tak I nahi mila tab tak count increase if I get then left me chalna start kar denge and jab tak I nahi mila tab tak chalenge.

public class smallestNumber {

	public static void main(String[] args) {
			
		String str="DDIIIDD";
		
		System.out.println(Smallest_Number(str));
	}
	
	public static String Smallest_Number(String str)
	{
		int [] ans= new int[str.length()+1];
		int count=1;
		
		for(int i=0;i<=str.length();i++)
		{
			if(i==str.length() || str.charAt(i)=='I')
			{
				ans[i]=count;
				count++;
				
				for(int j=i-1;j>=0 && str.charAt(j)!='I';j--) {
					
					ans[j]=count;
					count++;
					
				}
			}
		}
		
		String str_ans="";
        
        for(int i: ans)
        {
            str_ans+=i;
        }
        
        return str_ans;
	}
}
