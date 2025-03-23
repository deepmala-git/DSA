import java.util.List;

/*
Given an array of integers A, every element appears twice except for one. Find that integer
that occurs once.
NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without
using extra memory?
 */
public class SingleNumber {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int res = 0;
        for(int i=0;i<A.size();i++){
            res = res^A.get(i);
        }
        return res;
    }
    public static void main(String[] args) {
//        input : [1, 2, 2, 3, 1]
//        output : 3
    }
}
