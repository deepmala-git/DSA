package recursion;

//Given a number A, we need to find the sum of its digits using recursion.
public class SumOfDigits {
    static int solve(int A) {
        if(A < 10) return A;
        return (A%10) + solve(A/10);
    }

    public static void main(String[] args) {
        System.out.println(solve(456));
    }
}
