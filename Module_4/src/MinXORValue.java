import java.util.ArrayList;
import java.util.Collections;

/*
Given an integer array A of N integers, find the pair of integers in the array which
 have minimum XOR value. Report the minimum XOR value.
 */
public class MinXORValue {
    public int findMinXor(ArrayList<Integer> A) {
        Collections.sort(A);
        int res = A.get(0)^A.get(1);
        for(int i=1;i<A.size()-1;i++){
            int xor  = A.get(i)^A.get(i+1);
            res = Math.min(xor,res);
        }
        return res;
    }

    public static void main(String[] args) {
//        input : A = [0, 2, 5, 7]
//        output : 2
    }
}
