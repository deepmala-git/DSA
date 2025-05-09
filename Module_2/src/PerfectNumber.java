
/*
You are given an integer A. You have to tell whether it is a perfect number or not.
Perfect number is a positive integer which is equal to the sum of its proper positive divisors.
A proper divisor of a natural number is the divisor that is strictly less than the number.
 */
public class PerfectNumber {
    public int solve(int A) {
        if(A <= 1) return 0;

        int sum = 1;

        for(int i=2; i*i <= A; i++){
            if(A%i == 0){
                sum = sum +i;
                if(i != A/i) sum = sum + A/i;
            }
        }
        if(sum == A){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
//        input : 6
//        output : 1
//        For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
    }
}
