package recursion;

import java.util.ArrayList;

/*
Given an array of integers A with N elements and a target integer B, the task is to find all the
indices at which B occurs in the array.
Note: The problem encourages recursive logic for learning purposes. Although the online judge
doesn't enforce recursion, it's recommended to use recursive solutions to align with the question's spirit.
 */
public class AllIndicesOfArray {
    static ArrayList<Integer> findMacth(ArrayList<Integer> A, int B, int n, ArrayList<Integer> list){
        if(n < 0){
            return list;
        }
        if(A.get(n) == B){
            list.add(n);
        }
        return findMacth(A,B,n-1,list);
    }

    public ArrayList<Integer> allIndices(ArrayList<Integer> A, int B) {
        ArrayList<Integer> list = new ArrayList<>();
        findMacth(A,B,A.size()-1,list);
        return list;
    }

    public static void main(String[] args) {
//        input : A = [8, 9, 5, 6, 5, 5]
//        B = 5
//        output :  [2, 4, 5]
    }
}
