import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
Find the Bth smallest element in given array A .
NOTE: Users should try to solve it in less than equal to B swaps
 */
public class KthSmallestElement {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int kthsmallest(final List<Integer> A, int B) {
        ArrayList<Integer> temp = new ArrayList<>(A);
        int n = temp.size();
        for(int i=0;i<B;i++){
            int min = i;
            for(int j=i;j<n;j++){
                if(temp.get(j) < temp.get(min)) min = j;
            }
            Collections.swap(temp,i,min);
        }
        return temp.get(B-1);
    }

    public static void main(String[] args) {
//        input : A = [2, 1, 4, 3, 2]
//        B = 3
//        output : 2
    }
}
