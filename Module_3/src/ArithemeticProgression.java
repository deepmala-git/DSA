import java.util.ArrayList;
import java.util.Collections;

/*
Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic
progression, otherwise return 0.
A sequence of numbers is called an arithmetic progression if the difference between any two consecutive
 elements is the same.
 */
public class ArithemeticProgression {
    public int solve(ArrayList<Integer> A) {
        Collections.sort(A);
        int diff = A.get(1) - A.get(0);
        for(int i=2;i<A.size();i++){
            int d = A.get(i) - A.get(i-1);
            if(d != diff){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

    }
}
