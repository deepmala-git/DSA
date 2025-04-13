package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
You are given an array A of N integers. Return the count of elements with frequncy 1 in the given array.
 */
public class CountUniqueEle {
    public int solve(ArrayList<Integer> A) {
        int unique = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : A){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        for(int n : map.values()){
            if(n ==1){
                unique++;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
//        input : A = [3, 3, 3, 9, 0, 1, 0]
//        output : 2
    }
}
