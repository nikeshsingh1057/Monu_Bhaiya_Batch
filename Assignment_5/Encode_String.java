public class Encode_String{
    public static void main(String[] args) {
        
        String str="123";

        Decode(str,"");
    }
  // method 1st sumit sir wala.
    public static void Decode(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.println(ans);
            return;
        }
        else if(str.length()==1)
        {
            char ch=str.charAt(0);

            if(ch=='0')
                return;
            
            else{

                int chv=ch-'0';
                char code=(char)('a'+chv-1);

                ans+=code;
                System.out.println(ans);
            }

        }
        else{
            
            char ch=str.charAt(0);
            String ros=str.substring(1);

            if(ch=='0')
                return;

            else{

                int chv=ch-'0';
                char code =(char)('a'+chv-1);
                Decode(ros, ans+code);
            }

            String ch12=str.substring(0,2);  // ch12 - char length two length wale
            String ro12=str.substring(2);

            int ch12v=Integer.parseInt(ch12);      // now for value.

            if(ch12v<=26)
            {
                char code=(char)('a'+ch12v-1);
                Decode(ro12, ans+code);
            }

        }
    }
  // method 2 using string partation monu bhaiya wala.
   public static void ParatationString(String str,String an)
	{
 		if(str.length()==0)
		{
      System.out.println(ans);
			return ;
		}
     
		for(int i=1;i<=str.length();i++)
		{
			String part=str.substring(0,i);
			
            if(part.charAt(0)=='0')
               return ;
            
            if(part.length()>2)
                continue;
            
		 int a=Integer.valueOf(part)+64;
		    
		String ros=str.substring(i);
            
            
		if(a<91)
			ParatationString(ros,an+(char)a);
      
     return count;
	}
}
