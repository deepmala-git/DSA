
/*
Given a string A of size N, find and return the longest palindromic substring in A.
Substring of string A is A[i...j] where 0 <= i <= j < len(A)
Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
Incase of conflict, return the substring which occurs first ( with the least starting index).
 */
public class LongestPallindromString {
    private static int expand(String A,int left,int right){
        while(left >=0 && right < A.length() && A.charAt(left) == A.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }

    public String longestPalindrome(String A) {
        int start=0,end=0;
        int max = 0;
        for(int i=0;i<A.length();i++){
            int odd = expand(A,i,i);
            int even = expand(A,i,i+1);
            int len = Math.max(odd,even);
            if(len > (end-start) && len > max){
                max = len;
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        return A.substring(start,end+1);
    }

    public static void main(String[] args) {
//        input : A = "aaaabaaa"
//        output : "aaabaaa"
    }
}
