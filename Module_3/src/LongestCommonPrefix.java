import java.util.ArrayList;

/*
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(ArrayList<String> A) {
        String pref = A.get(0);
        int prefLen = pref.length();
        for(int i=1;i<A.size();i++){
            String s = A.get(i);
            while(prefLen > s.length() || !pref.equals(s.substring(0,prefLen))){
                prefLen--;
                if(prefLen == 0){
                    return "";
                }
                pref = pref.substring(0,prefLen);
            }

        }
        return pref;
    }

    public static void main(String[] args) {
//        input : A = ["abcdefgh", "aefghijk", "abcefgh"]
//        output : "a"
    }
}
