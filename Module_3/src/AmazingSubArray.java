
/*
You are given a string S, and you have to find all the amazing substrings of S.
An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).
 */
public class AmazingSubArray {
    public int solve(String A) {
        char[] charArr = A.toCharArray();
        int n = charArr.length;
        int count = 0;
        String vowels = "aeiouAEIOU";
        for(int i=0;i<n;i++){
            if(vowels.indexOf(charArr[i]) != -1){
                count = (count + (n-i))%10003;
            }
        }

        return count;
    }

    public static void main(String[] args) {
//        Input : ABEC
//        Output : 6
//
//        Explanation
//        Amazing substrings of given string are :
//        1. A
//        2. AB
//        3. ABE
//        4. ABEC
//        5. E
//        6. EC
//        here number of substrings are 6 and 6 % 10003 = 6.
    }
}
