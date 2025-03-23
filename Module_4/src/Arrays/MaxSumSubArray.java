package Arrays;

import java.util.List;

public class MaxSumSubArray {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int max = A.get(0);
        int sum = 0;
        //using kadane's algorithm which is specifically design for finding subarray sum
        for(int i=0;i<A.size();i++){
            sum = sum + A.get(i);
            max = Math.max(sum,max);
            if(sum < 0) sum = 0;
        }
        return max;
    }

    public static void main(String args[]){
//        input :  A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
//        ouput : 6
//        The subarray [4,-1,2,1] has the maximum possible sum of 6.
    }
}