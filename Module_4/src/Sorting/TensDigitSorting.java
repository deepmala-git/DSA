package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Given an array A of N integers. Sort the array in increasing order of the value at the tens place
 digit of every number.
If a number has no tens digit, we can assume value to be 0.
If 2 numbers have same tens digit, in that case number with max value will come first
Solution should be based on comparator.
 */
public class TensDigitSorting {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                int tensA = Math.abs(a/10)%10;
                int tensB = Math.abs(b/10)%10;
                if(tensA == tensB){
                    return Integer.compare(b,a);
                }else{
                    return Integer.compare(tensA,tensB);
                }
            }
        });
        return A;
    }

    public static void main(String[] args) {
//        input : A = [15, 11, 7, 19]
//        output : [7, 19, 15, 11]
    }
}
