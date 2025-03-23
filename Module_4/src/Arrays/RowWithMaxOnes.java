package Arrays;

import java.util.ArrayList;

/*
Given a binary sorted matrix A of size N x N. Find the row with the maximum number of 1.
NOTE:
If two rows have the maximum number of 1 then return the row which has a lower index.
Rows are numbered from top to bottom and columns are numbered from left to right.
Assume 0-based indexing.
Assume each row to be sorted by values.
Expected time complexity is O(rows + columns).
 */
public class RowWithMaxOnes {
    public int solve(ArrayList<ArrayList<Integer>> A) {
        int row = A.size();
        int col = A.get(0).size();
        int i=0, j =  col -1;
        int rowNum =-1;
        int countOne = 0;
        int max = 0;
        while(i < row && j >= 0){
            if(A.get(i).get(j) == 1){
                j--;
                countOne++;
                if(countOne == A.size()){
                    return i;
                }
            }
            if(A.get(i).get(j) == 0){
                if(countOne > max){
                    max = countOne;
                    rowNum = i;
                }
                countOne = 0;
                i++;
                j = col -1;
            }
        }
        return rowNum;
    }

    public static void main(String[] args) {
//        input :
//        A = [ [0, 1, 1]
//              [0, 0, 1]
//              [0, 1, 1]   ]
//        output : 0
    }
}
