package Sorting;

import java.util.ArrayList;
import java.util.List;

/*
Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
Note: A linear time complexity is expected and you should avoid use of any library function.
 */
public class MergeTwoSortedArray {
    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {
        ArrayList<Integer> res = new  ArrayList<>();
        int len1 = A.size();
        int len2 = B.size();
        int start1 = 0;
        int start2 = 0;
        while(start1 < len1 && start2 < len2){
            if(A.get(start1) < B.get(start2)){
                res.add(A.get(start1));
                start1++;
            }else{
                res.add(B.get(start2));
                start2++;
            }
        }

        while(start1 < len1){
            res.add(A.get(start1));
            start1++;
        }
        while(start2 < len2){
            res.add(B.get(start2));
            start2++;
        }
        return res;
    }

    public static void main(String[] args) {
//        input : A = [4, 7, 9]
//        B = [2, 11, 19]
//        output : [2, 4, 7, 9, 11, 19]
    }
}
