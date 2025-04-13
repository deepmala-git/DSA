package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
NOTE:
Each element in the result should appear as many times as it appears in both arrays.
The result can be in any order.
 */
public class CommonElements {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        // Just write your code below to complete the function. Required input is available to you as the function arguments.
        // Do not print the result or any output. Just return the result via this function.
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n : A){
            map.put(n, map.getOrDefault(n,0)+1);
        }

        for(int i=0;i<B.size();i++){
            int num = B.get(i);
            if(map.containsKey(num) && map.get(num) > 0){
                res.add(num);
                map.put(num, map.get(num)-1);
            }
        }

        return res;
    }

    public static void main(String[] args) {
//        input :  A = [1, 2, 2, 1]
//        B = [2, 3, 1, 2]
//        output : [1, 2, 2]
    }
}
