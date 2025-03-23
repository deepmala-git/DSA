import java.util.ArrayList;

/*
You are given an integer array A of length N.
You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 */
public class RangeSumQuery {
    public ArrayList<Long> rangeSum(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Long> ans = new ArrayList<>();
        long[] prefix = new long[A.size()];
        prefix[0] = A.get(0);
        for(int i=1;i<A.size();i++){
            prefix[i] = prefix[i-1]+A.get(i);
        }

        for(ArrayList<Integer> i : B) {
            int l = i.get(0);
            int r = i.get(1);
            long sum = prefix[r] - ((l==0)? 0 : prefix[l-1]);
            ans.add(sum);
        }

        return ans;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 3, 4, 5]
//                B = [[0, 3], [1, 2]]
//        output : [10,5]
    }
}
