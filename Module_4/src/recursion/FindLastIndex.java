package recursion;

import java.util.ArrayList;

/*
You are given an array A of size N. Write a recursive function that returns the last index at which
 an integer B is found in the array.
NOTE: If B is not found anywhere in the array then return -1.
 */
public class FindLastIndex {
    static int find(ArrayList<Integer> A, int B,int n){
        if(n < 1) return -1;
        if(A.get(n-1) == B){
            return n-1;
        }
        return find(A,B,n-1);
    }
    public int LastIndex(ArrayList<Integer> A, int B) {
        return find(A,B,A.size());
    }

    public static void main(String[] args) {
//        input : A = [6, 5, 6, 2]
//        B = 6
//        output : 2

    }
}
