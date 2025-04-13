package Hashing;

import java.util.ArrayList;
import java.util.HashSet;


/*
Given an Array of integers B, and a target sum A.
Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
 */
public class CheckPairSum {
    public int solve(int A, ArrayList<Integer> B) {
        HashSet<Integer> set = new HashSet<>();
        // int sum = 0;
        for(int i=0;i<B.size();i++){
            int comp = A - B.get(i);
            if(set.contains(comp)){
                return 1;
            }
            set.add(B.get(i));
        }
        return 0;
    }

    public static void main(String[] args) {
//        input : A = 8
//        B = [3, 5, 1, 2, 1, 2]
//        ouput : 1
    }
}
