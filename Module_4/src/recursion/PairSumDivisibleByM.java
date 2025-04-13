package recursion;

import java.util.ArrayList;

/*
Given an array of integers A and an integer B, find and return the number of pairs in A whose sum is divisible by B.
Since the answer may be large, return the answer modulo (109 + 7).
Note: Ensure to handle integer overflow when performing the calculations.
 */
public class PairSumDivisibleByM {
    public int solve(ArrayList<Integer> A, int B) {
        int[] freq = new int[B];
        int ans = 0;
        for(int i=0;i<A.size();i++){
            int x = A.get(i)%B;
            if(x == 0){
                ans = ans + freq[0];
                freq[0]++;
            }else{
                ans = ans + freq[B-x];
                freq[x]++;
            }
        }
        return ans%1000000007;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 3, 4, 5]
//        B = 2
//        output : 4  [(1,3), (1,5), (2,4), (3,5)]
    }
}
