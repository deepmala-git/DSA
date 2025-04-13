package Sorting;

import java.util.ArrayList;
/*
Given an array A of 0s and 1s of length N. Sort this array.

Note - Do not use any sorting algorithm or library's sort method.


 */
public class Sort01 {
    public ArrayList<Integer> sort01(ArrayList<Integer> A) {
        int countZero = 0;
        int n = A.size();
        for(int i : A){
            if(i == 0){
                countZero = countZero +1;
            }
        }
        // System.out.print(countZero+" : ");
        for(int i =0;i<countZero;i++){
            A.set(i,0);
        }
        for(int i=countZero;i<n;i++){
            A.set(i,1);
        }
        return A;
    }

    public static void main(String[] args) {
//        input : A = [0,0,1,0,1,1,0]
//        output : [0,0,0,0,1,1,1]
    }
}
