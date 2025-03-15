
/*
Given a binary string A. It is allowed to do at most one swap between any 0 and 1.
Find and return the length of the longest consecutive 1’s that can be achieved.
 */
public class LenLongestConsecOnes {
    public int solve(String A) {
        int oneLen = 0;
        char[] charArr = A.toCharArray();
        int n= charArr.length;
        for(int i=0;i<n;i++){
            if(charArr[i] == '1'){
                oneLen++;
            }
        }

        if(oneLen == 0){
            return 0;
        }else if(oneLen == n){
            return n;
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            if(charArr[i] == '0'){
                int left = 0, j = i-1;
                //count left 1's
                while(j>=0 && charArr[j] == '1'){
                    left++;
                    j--;
                }
                int right =0,k = i+1;
                //count right 1's
                while(k<n && charArr[k] == '1'){
                    right++;
                    k++;
                }
                int currentOne = left + right + 1;
                if(currentOne > oneLen){
                    currentOne = currentOne -1;
                }
                ans = Math.max(ans, currentOne);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
//        Input 1:
//        A = "111000"
//        Output 1:
//        3
//
//        Input 2:
//        A = "111011101"
//        Output 2:
//        7
    }
}
