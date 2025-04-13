package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given an array A of N integers.
Find the length of the longest subarray in the array which sums to zero.
If there is no subarray which sums to zero then return 0.
 */
public class LongestSubArrayZeroSum {
    public int solve(ArrayList<Integer> A) {
        HashMap<Long, Integer> mpp = new HashMap<>();
        int n = A.size();
        int maxi = 0;
        long sum = 0;

        for(int i = 0;i<n;i++) {

            sum += A.get(i);

            if(sum == 0) {
                maxi = Math.max(maxi, i + 1);
            }
            if(mpp.containsKey(sum)) {
                maxi = Math.max(maxi, i - mpp.get(sum));
            }else{
                mpp.put(sum, i);
            }
        }
        // System.out.print(mpp+" ");
        return maxi;
    }

    public static void main(String[] args) {
//        input : A = [1, -2, 1, 2]
//        output : 3
    }
}
