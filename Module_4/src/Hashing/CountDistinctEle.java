package Hashing;

import java.util.ArrayList;
import java.util.HashSet;

/*
Given an array A of N integers, return the number of unique elements in the array.
 */
public class CountDistinctEle {
    public int solve(ArrayList<Integer> A) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<A.size();i++){
            set.add(A.get(i));
        }
        return set.size();
    }

    public static void main(String[] args) {
//        input : A = [3, 4, 3, 6, 6]
//        output : 3
    }
}
