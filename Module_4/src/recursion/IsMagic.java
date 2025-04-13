package recursion;

/*
Given a number A, check if it is a magic number or not.
A number is said to be a magic number if the sum of its digits is calculated till a single digit
 recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1,
 then the number is a magic number.
 */
public class IsMagic {
    static int add(int B){
        if(B<10){
            return B;
        }
        return  (B%10) + add(B/10);
    }

    public int solve(int A) {
        if(A == 1) return 1;
        if(A < 10) return 0;
        A = add(A);
        return solve(A);
    }

    public static void main(String[] args) {
//        input : A = 83557
//        output : 1
    }
}
