package recursion;

public class DecIncNumber {
    static void printNum(int num){
        if(num < 1) return;
        System.out.print(num+" "); //printing decreasing
        printNum(num-1);
        System.out.print(num+" "); //printing increasing
    }

    public static void main(String[] args) {
        printNum(9);
        System.out.println();
    }
}
