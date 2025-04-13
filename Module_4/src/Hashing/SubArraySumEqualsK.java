package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given an array of integers A and an integer B.
Find the total number of subarrays having sum equals to B.
 */
public class SubArraySumEqualsK {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int count = 0;
        for(int i=0;i<A.size();i++){
            sum = sum + A.get(i);
            if(map.containsKey(sum - B)){
                count = count + map.get(sum - B);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[] args) {
//        input : A = [1, 0, 1]
//        B = 1
//        output : 4
    }
}
