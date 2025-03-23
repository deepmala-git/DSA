package recursion;

public class Factorial {
    static int solve(int A) {
        if(A <= 1) return 1;
        return A * solve(A -1);
    }

    public static void main(String[] args) {
        System.out.println(solve(5));
    }
}
