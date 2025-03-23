
/*
Given a number A. Return 1 if A is prime and return 0 if not.
Note :
The value of A can cross the range of Integer.
 */
public class isPrime {
    public int solve(int A) {
        if(A<2) return 0;
        if(A == 2 || A== 3) return 1;
        for(int i=2; i<= Math.sqrt(A); i++){
            if(A%i == 0){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
//        input : 3
//        output : 1
    }
}
