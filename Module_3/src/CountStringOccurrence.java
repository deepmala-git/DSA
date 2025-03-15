
/*
Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
 */
public class CountStringOccurrence {
    public int solve(String A) {
        String s = "bob";
        int count=0;
        for(int i=0;i<A.length()-2;i++){
            if(s.equals(A.substring(i,i+3))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
//        input : "bobob"
//        output : 2
    }
}
