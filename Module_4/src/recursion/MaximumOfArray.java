package recursion;

import java.util.ArrayList;

/*
Given an array A of size N, write a recursive function that returns the maximum element of the array.
 */
public class MaximumOfArray {
    static int find(ArrayList<Integer> A, int n){
        if(n == 1) return A.get(0);
        return Math.max(A.get(n-1), find(A,n-1));

    }
    public int getMax(ArrayList<Integer> A) {
        return find(A,A.size());
    }

    public static void main(String[] args) {
//        input : A = [12, 10, 3, 4, 5]
//        output : 12
    }
}
