package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
You are given an array A of N integers and an integer B.
Count the number of pairs (i,j) such that A[i] - A[j] = B and i ≠ j.
Since the answer can be very large, return the remainder after dividing the count with 109+7.
 */
public class CountPairDifference {
    public int solve(ArrayList<Integer> A, int B) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0;
        for(int i=0;i<A.size();i++){
            int num = A.get(i) - B;
            if(map.containsKey(num)){
                count = count + map.get(num);
            }
            int rev = A.get(i)+B;
            if(map.containsKey(rev)){
                count = count + map.get(rev);
            }
            map.put(A.get(i), map.getOrDefault(A.get(i),0)+1);
        }
        // System.out.print(map+" ");
        return count%1000000007;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 1, 2]
//        B = 1
//        output : 4
    }
}
