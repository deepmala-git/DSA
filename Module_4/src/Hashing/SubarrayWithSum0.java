package Hashing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/*
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
If the given array contains a sub-array with sum zero return 1, else return 0.
 */
public class SubarrayWithSum0 {
    public int solve(ArrayList<Integer> A) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        long sum = 0;
        Set<Long> set = new HashSet<>();
        for(int i=0;i<A.size();i++){
            sum = sum + A.get(i);
            if(A.get(i)==0 || (sum == 0) || (set.contains(sum))){
                return 1;
            }
            set.add(sum);
        }
        return 0;
    }

    public static void main(String[] args) {
//        input :  A = [1, 2, 3, 4, 5]
//        output : 0
    }
}
