// Guess Number Higher or Lower

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        
       int low=1,high=n;
       int mid=0;
        
       while(low<=high)
       {
            mid=low+(high-low)/2;
           
           if(guess(mid)==0)
              break;
           
           if(guess(mid)<0)
           {
               high=mid-1;
           
           }
           
           if(guess(mid)>0){
               
               low=mid+1;
           }
           
       }
        return mid;
    }
}
