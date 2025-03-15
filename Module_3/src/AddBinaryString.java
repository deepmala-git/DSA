
/*
Given two binary strings A and B. Return their sum (also a binary string).
 */
public class AddBinaryString {
    public String addBinary(String A, String B) {
        StringBuilder res = new StringBuilder();
        int lenA = A.length()-1;
        int lenB = B.length()-1;
        int carry = 0;

        while(lenA >= 0 || lenB>=0 || carry != 0){
            int sum = carry;
            if(lenA >= 0) sum = sum + A.charAt(lenA--) - '0';
            if(lenB >= 0) sum = sum + B.charAt(lenB--) - '0';
            res.append(sum%2);
            carry = sum/2;
        }

        return res.reverse().toString();

    }

    public static void main(String[] args) {
//        input : A = "100"
//                B = "11"
//        output : "111"
    }
}
