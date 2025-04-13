package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given an integer array A of size N, find the first repeating element in it.
We need to find the element that occurs more than once and whose index of the first occurrence
is the smallest.

If there is no repeating element, return -1.
 */
public class FirstRepeatingEle {
    public int solve(ArrayList<Integer> A) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int minIndex = Integer.MAX_VALUE;
        for(int i=0;i<A.size();i++){
            if(map.containsKey(A.get(i))){
                minIndex = Math.min(minIndex, map.get(A.get(i)));
            }else{
                map.put(A.get(i), i);
            }
        }
        return (minIndex == Integer.MAX_VALUE) ? -1 : A.get(minIndex);
    }

    public static void main(String[] args) {
//        input : A = [10, 5, 3, 4, 3, 5, 6]
//        output : 5
    }
}
