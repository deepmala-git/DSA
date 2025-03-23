
/*
Given an integer A, you need to find the count of it's factors.
Factor of a number is the number which divides it perfectly leaving no remainder.
Example : 1, 2, 3, 6 are factors of 6
 */
public class CountFactorsOfNum {
    public int solve(int A) {
        int count = 0;
        for(int i=1; i<= Math.sqrt(A); i++){
            if(A%i == 0){
                if((i*i) != A){
                    count = count+2;
                }else{
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        input : 6
//        output : 4
    }
}
