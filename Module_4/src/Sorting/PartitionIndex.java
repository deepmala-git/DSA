package Sorting;

import java.util.ArrayList;

/*
Given an integer array A of length N, considering the last element as pivot p,
rearrange the elements such that for all i:
if A[i] < p then it should be present on left side of the partition
if A[i] > p then it should be present on right side of the partition
Rearrange the given array as well as return the partition index.
Note: All elements are distinct
 */
public class PartitionIndex {
    public int partition(ArrayList<Integer> arr) {
        int n = arr.size()-1;
        int pivot = arr.get(n);
        int temp = arr.get(n);
        arr.set(n,arr.get(0));
        arr.set(0, temp);
        int i = 1;
        int j = n;

        while(i<j){
            while(arr.get(i) <= pivot && i < n){
                i++;
            }
            while(arr.get(j) > pivot && j > 0){
                j--;
            }
            if(i<j){
                int num = arr.get(i);
                arr.set(i,arr.get(j));
                arr.set(j, num);
            }
        }

        int t = arr.get(0);
        arr.set(0,arr.get(j));
        arr.set(j, t);
        return j;
    }

    public static void main(String[] args) {
//        input : A = [6, 2, 0, 4, 5]
//        output :  3
    }
}
