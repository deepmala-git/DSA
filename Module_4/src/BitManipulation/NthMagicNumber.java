package BitManipulation;

/*
Given an integer A, find and return the Ath magic number.
A magic number is defined as a number that can be expressed as a power of 5 or a sum
 of unique powers of 5.
First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
 */
public class NthMagicNumber {
    public int solve(int A) {
        int id = 1;
        int num = A;
        int res = 0;
        while(num > 0){
            if(num%2 == 1){
                res = res + (int)(Math.pow(5,id));
            }
            id++;
            num = num/2;
        }
        return res;
    }

    public static void main(String[] args) {
//        input : 3
//        output : 30
    }
}
