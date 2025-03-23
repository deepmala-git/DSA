package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class ContinousSumQuery {
    public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(A,0));
        for(ArrayList<Integer> q : B){
            int L = q.get(0)-1;
            int R = q.get(1)-1;
            int P = q.get(2);
            res.set(L, res.get(L) + P);
            if(R+1 < A){
                res.set(R+1, res.get(R+1) - P);
            }
        }
        int sum = 0;
        for(int i=0;i<A;i++){
            sum = sum + res.get(i);
            res.set(i,sum);
        }

        return res;
    }

    public static void main(String[] args) {
//        input :
//        A = 5
//        B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
//
//        output :
//        10 55 45 25 25

//        First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
//        Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
//        Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]


    }
}
