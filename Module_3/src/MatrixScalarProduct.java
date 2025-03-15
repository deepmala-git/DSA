import java.util.ArrayList;

/*
You are given a matrix A and and an integer B, you have to perform scalar multiplication
 of matrix A with an integer B.
 */
public class MatrixScalarProduct {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int Numrow = A.size();
        int Numcol = A.get(0).size();

        for(int i=0;i<Numrow;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<Numcol;j++){
                row.add(A.get(i).get(j) * B);
            }
            res.add(row);
        }
        return res;
    }

    public static void main(String[] args) {
//        input : A = [[1, 2, 3],
//                     [4, 5, 6],
//                     [7, 8, 9]]
//                B = 2
//        output :  [[2, 4, 6],
//                   [8, 10, 12],
//                   [14, 16, 18]]
    }
}
