//Given a string containing of ‘0’, ‘1’ and ‘?’ wildcard characters, generate all binary strings that can be formed by replacing each wildcard character by ‘0’ or ‘1’.

public class GenerateBinaryString {
    public static void main(String[] args) {

        String str="1??0?10";
        // method 1st using reducing substing.
        GenerateString(str,"");
        
        System.out.println();
        // method 2nd using length of original string.
        Generate_Ans(str,0,"");
    }
    // method 1st.
    public static void GenerateString(String str,String ans)
    {
        if(str.length()==0)
        {
            System.out.print(ans+" ");
            return;
        }

        char ch=str.charAt(0);
        if(ch=='?'){

            GenerateString(str.substring(1), ans+'0');
            GenerateString(str.substring(1), ans+'1');
        }
        else
            GenerateString(str.substring(1), ans+str.charAt(0));
    }
    // method 2nd
    public static void Generate_Ans(String str,int i,String ans)
    {
        if(i==str.length())
        {
            System.err.print(ans+" ");
            return;
        }

        char ch=str.charAt(i);
        if(ch=='?'){

            Generate_Ans(str, i+1, ans+'0');
            Generate_Ans(str, i+1, ans+'1');
        }
        else
            Generate_Ans(str,i+1,ans+ch);
    }
}
