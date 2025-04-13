package recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers A, calculate the sum of A [ i ] % A [ j ] for all possible i, j pairs.
 Return sum % (109 + 7) as an output.
 */
public class ModSum {
    public int solve(ArrayList<Integer> A) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : A){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        int sum = 0;
        for(int num1 : map.keySet()){
            for(int num2 : map.keySet()){
                if(num1 != num2){
                    sum = (sum + (num1% num2) * map.get(num1) * map.get(num2))%1000000007;
                }
            }
        }
        return sum%1000000007;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 3]
//        output : 5
    }
}
