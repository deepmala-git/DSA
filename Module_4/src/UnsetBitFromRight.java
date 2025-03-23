
/*
Given an integer A. Unset B bits from the right of A in binary.

For example, if A = 93 and B = 4, the binary representation of A is 1011101.
If we unset the rightmost 4 bits, we get the binary number 1010000, which is equal to
the decimal value 80
 */
public class UnsetBitFromRight {
    public Long solve(Long A, int B) {
        long num = A;
        for(long i=0;i<B;i++){
            if((A & (1<<i)) > 0){
                num = num ^ (1<<i);
            }
        }
        return num;
    }

    public static void main(String[] args) {
//        input : A = 25
//        B = 3
//        output : 24
    }
}
