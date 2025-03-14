import java.util.List;

public class RainWaterTrap {
    public int trap(final List<Integer> A) {
        int left =0, right = A.size()-1;
        int leftmax = 0, rightmax =0;
        int ans = 0;
        while(left<right){
            if(A.get(left) < A.get(right)){
                if(A.get(left) >= leftmax){
                    leftmax = A.get(left);
                }else{
                    ans = ans + (leftmax - A.get(left));
                }
                left++;
            }else{
                if(A.get(right) > rightmax){
                    rightmax  =A.get(right);
                }else{
                    ans = ans + (rightmax - A.get(right));
                }
                right--;
            }
        }
        return ans;
    }
}
