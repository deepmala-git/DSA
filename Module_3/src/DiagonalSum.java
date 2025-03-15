import java.util.ArrayList;
import java.util.List;

/*
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
 */
public class DiagonalSum {
    public int solve(final List<ArrayList<Integer>> A) {
        int n = A.size();
        int sum = 0;
        for(int i=0;i<n;i++){
            sum = sum + A.get(i).get(i);
        }
        return sum;
    }

    public static void main(String[] args) {
//        input : 3 3 1 -2 -3 -4 5 -6 -7 -8 9
//        output : 15
//        The size of matrix is 3.
//        So, considering the indexing from 0.
//        Main diagonal elements will be A[0][0], A[1][1] and A[2][2]
//        A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15
    }
}
