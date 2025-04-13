package recursion;

/*
You are given two positive numbers A and B . You need to find the maximum valued integer X such that:

X divides A i.e. A % X = 0
X and B are co-prime i.e. gcd(X, B) = 1
 */
public class LargestCoprimeDivisor {
    static int gcd(int X,int B){
        if(B == 0) return X;
        return gcd(B,X%B);
    }

    public int cpFact(int A, int B) {
        int max = 0;
        for(int i=1;i<Math.sqrt(A);i++){
            int fact1 = 0,fact2=0,temp=0;
            if(A%i == 0){

                fact1 = gcd(i,B);
                if((i != A/i)){
                    fact2 = gcd(A/i,B);
                }
                temp = (fact1 == 1 && fact2 ==1) ? Math.max(i,A/i) : (fact1 == 1) ? i : (fact2 == 1) ? A/i : 0;
                max = Math.max(temp,max);
            }

        }
        return max;
    }

    public static void main(String[] args) {
//        input : A = 30
//        B = 12
//        output : 5
    }
}
