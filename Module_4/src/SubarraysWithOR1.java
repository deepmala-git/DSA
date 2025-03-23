import java.util.ArrayList;

/*
You are given a binary array A of length N where each element is either 0 or 1.
Your task is to count the number of subarrays where the bitwise OR of all the elements
 in the subarray is 1.
 */
public class SubarraysWithOR1 {
    public int subarraysWithOR1(ArrayList<Integer> A) {
        int n = A.size();
        int toatl = n*(n+1)/2;
        int zeros = 0;
        int zeroSub = 0;
        for(int num : A){
            if(num == 0){
                zeros++; //count consecutive 0's
            }else{
                zeroSub = zeroSub + (zeros*(zeros+1))/2; //number of sumarrays with consecutive 0's
                zeros = 0;
            }
        }
        zeroSub = zeroSub + (zeros*(zeros+1))/2;

        return toatl - zeroSub; //from total sub arrays minus the sub arrays with only 0's.
    }

    public static void main(String[] args) {
//        input : A = [0, 0, 1, 1, 0]
//        output : 11
//        The only subarrays with OR = 1 are
//        [0, 0, 1], [0, 0, 1, 1], [1], [1], [1, 1], [1, 0], [1, 1, 0], [0, 0, 1, 1, 0], [0, 1], [0, 1, 1], [0, 1, 1, 0]
    }
}
