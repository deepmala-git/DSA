import java.util.ArrayList;

/*
You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.
 */
public class MatrixAddition {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int Numrow = A.size();
        int NUmcol = A.get(0).size();

        for(int i=0;i<Numrow;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<NUmcol;j++){
                row.add(A.get(i).get(j) + B.get(i).get(j));
            }
            res.add(row);
        }

        return res;
    }

    public static void main(String[] args) {
//        input : A = [[1, 2, 3],
//                     [4, 5, 6],
//                     [7, 8, 9]]
//
//                B = [[9, 8, 7],
//                     [6, 5, 4],
//                     [3, 2, 1]]
//        output :[[10, 10, 10],
//                 [10, 10, 10],
//                 [10, 10, 10]]
    }
}
