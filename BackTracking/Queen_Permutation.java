
// print all possible way to put Q queen in N box.
// we are finding all permutations.

public class Queen_Permutation {
	
	static int count=0;
	public static void main(String[] args) {
		
		int tq=2;
		
		boolean[] board=new boolean[4];
		
		Permutation(board,tq,0,"");
		
		System.out.println(count);
	}
	
	public static void Permutation(boolean[] board,int tq,int qpsf,String ans) // qpsf-> queen place so far // tq->total no. of queen
	{
		if(qpsf==tq)
		{
			count++;
			System.out.println(ans);
			return;
		}
		for(int i=0;i<board.length;i++)
		{
			if(board[i]==false) {
				
				board[i]=true;
				Permutation(board,tq,qpsf+1,ans+"b"+i+"q"+qpsf);
				board[i]=false;
			}
		}
	}
}


//b0q0b1q1
//b0q0b2q1
//b0q0b3q1
//b1q0b0q1
//b1q0b2q1
//b1q0b3q1
//b2q0b0q1
//b2q0b1q1
//b2q0b3q1
//b3q0b0q1
//b3q0b1q1
//b3q0b2q1
//12

