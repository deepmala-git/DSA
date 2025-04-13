package recursion;


/*
Given two positive integers A and B. Implement Fast Power function to compute AB
Note : Please use the approach taught in the class.
 */
public class FastPower {
    public Long power(int A, int B) {
        if(B == 0){
            return 1l;
        }
        long powerHalf = power(A, B/2);
        if(B%2 == 1){
            return A * powerHalf * powerHalf;
        }else{
            return powerHalf * powerHalf;
        }
    }

    public static void main(String[] args) {
//        input : A = 2 , B = 10
//        output : 1024
    }
}
