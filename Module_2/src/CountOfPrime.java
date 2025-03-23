
/*
You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
 */
public class CountOfPrime {
    public static boolean isPrime(int num){
        if(num < 2) return false;
        if(num==2) return true;
        if(num%2 == 0) return false;
        for(int i=3;i*i <= num;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public int solve(int A) {
        int count = 0;
        for(int i=2;i<=A;i++){
            if(isPrime(i)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        input : 19
//        output : 8
//        Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
    }
}
