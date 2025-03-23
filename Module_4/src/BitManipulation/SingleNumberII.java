package BitManipulation;

import java.util.List;


/*
Given an array of integers, every element appears thrice except for one, which occurs once.
Find that element that does not appear thrice.
NOTE: Your algorithm should have a linear runtime complexity.
Could you implement it without using extra memory?
 */
public class SingleNumberII {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int singleNumber(final List<Integer> A) {
        int ans = 0;
        for(int i=0;i<31;i++){
            int count = 0;
            for(int j=0;j<A.size();j++){
                if((A.get(j)&(1<<i)) > 0 ){
                    count++;
                }
            }
            if(count%3 == 1){
                ans = ans | (1<<i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
//        output : 4
    }
}
