package Sorting;

import java.util.ArrayList;

/*
Given an integer array A, sort the array using Merge Sort.
 */
public class MergeSort {
    static void merge(ArrayList<Integer> arr, int left, int mid, int right){
        ArrayList<Integer> temp = new ArrayList<>();
        int n1 = left;
        int n2 = mid+1;

        while(n1 <= mid && n2 <= right){
            if(arr.get(n1) < arr.get(n2)){
                temp.add(arr.get(n1));
                n1++;
            }else{
                temp.add(arr.get(n2));
                n2++;
            }
        }
        while(n1 <= mid){
            temp.add(arr.get(n1));
            n1++;
        }
        while(n2 <= right){
            temp.add(arr.get(n2));
            n2++;
        }
        // System.out.print(left+"  "+right+" : "+temp+" ");
        for(int i=left;i<=right;i++){
            arr.set(i, temp.get(i-left));
        }

    }
    static void mergeSort(ArrayList<Integer> A, int left, int right){
        if(left >= right) return;
        int mid = (left + right)/2;
        mergeSort(A, left,mid);
        mergeSort(A,mid+1,right);
        merge(A,left,mid,right);
    }

    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        mergeSort(A,0,A.size()-1);
        return A;
    }

    public static void main(String[] args) {
//        input : A = [1, 4, 10, 2, 1, 5]
//        output : [1, 1, 2, 4, 5, 10]
    }
}
