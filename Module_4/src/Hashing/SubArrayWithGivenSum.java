package Hashing;

import java.util.ArrayList;

/*
Given an array of positive integers A and an integer B, find and return first continuous subarray
 which adds to B.
If the answer does not exist return an array with a single integer "-1".
First sub-array means the sub-array for which starting index in minimum.
 */
public class SubArrayWithGivenSum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        int sum = 0;
        int start = 0,end = -1;
        int n = A.size();
        while(start<n){
            while((end+1 < n) && (sum + A.get(end+1) <= B)){
                end = end+1;
                sum = sum + A.get(end);
            }
            if(sum == B){
                // System.out.print(start+" "+end+" : ");
                for(int i=start;i<=end;i++){
                    res.add(A.get(i));
                }
                return res;
            }
            sum = sum - A.get(start);
            start++;

        }
        res.add(-1);
        return res;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 3, 4, 5]
//        B = 5
//        output : [2, 3]
    }
}
