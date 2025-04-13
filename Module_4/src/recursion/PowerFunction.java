package recursion;

/*
Implement pow(A, B) % C.
In other words, given A, B and C, Find (AB % C).
Note: The remainders on division cannot be negative. In other words, make sure the answer
 you return is non-negative.
 */
public class PowerFunction {
    public int pow(int A, int B, int C) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        if(A == 0) return 0;
        if(B == 0) return 1;
        long x = pow(A,B/2,C);
        long res = (x*x)%C;
        if(B%2 == 1){
            res =  (res * (A%C))%C;
        }
        return (int)(res + C)%C;
    }

    public static void main(String[] args) {
//        input : A = 2
//        B = 3
//        C = 3
//        output : 2 (2^3 % 3)
    }
}
