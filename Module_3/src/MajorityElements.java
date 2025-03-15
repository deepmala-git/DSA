import java.util.List;

/*
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.
 */
public class MajorityElements {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int majorityElement(final List<Integer> A) {
        int ans = -1;
        int freq = 0;

        for(int num : A){
            if(freq == 0){
                ans = num;
                freq++;
            }else if(ans == num){
                freq++;
            }else{
                freq--;
            }
        }

        freq=0;
        for(int num : A){
            if(num == ans) freq++;
        }

        if(freq > (A.size()/2)){
            return ans;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
//        input : [2, 1, 2]
//        output : 2
    }
}
