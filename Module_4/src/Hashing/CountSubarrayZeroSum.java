package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given an array A of N integers.

Find the count of the subarrays in the array which sums to zero. Since the answer can be very large,
 return the remainder on dividing the result with 109+7
 */
public class CountSubarrayZeroSum {
    public int solve(ArrayList<Integer> A) {
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        for(int i=0;i<A.size();i++){
            sum = sum + A.get(i);
            if(map.containsKey(sum -0)){
                count = count + map.get(sum-0);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
//        input : A = [1, -1, -2, 2]
//        output : 3
    }
}
