import java.util.ArrayList;

/*
You are given a n x n 2D matrix A representing an image.
Rotate the image by 90 degrees (clockwise).
You need to do this in place.
Note: If you end up using an additional array, you will only receive partial score.
 */
public class RotateMatrix {
    public void solve(ArrayList<ArrayList<Integer>> A) {
        int n = A.size();

        //tranpose the matrix
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = A.get(i).get(j);
                A.get(i).set(j, A.get(j).get(i));
                A.get(j).set(i, temp);
            }
        }

        //reverse row
        for(int i=0;i<n;i++){
            int left = 0, right  = n-1;
            while(left < right){
                int temp = A.get(i).get(left);
                A.get(i).set(left, A.get(i).get(right));
                A.get(i).set(right, temp);
                left++;
                right--;
            }
        }
    }

    public static void main(String[] args) {
//        input :  [[1, 2, 3],                [[1, 4, 7],
//                  [4, 5, 6],     -->         [2, 5, 8],
//                  [7, 8, 9]]                 [3, 6, 9]]

//        output :   [[7, 4, 1],
//                    [8, 5, 2],
//                    [9, 6, 3]]

    }
}
