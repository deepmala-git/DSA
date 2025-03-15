import java.util.ArrayList;

/*
You are given an array A of N elements. Find the number of triplets i,j and k
such that i<j<k and A[i]<A[j]<A[k]
 */
public class CountIncreTriplets {
    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int count = 0;

        for(int j=1; j<n-1;j++){
            int left = 0;
            for(int i=0;i<j;i++){
                if(A.get(i) < A.get(j)){
                    left++;
                }
            }
            int right = 0;
            for(int k=j+1;k<n;k++){
                if(A.get(k) > A.get(j)){
                    right++;
                }
            }
            count = count + (left*right);
        }

        return count;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 4, 3]
//        output :  2
//        The triplets that satisfy the conditions are [1, 2, 3] and [1, 2, 4].
    }
}
