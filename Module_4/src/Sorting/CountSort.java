package Sorting;

import java.util.ArrayList;
import java.util.HashMap;

public class CountSort {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.size();i++){
            map.put(A.get(i), map.getOrDefault(A.get(i),0)+1);
            min = Math.min(min, A.get(i));
            max = Math.max(max, A.get(i));
        }
        for(int i=min;i<=max;i++){
            int k=0;
            if(map.containsKey(i)){
                while(k<map.get(i)){
                    res.add(i);
                    k++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        input : A = [4, 2, 1, 3]
//        output : [1, 2, 3, 4]
    }
}
