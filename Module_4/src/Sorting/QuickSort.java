package Sorting;

import java.util.ArrayList;
import java.util.List;

/*
Given an integer array A, sort the array using Quick Sort.
 */
public class QuickSort {
    static int partition(List<Integer> arr, int low, int high) {
        int pivot = arr.get(low);
        int i = low;
        int j = high;

        while (i < j) {
            while (arr.get(i) <= pivot && i <= high - 1) {
                i++;
            }

            while (arr.get(j) > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        int temp = arr.get(low);
        arr.set(low, arr.get(j));
        arr.set(j, temp);
        return j;
    }

    static void qs(List<Integer> arr, int low, int high) {
        if (low < high) {
            int pIndex = partition(arr, low, high);
            qs(arr, low, pIndex - 1);
            qs(arr, pIndex + 1, high);
        }
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        qs(A,0,A.size()-1);
        return A;
    }

    public static void main(String[] args) {
//        input : A = [1, 4, 10, 2, 1, 5]
//        output : [1, 1, 2, 4, 5, 10]
    }
}
