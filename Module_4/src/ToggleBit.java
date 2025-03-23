
/*
You are given two integers A and B.
If B-th bit in A is set, make it unset
If B-th bit in A is unset, make it set
Return the updated A value
 */
public class ToggleBit {
    public int solve(int A, int B) {
        int res = 0;
        res = A ^ (1<<B);
        return res;
    }

    public static void main(String[] args) {
//        input :A = 4
//        B = 1
//        output : 6
    }
}
