package BitManipulation;

import java.util.ArrayList;

/*
Given an array of positive integers A, two integers appear only once, and all the other
integers appear twice.
Find the two integers that appear only once.
Note: Return the two numbers in ascending order.
 */
public class SingleNumberIII {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int xorAll = 0;
        int ans1=0,ans2=0;
        for(int i=0;i<A.size();i++){
            xorAll = xorAll^A.get(i);
        }

        int pos = -1;
        for(int i=0;i<32;i++){
            if((xorAll & (1<<i)) > 0){
                pos = i;
                break;
            }
        }

        for(int i=0;i<A.size();i++){
            if((A.get(i) & (1<<pos)) > 0){
                ans1 = ans1^A.get(i);
            }else{
                ans2 = ans2^A.get(i);
            }
        }
        if(ans1 > ans2){
            res.add(ans2);
            res.add(ans1);
        } else{
            res.add(ans1);
            res.add(ans2);
        }

        return res;

    }
    public static void main(String[] args) {
//        input : A = [1, 2, 3, 1, 2, 4]
//        output : [3,4]
    }
}
