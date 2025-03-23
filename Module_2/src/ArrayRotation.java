import java.util.ArrayList;

/*
Given an integer array A of size N and an integer B,
you have to return the same array after rotating it B times towards the right.
 */
public class ArrayRotation {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        if(A.size() == 0 || A.size() == 1) return A;
        B = B % A.size();
        int i=0,j=A.size()-1;
        while(i<j){
            int temp = A.get(i);
            A.set(i, A.get(j));
            A.set(j ,temp);

            i++;
            j--;
        }

        int n=0,m=B-1;
        while(n<m){
            int temp = A.get(n);
            A.set(n, A.get(m));
            A.set(m, temp);

            n++;
            m--;
        }

        int x=B,y=A.size()-1;
        while(x<y){
            int temp = A.get(x);
            A.set(x, A.get(y));
            A.set(y, temp);

            x++;
            y--;
        }
        return A;
    }

    public static void main(String[] args) {
//        input : A = [1, 2, 3, 4]
//        B = 2
//        output : [3, 4, 1, 2]
//        Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
    }
}
