import java.util.ArrayList;

public class AntiDiagonal {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> antiDiag = new ArrayList<>();
        int Numcol = A.get(0).size();
        for(int j=0;j<Numcol;j++){
            int row=0, col=j;
            ArrayList<Integer> diag = new ArrayList<>();
            while(row < A.size() && col >=0){
                diag.add(A.get(row).get(col));
                row++;
                col--;
            }
            for(int i=row;i<Numcol;i++){
                diag.add(0);
            }
            antiDiag.add(diag);
        }

        for(int i=1;i<A.size();i++){
            int row=i,col=Numcol-1;
            ArrayList<Integer> diag = new ArrayList<>();
            while(row< A.size() && col>=0){
                diag.add(A.get(row).get(col));
                row++;
                col--;
            }
            for(int j=col;j>=0;j--){
                diag.add(0);
            }
            antiDiag.add(diag);
        }

        return antiDiag;
    }
}
