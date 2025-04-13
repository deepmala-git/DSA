package Sorting;

import java.util.ArrayList;

/*
An integer is given to you in the form of an array, with each element being a separate digit.
Find the smallest number (leading zeroes are allowed) that can be formed by rearranging the digits
 of the given number in an array. Return the smallest number in the form an array.
Note - Do not use any sorting algorithm or library's sort method.
 */
public class SmallestNumber {
    public ArrayList<Integer> smallestNumber(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] freq = new int[10];
        for(int i=0;i<A.size();i++){
            freq[A.get(i)]++;
        }
        for(int i=0;i<freq.length;i++){
            for(int j=0;j<freq[i];j++){
                res.add(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        input : A = [6, 3, 4, 2, 7, 2, 1]
//        output : [1, 2, 2, 3, 4, 6, 7]
    }
}
