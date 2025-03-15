
/*
You are given a string A of size N.
Return the string A after reversing the string word by word.
NOTE:
A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.
 */
public class ReverseSentence {
    public String solve(String A) {
        String[] words = A.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            res.append(words[i]+" ");
        }
        return res.toString().trim();
    }

    public static void main(String[] args) {
//        input : A = "the sky is blue"
//        output : "blue is sky the"
    }
}
