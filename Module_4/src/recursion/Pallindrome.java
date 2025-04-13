package recursion;

/*
Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.
Note: A palindrome is a string that's the same when read forward and backward.
 */
public class Pallindrome {
    static int pallin(String A,int start,int end){
        if(end <= start){
            return 1;
        }
        if(A.charAt(start) != A.charAt(end)){
            return 0;
        }

        return pallin(A,start+1,end-1);
    }
    public int solve(String A) {
        int res = pallin(A,0,A.length()-1);
        return res;
    }

    public static void main(String[] args) {
//        input : A = "naman"
//        output :  1
    }
}
