package Arrays;

import java.util.ArrayList;

/*
Given an unsorted integer array, A of size N. Find the first missing positive integer.
Note: Your algorithm should run in O(n) time and use constant space.
 */
public class FirstMissingNaturalNum {
    public int firstMissingPositive(ArrayList<Integer> A) {
        int m = A.size()+2;
        int ans = 0;
        //replce number which is 0 or -ve to some greater postive number greater then N
        for(int i=0;i<A.size();i++){
            if(A.get(i) <= 0){
                A.set(i, m);
            }
        }
        int i=0;
        while(i<A.size()){
            int index = A.get(i) -1; //index at which the number should be
            //if number not at correct index then replace
            if(A.get(i) >= 1 && A.get(i) <= A.size() && A.get(index) != A.get(i)){
                int temp = A.get(i);
                A.set(i, A.get(index));
                A.set(index, temp);
            }else{
                i++;
            }
        }

        //return first  number which is not at correct index
        for(int j=0;j<A.size();j++){
            if(A.get(j) != j+1){
                return j+1;
            }
        }

        return A.size()+1;

    }

    public static void main(String[] args) {
//        input : [3, 4, -1, 1]
//        output : 2
    }
}
