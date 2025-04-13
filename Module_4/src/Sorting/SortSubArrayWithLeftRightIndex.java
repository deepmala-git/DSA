package Sorting;

import java.util.ArrayList;

public class SortSubArrayWithLeftRightIndex {
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

    public ArrayList<Integer> sortSubarray(ArrayList<Integer> A, int B, int C) {
        mergeSort(A,B,C);
        return A;
    }

    public static void main(String[] args) {
//        input : A = [59, 11, 8, 91, 49, 44, 8]
//        B = 4
//        C = 6
//        output : [59, 11, 8, 91, 8, 44, 49]
    }
}
