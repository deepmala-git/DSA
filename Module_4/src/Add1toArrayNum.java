import java.util.ArrayList;

public class Add1toArrayNum {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        ArrayList<Integer> res = new ArrayList<>();
        int carry = 1;
        int start = 0;
        while(start < A.size() && A.get(start) == 0){
            start++;
        }
        for(int i=A.size()-1;i>=start;i--){
            int sum = A.get(i) + carry;
            A.set(i, sum%10);
            carry = sum/10;
        }
        if(carry == 1){
            res.add(1);
        }
        for(int i=start;i<A.size();i++){
            res.add(A.get(i));
        }

        return res;
    }

    public static void main(String[] args) {
//        input : [1, 2, 3]
//        output : [1, 2, 4]


    }
}
