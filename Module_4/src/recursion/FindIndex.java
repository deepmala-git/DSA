package recursion;

import java.util.ArrayList;

/*
You are given an array A of size N. Write a recursive function that returns the first index
at which an integer B is found in the array.
NOTE: If B is not found anywhere in the array then return -1.
 */
public class FindIndex {
    static int find(ArrayList<Integer> A, int B,int n){
        if(n == A.size()) return -1;
        if(A.get(n) == B){
            return n;
        }
        return find(A,B,n+1);
    }
    public int FirstIndex(ArrayList<Integer> A, int B) {
        return find(A,B,0);
    }

    public static void main(String[] args) {
//        input : A = [-3, 5, 6, 2]
//        B = 6
//        output : 2
    }
}
