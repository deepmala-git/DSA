import java.util.ArrayList;
import java.util.List;

/*
You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that
i + j = M + 1 (where i, j are 1-based).
 */
public class MinorDIagonalSum {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int solve(final List<ArrayList<Integer>> A) {
        int sum = 0;
        int n = A.size();

        for(int i=0;i<n;i++){
            int j = n-1-i;
            sum = sum + A.get(i).get(j);
        }

        return sum;
    }

    public static void main(String[] args) {
//        input : A = [[1, -2, -3],
//                     [-4, 5, -6],
//                     [-7, -8, 9]]
//        output : -5
//        A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
    }
}
