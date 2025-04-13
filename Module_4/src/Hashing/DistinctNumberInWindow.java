package Hashing;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.util.ArrayList;
import java.util.HashMap;

/*
You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct
 numbers in all windows of size B.
Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct
 elements in sequence Ai, Ai+1 ,..., Ai+B-1.
NOTE: if B > N, return an empty array.
 */
public class DistinctNumberInWindow {
    public ArrayList<Integer> dNums(ArrayList<Integer> A, int B) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<B;i++){
            map.put(A.get(i), map.getOrDefault(A.get(i),0)+1);
        }
        res.add(map.size());

        for(int i=B;i<A.size();i++){
            int out = A.get(i-B);
            if(map.containsKey(out)){
                if(map.get(out) == 1){
                    map.remove(out);
                }else{
                    map.put(out, map.getOrDefault(out,0)-1);
                }
                int in = A.get(i);
                map.put(in, map.getOrDefault(in,0)+1);

                res.add(map.size());
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        input :  A = [1, 2, 1, 3, 4, 3]
//        B = 3
//        output : [2, 3, 3, 2]
    }
}
