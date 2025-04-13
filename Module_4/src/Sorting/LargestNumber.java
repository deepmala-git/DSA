package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Given an array A of non-negative integers, arrange them such that they form the largest number.
Note: The result may be very large, so you need to return a string instead of an integer.
 */
public class LargestNumber {
    public String largestNumber(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                String ab = String.valueOf(a) + String.valueOf(b);
                String ba = String.valueOf(b) + String.valueOf(a);
                return ab.compareTo(ba) > 0 ? -1 : 1;
            }
        });
        StringBuilder str = new StringBuilder();
        for(int i : A){
            str.append(String.valueOf(i));
        }
        if(str.charAt(0) == '0'){
            return "0";
        }
        return str.toString();
    }

    public static void main(String[] args) {
//        input : A = [3, 30, 34, 5, 9]
//        output :  A = [2, 3, 9, 0]
    }
}
