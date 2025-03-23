package recursion;

public class Fibonacci {
    static int solve(int A){
        if(A == 1) return 1;
        if(A == 0) return 0;
        return solve(A-1)+solve(A-2);
    }

    public static void main(String[] args) {
        System.out.println(solve(7));
    }
}
