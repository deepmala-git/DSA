import java.util.ArrayList;

public class RowSum {
    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int Numrow = A.size();
        int Numcol = A.get(0).size();

        for(int i=0;i<Numrow;i++){
            int sum = 0;
            for(int j=0;j<Numcol;j++){
                sum = sum + A.get(i).get(j);
            }
            res.add(sum);
        }

        return res;
    }

    public static void main(String[] args) {
//        input : [1,2,3,4]
//                [5,6,7,8]
//                [9,2,3,4]
//        output :[10,26,18]
    }
}
