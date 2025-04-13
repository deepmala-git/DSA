package Sorting;

import java.util.ArrayList;

/*
Given an array of integers A of size N that is a permutation of [0, 1, 2, ..., (N-1)], if we
 split the array into some number of "chunks" (partitions), and individually sort each chunk.
  After concatenating them in order of splitting, the result equals the sorted array.
What is the most number of chunks we could have made?
 */
public class MaxChunksToMakeSorted {
    public int solve(ArrayList<Integer> A) {
        int currSum = 0;
        int ActSum = 0;
        int chunks = 0;
        for(int i=0;i<A.size();i++){
            currSum = currSum + A.get(i);
            ActSum = ActSum + i;
            if(currSum == ActSum){
                chunks++;
            }
        }
        return chunks;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 3, 4, 0]
//        output : 1
    }
}
