
/*
You are given a character string A having length N, consisting of only lowercase and uppercase latin letters.
You have to toggle case of each character of string A. For e.g 'A' is changed to 'a', 'e' is changed to 'E', etc.
 */
public class ToggleCase {
    public String solve(String A) {
        char[] charArr = A.toCharArray();
        for(int i=0;i<charArr.length;i++){
            if('a' <= charArr[i] && 'z' >= charArr[i]){
                charArr[i] = (char) (charArr[i] - 32);
            }else if('A' <= charArr[i] && 'Z' >= charArr[i]){
                charArr[i] = (char) (charArr[i] + 32);
            }
        }
        String s = String.valueOf(charArr);
        return s;
    }

    public static void main(String[] args) {
//        input : A = "tHiSiSaStRiNg"
//        output : ThIsIsAsTrInG
    }
}
