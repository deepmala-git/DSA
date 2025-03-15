import java.util.ArrayList;
import java.util.Collections;

public class ElementsRemoval {
    public int solve(ArrayList<Integer> A) {
        A.sort(Collections.reverseOrder());

        int totalcost = 0;
        int sum = A.stream().mapToInt(Integer::intValue).sum();

        for(int i=0;i<A.size();i++){
            totalcost = totalcost + sum;
            sum = sum - A.get(i);
        }
        return totalcost;
    }

    public static void main(String[] args) {
//        input : A = [2, 1]
//        output : 4
//        Given array A = [2, 1]
//        Remove 2 from the array => [1]. Cost of this operation is (2 + 1) = 3.
//        Remove 1 from the array => []. Cost of this operation is (1) = 1.
//        So, total cost is = 3 + 1 = 4.
    }
}
