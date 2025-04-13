package Sorting;

import java.util.ArrayList;

/*
Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A.
 Find the total number of inversions of A modulo (109 + 7).
 */
public class InversionCountInArray {
    private static int merge(ArrayList<Integer> arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        //Modification 1: cnt variable to count the pairs:
        int cnt = 0;

        //storing elements in the temporary array in a sorted manner//

        while (left <= mid && right <= high) {
            if (arr.get(left) <= arr.get(right)) {
                temp.add(arr.get(left));
                left++;
            } else {
                temp.add(arr.get(right));
                cnt += (mid - left + 1); //Modification 2
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr.get(left));
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr.get(right));
            right++;
        }

        // transfering all elements from temporary to arr //
        for (int i = low; i <= high; i++) {
            arr.set(i ,temp.get(i - low));
        }
        return cnt; // Modification 3
    }

    public static int mergeSort(ArrayList<Integer> arr, int low, int high) {
        int cnt = 0;
        if (low >= high) return cnt;
        int mid = (low + high)/ 2 ;
        cnt += mergeSort(arr, low, mid)%1000000007;  // left half
        cnt += mergeSort(arr, mid + 1, high)%1000000007; // right half
        cnt += merge(arr, low, mid, high)%1000000007;  // merging sorted halves
        return cnt;
    }

    public int solve(ArrayList<Integer> A) {
        int n =  mergeSort(A,0,A.size()-1);
        return n%1000000007;
    }

    public static void main(String[] args) {
//        input : A = [3, 4, 1, 2]
//        output : 4
    }
}
