package BackTracking;
public class Queen_Combination {
	
	static int count=0;
	public static void main(String[] args) {
		
		int tq=2;
		
		boolean[] board=new boolean[4];
		
		Permutation(board,tq,0,"",0);
		
		System.out.println(count);
	}
	
	public static void Permutation(boolean[] board,int tq,int qpsf,String ans,int j) // qpsf-> queen place so far // tq->total no. of queen
	{
		if(qpsf==tq)
		{
			count++;
			System.out.println(ans);
			return;
		}
		for(int i=j;i<board.length;i++)
		{
			if(board[i]==false) {
				
				board[i]=true;
				Permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf,i+1);
				board[i]=false;
			}
		}
	}
}

//b0q0b1q1
//b0q0b2q1
//b0q0b3q1
//b1q0b2q1
//b1q0b3q1
//b2q0b3q1
//6
