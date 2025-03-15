import java.util.ArrayList;

/*
Given a 2D integer array A, return the transpose of A.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's
 row and column indices.
 */
public class MatrixTranspose {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int NumCol = A.get(0).size();
        for(int i=0;i<NumCol;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<A.size();j++){
                row.add(A.get(j).get(i));
            }
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
//        input :
//        A = [[1, 2, 3],
//             [4, 5, 6],
//             [7, 8, 9]]

//        output :[[1, 4, 7],
//                 [2, 5, 8],
//                 [3, 6, 9]]
    }
}
