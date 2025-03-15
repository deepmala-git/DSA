import java.util.ArrayList;

/*
You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original
 matrix.
 */
public class ColumnSum {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> Colsum = new ArrayList<>();
        int col = A.get(0).size();
        for(int i=0;i<col;i++){
            int sum = 0;
            for(ArrayList<Integer> row : A){
                sum += row.get(i);
            }
            Colsum.add(sum);
        }
        return Colsum;
    }

    public static void main(String[] args) {
//        input :
//        [1,2,3,4]
//        [5,6,7,8]
//        [9,2,3,4]
//
//        output : {15,10,13,16}
    }
}
