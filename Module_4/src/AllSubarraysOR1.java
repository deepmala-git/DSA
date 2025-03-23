import java.util.ArrayList;

/*
You are given an array of integers A of size N.
The value of a subarray is defined as BITWISE OR of all elements in it.
Return the sum of value of all subarrays of A % 109 + 7.
 */
public class AllSubarraysOR1 {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int[] idx = new int[32];
        long ans = 0;
        for (int i = 1; i <= n; ++i) {
            long tmp = A.get(i - 1);
            for (int j = 0; j <= 31; ++j) {
                long pw = 1 << j;
                if ((tmp & pw) != 0) { //if jth bit is set
                    ans += pw * i; // add its contribution in ans for all subarrays ending at index i
                    idx[j] = i; // store the index for next elements
                } else if (idx[j] != 0) // if jth bit is not set
                {
                    ans += pw * idx[j]; // add its contribution in ans for all subarrays ending at index i using
                } // the information of last element having jth bit set
            }
        }
        return (int)(ans % 1000000007);
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 3, 4, 5]
//        output : 71
//        Value([1]) = 1
//        Value([1, 2]) = 3
//        Value([1, 2, 3]) = 3
//        Value([1, 2, 3, 4]) = 7
//        Value([1, 2, 3, 4, 5]) = 7
//        Value([2]) = 2
//        Value([2, 3]) = 3
//        Value([2, 3, 4]) = 7
//        Value([2, 3, 4, 5]) = 7
//        Value([3]) = 3
//        Value([3, 4]) = 7
//        Value([3, 4, 5]) = 7
//        Value([4]) = 4
//        Value([4, 5]) = 5
//        Value([5]) = 5
//        Sum of all these values = 71
    }
}
