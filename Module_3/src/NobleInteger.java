import java.util.ArrayList;
import java.util.Collections;

/*
Given an integer array A, find if an integer p exists in the array such that the number of integers
 greater than p in the array equals p.
 */
public class NobleInteger {
    public int solve(ArrayList<Integer> A) {
        A.sort(Collections.reverseOrder());
        int count = 0;
        for(int i=0;i<A.size();i++){
            if(i != 0 && A.get(i) != A.get(i-1)){
                count = i;
            }
            if(count == A.get(i)){
                return 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
//        input : A = [3, 2, 1, 3]
//        output : 1
    }
}
