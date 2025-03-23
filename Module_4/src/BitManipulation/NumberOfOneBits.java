package BitManipulation;

//Write a function that takes an integer and returns the number of 1 bits present in its
// binary representation.
public class NumberOfOneBits {
    public int numSetBits(int A) {
        int count =0;
        int num = A;
        while(num != 0){
            count = count + (num & 1);
            num = num>>1;
        }
        return count;
    }

    public static void main(String[] args) {
//        input : 11
//        output : 3 (1011)
    }

}
