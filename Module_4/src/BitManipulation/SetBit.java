package BitManipulation;

/*
You are given two integers A and B.
Set the A-th bit and B-th bit in 0, and return output in decimal Number System.

Note:
The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
 */
public class SetBit {
    public int solve(int A, int B) {
        int res = (int)(Math.pow(2,A));
        if(A != B){
            res = res +  (int)Math.pow(2,B);
        }
        return res;
    }

    public static void main(String[] args) {
//        input : A = 3
//        B = 5
//        output : 40
    }
}
