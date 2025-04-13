package Sorting;

import java.util.ArrayList;

/*
Given an array with N objects colored red, white, or blue, sort them so that objects of the same color
 are adjacent, with the colors in the order red, white, and blue.
We will represent the colors as,
red -> 0
white -> 1
blue -> 2
Note: Using the library sort function is not allowed.
 */
public class SortByColor {
    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int[] freq = new int[3];
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
//        input : A = [0, 1, 2, 0, 1, 2]
//        output : [0, 0, 1, 1, 2, 2]
    }
}
