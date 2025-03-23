import java.util.ArrayList;

/*
Given an array, arr[] of size N, the task is to find the count of array indices such that
removing an element from these indices makes the sum of even-indexed and odd-indexed array
elements equal.
 */
public class EvenOddSumSame {
    public int solve(ArrayList<Integer> A) {
        int ans = 0;
        int n = A.size();
        if(A.isEmpty()){
            return 0;
        }
        int totalEven = 0;
        int totalOdd = 0;

        for(int i=1;i<n;i++){
            if(i%2 == 0) {
                totalEven = totalEven+A.get(i);
            }else{
                totalOdd = totalOdd+A.get(i);
            }
        }

        int even = 0, odd = 0;
        for(int i=0;i<n;i++){
            int currentEvenSum = 0;
            int currentOddSum = 0;
            if(i%2 == 0) {
                currentEvenSum = even + (totalOdd - odd);
                currentOddSum = odd + (totalEven - even - A.get(i));
            }else{
                currentEvenSum = even + (totalOdd -odd - A.get(i));
                currentOddSum = odd + (totalEven - even);
            }
            if(currentEvenSum == currentOddSum) ans++;
            if(i%2 == 0) {
                even = even + A.get(i);
            }else{
                odd = odd + A.get(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        input : A = [2, 1, 6, 4]
//        output : 1
//        Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
//                Therefore, the required output is 1.
    }
}
