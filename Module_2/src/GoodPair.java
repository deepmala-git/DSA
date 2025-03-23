import java.util.ArrayList;
import java.util.HashSet;


/*
Given an array A and an integer B. A pair(i, j) in the array is a good pair if
i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 */
public class GoodPair {
    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : A){
            int temp = B - i;
            if(set.contains(temp)){
                return 1;
            }
            set.add(i);
        }
        return 0;
    }

    public static void main(String[] args) {
//        input : A = [1,2,3,4]
//        B = 7
//        output : 1
//        (i,j) = (3,4) = 7
    }
}
