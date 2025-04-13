package Sorting;

import java.util.ArrayList;
import java.util.Collections;

/*
Given an array of integers A, sort the array into a wave-like array and return it.
In other words, arrange the elements into a sequence such that

a1 >= a2 <= a3 >= a4 <= a5.....
NOTE: If multiple answers are possible, return the lexicographically smallest one.
 */
public class WaveArray {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        for(int i=0;i<A.size()-1;i=i+2){
            int n = i+1;
            // System.out.print(i+"  "+n+" : ");
            int temp = A.get(i);
            A.set(i, A.get(n));
            A.set(n, temp);
        }
        return A;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 3, 4]
//        output : [2, 1, 4, 3]
    }
}
