import java.util.ArrayList;

/*
You are given a function isalpha() consisting of a character array A.
Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.
 */
public class isAlphaNumeric {
    public int solve(ArrayList<Character> A) {
        for(char ch : A){
            if(!(ch >= 'a' && ch <= 'z') && !(ch >= 'A' && ch <= 'Z') && !(ch >= '0' && ch <= '9')){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
//        input :  A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
//        output : 1
    }
}
