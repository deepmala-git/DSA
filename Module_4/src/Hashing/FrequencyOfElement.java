package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

/*
Given an array A that represents the participants of various contests, where each integer corresponds
to a specific learner, and an array B containing the learners for whom you want to check participation
frequency, your task is to find the frequency of each learner from array B in the array A and return a
 list containing all these frequencies
 */
public class FrequencyOfElement {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> res = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.size();i++){
            map.put(A.get(i), map.getOrDefault(A.get(i),0)+1);
        }
        for(int n : B){
            res.add(map.getOrDefault(n,0));
        }
        return res;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 1, 1]
//        B = [1, 2]
//        output : [3,1]
    }
}
