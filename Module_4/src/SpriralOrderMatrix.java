import java.util.ArrayList;

public class SpriralOrderMatrix {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<A;i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0;j<A;j++){
                row.add(0);
            }
            res.add(row);
        }
        int ele = 1;
        int row = 0,col =0;
        int N = A;
        while(N > 1){
            for(int i=0;i<N-1;i++){
                res.get(row).set(col, ele);
                ele++;
                col++;
            }
            for(int i=0;i<N-1;i++){
                res.get(row).set(col, ele);
                ele++;
                row++;
            }
            for(int i=0;i<N-1;i++){
                res.get(row).set(col, ele);
                ele++;
                col--;
            }
            for(int i=0;i<N-1;i++){
                res.get(row).set(col, ele);
                ele++;
                row--;
            }
            row++; col++;
            N = N -2;
        }
        if(N == 1){
            res.get(row).set(col,ele);
        }
        return res;
    }

    public static void main(String[] args) {
//        input : 5
//        output :
//        [ [1,   2,  3,  4, 5],
//  [16, 17, 18, 19, 6],
//  [15, 24, 25, 20, 7],
//  [14, 23, 22, 21, 8],
//  [13, 12, 11, 10, 9] ]
    }
}
