import java.util.ArrayList;

public class SumAllSubMatrix {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int sum = 0;
        int row = A.size();
        int col = A.get(0).size();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sum = sum + A.get(i).get(j) * (i+1) * (j+1) * (row - i) * (col - j);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
//        input :
//        A = [ [1, 2]
//              [3, 4] ]
        output :
//        40
    }
}
