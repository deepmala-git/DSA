package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
You are given an array A of N integers and an integer B. Count the number of pairs (i,j)
such that A[i] + A[j] = B and i ≠ j.
Since the answer can be very large, return the remainder after dividing the count with 109+7.
Note - The pair (i,j) is same as the pair (j,i) and we need to count it only once.
 */
public class CountPairSum {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ///map.put(0,1);
        int count = 0;
        for(int i=0;i<A.size();i++){
            int comp = B - A.get(i);
            if(map.containsKey(comp)){
                count = count + map.get(comp);
            }
            map.put(A.get(i), map.getOrDefault(A.get(i),0)+1);
        }
        return count%1000000007;
    }

    public static void main(String[] args) {
//        input : A = [3, 5, 1, 2]
//        B = 8
//        output : 1
    }
}
