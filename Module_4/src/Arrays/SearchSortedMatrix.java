package Arrays;

import java.util.ArrayList;

public class SearchSortedMatrix {
    public int search(ArrayList<ArrayList<Integer>> A, int B) {
        int i= 0,j = A.get(0).size()-1;
        int n = i, m = j;
        boolean found = false;
        int res = Integer.MAX_VALUE;
        while(i < A.size() && j >=0){
            if(A.get(i).get(j) == B){
                n = i+1;
                m = j+1;
                found = true;
                res = Math.min(res,(n*1009+m));
            }
            if(B > A.get(i).get(j)){
                i++;
            }else{
                j--;
            }
        }
        return (found == true) ? res : -1;
    }

    public static void main(String[] args) {
//        input :
//        A = [[1, 2, 3]
//             [4, 5, 6]
//             [7, 8, 9]]
//        B = 2

//        output :
//        A[1][2] = 2
//        1 * 1009 + 2 = 1011
    }
}
