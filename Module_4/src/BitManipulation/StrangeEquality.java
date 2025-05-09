package BitManipulation;

/*
Given an integer A.
Two numbers, X and Y, are defined as follows:
X is the greatest number smaller than A such that the XOR sum of X and A is the same as the sum of X and A.
Y is the smallest number greater than A, such that the XOR sum of Y and A is the same as the sum of Y and A.
Find and return the XOR of X and Y.
NOTE 1: XOR of X and Y is defined as X ^ Y where '^' is the BITWISE XOR operator.
NOTE 2: Your code will be run against a maximum of 100000 Test Cases.
 */
public class StrangeEquality {
    public int solve(int A) {
        int x = 0;
        int bit = 0;
        int num = A;
        while(num > 0){
            if((num&1) == 0){ //if bit is not set then set the bit
                x = x | (1<<bit);
            }
            bit++;
            num = num>>1;
        }

        int y = 1;
        while(y <= A){ //return just next 2 power
            y = y<<1;
        }
        return x^y;
    }

    public static void main(String[] args) {
//        input : 5
//        output : 10
//        The value of X will be 2 and the value of Y will be 8. The XOR of 2 and 8 is 10.
    }
}
