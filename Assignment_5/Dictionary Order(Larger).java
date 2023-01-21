import java.util.*;
public class Main {
    public static void main(String args[]) {
        
        ArrayList<String> ll=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        PrintAnswer(str,"",ll);

        Collections.sort(ll);
        for(String ans: ll){
            
            int a=ans.compareTo(str);
            if(a>0)
                System.out.println(ans);
        }
    }
    public static void PrintAnswer(String ques,String ans,ArrayList<String> ll)
	{
		if(ques.length()==0) {  
			
			ll.add(ans);
			return;
		}
		
		for(int i=0;i<ques.length();i++) {
			
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			
			char ch=ques.charAt(i);
			PrintAnswer(s1+s2,ans+ch,ll);
		}
	}
}
