package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
You are given an array A of N elements. Sort the given array in increasing order of number of
distinct factors of each element, i.e., element having the least number of factors should be the
 first to be displayed and the number having highest number of factors should be the last one.
 If 2 elements have same number of factors, then number with less value should come first.
Note: You cannot use any extra space
 */
public class FactorsSort {
    static int factors(int a){
        int count = 0;
        for(int i =1;i<=Math.sqrt(a);i++){
            if(a%i == 0){
                if(i == a/i){
                    count++;
                }else{
                    count = count+2;
                }
            }
        }
        return count;
    }
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        Collections.sort(A, new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                int factA = factors(a);
                int factB = factors(b);
                if(factA == factB){
                    if(a<b) return -1;
                    else if(b<a) return 1;
                    else return 0;
                }
                if(factA<factB) return -1;
                else return 1;
            }
        });
        return A;
    }

    public static void main(String[] args) {
//        input : A = [6, 8, 9]
//        output : [9, 6, 8]
    }
}
