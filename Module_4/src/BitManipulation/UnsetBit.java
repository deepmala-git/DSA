package BitManipulation;

/*
You are given two integers A and B.
If B-th bit in A is set, make it unset.
If B-th bit in A is unset, leave as it is.
Return the updated A value.

Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
 */
public class UnsetBit {
    public int solve(int A, int B) {
        int res = 0;
        res = A ^ (1<<B);
        if(res < A){
            return res;
        }else{
            return A;
        }
    }

    public static void main(String[] args) {
//        input :A = 4
//        B = 1
//        output : 4
    }
}
