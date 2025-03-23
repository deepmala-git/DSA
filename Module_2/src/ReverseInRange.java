import java.util.ArrayList;

/*
Given an array A of N integers and also given two integers B and C.
Reverse the elements of the array A within the given inclusive range [B, C].
 */
public class ReverseInRange {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        if(A.size() == 0 || A.size() == 1) return A;

        while(B<C){
            int temp = A.get(B);
            A.set(B, A.get(C));
            A.set(C ,temp);

            B++;
            C--;
        }

        return A;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 3, 4]
//        B = 2
//        C = 3
//        output : [1, 2, 4, 3]
    }
}
