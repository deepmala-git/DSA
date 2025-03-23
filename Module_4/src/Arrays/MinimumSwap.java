package Arrays;

import java.util.ArrayList;

/*
Given an array of integers A and an integer B, find and return the minimum number of swaps required to
 bring all the numbers less than or equal to B together.
Note: It is possible to swap any two elements, not necessarily consecutive.
 */
public class MinimumSwap {
    public int solve(ArrayList<Integer> A, int B) {
        int goodCount=0;
        int badCount = 0;
        int countswap = 0;
        for(int i=0;i<A.size();i++){
            if(A.get(i) <= B){
                goodCount++;
            }
        }
        if(goodCount == 0 || goodCount == 1){
            return 0;
        }

        for(int i=0;i<goodCount;i++){
            if(A.get(i) > B){
                badCount++;
            }
        }

        countswap = badCount;
        for(int i = goodCount;i<A.size();i++){
            if(A.get(i-goodCount) > B){
                badCount--;
            }
            if(A.get(i) > B){
                badCount++;
            }
            countswap = Math.min(countswap, badCount);
        }
        return countswap;
    }

    public static void main(String[] args) {
//        input :
//        A = [1, 12, 10, 3, 14, 10, 5]
//        B = 8
//        output : 2

//        A = [1, 12, 10, 3, 14, 10, 5]
//        After swapping  12 and 3, A => [1, 3, 10, 12, 14, 10, 5].
//        After swapping  the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].
//        Now, all elements less than or equal to 8 are together.
    }
}
