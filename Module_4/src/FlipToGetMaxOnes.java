import java.util.ArrayList;

public class FlipToGetMaxOnes {
    public ArrayList<Integer> flip(String A) {
        ArrayList<Integer> res = new ArrayList<>();
        int maxOne = 0;
        int L=-2,R=-2,start=0;
        int currentOne = 0;
        for(int i=0;i<A.length();i++){
            int val = (A.charAt(i) == '0') ? 1 : -1;
            currentOne = currentOne + val;
            if(currentOne > maxOne){
                maxOne = currentOne;
                L = start;
                R = i;
            }
            if(currentOne < 0){
                currentOne = 0;
                start = i+1;
            }
        }
        if(L == -2){
            return new ArrayList<>();
        }else{
            res.add(L+1);
            res.add(R+1);
            return res;
        }
    }

    public static void main(String[] args) {
//        input : A = "010"
//        output : [1,1]
    }
}
