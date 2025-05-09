package recursion;

/*
Scooby has 3 three integers A, B, and C.
Scooby calls a positive integer special if it is divisible by B and it is divisible by C.
You need to tell the number of special integers less than or equal to A.
 */
public class DivisorGame {
    public int gcd(int x, int y) {
        if (x == 0)
            return y;
        return gcd(y % x, x);
    }
    public int solve(int A, int B, int C) {
        // find lcm of B and C
        long lcm = (long) B * C / gcd(B, C);
        if (lcm > A)
            return 0;
        // no of multiples of lcm that is <= A
        return (int)(A / lcm);
    }

    public static void main(String[] args) {
//        input : A = 12
//        B = 3
//        C = 2
//        output : 2
//        The two integers divisible by 2 and 3 and less than or equal to 12 are 6,12.
    }
}
