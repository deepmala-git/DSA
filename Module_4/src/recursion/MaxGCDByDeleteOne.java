package recursion;

import java.util.ArrayList;

/*
Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor)
 of the remaining array is maximum.
Find the maximum value of GCD.
 */
public class MaxGCDByDeleteOne {
    static int gcd(int A,int B){
        if(B == 0) return A;
        return gcd(B,A%B);
    }

    public int solve(ArrayList<Integer> A) {
        int n = A.size();
        int[] prefix = new int[n+2];
        int[] suffix = new int[n+2];

        prefix[1] = A.get(0);
        for(int i=2;i<=A.size();i++){
            prefix[i] = gcd(prefix[i-1],A.get(i-1));
        }

        suffix[n] = A.get(n-1);
        for(int i=n-1;i>=1;i--){
            suffix[i] = gcd(suffix[i+1],A.get(i-1));
        }

        int max = Math.max(suffix[2],prefix[n-1]);
        for(int i=2;i<n;i++){
            max = Math.max(max, gcd(prefix[i-1],suffix[i+1]));
        }
        return max;
    }

    public static void main(String[] args) {
//        input : A = [12, 15, 18]
//        output : 6
    }
}
