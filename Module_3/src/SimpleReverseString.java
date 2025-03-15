
/*
Given a string A, you are asked to reverse the string and return the reversed string
 */
public class SimpleReverseString {
    public String solve(String A) {
        StringBuilder str = new StringBuilder();
        for(int i=A.length()-1; i>=0;i--){
            str.append(A.charAt(i));
        }

        return str.toString();
    }

    public static void main(String[] args) {
//        input : A = "academy"
//        output : ymedaca
    }
}
