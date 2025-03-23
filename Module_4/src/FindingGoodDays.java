
/*
Alex has a cat named Boomer. He decides to put his cat to the test for eternity.
He starts on day 1 with one stash of food unit, every next day, the stash doubles.
If Boomer is well behaved during a particular day, only then she receives food worth equal
to the stash produced on that day.
Boomer receives a net worth of A units of food. What is the number of days she received the stash?
 */
public class FindingGoodDays {
    public int solve(int A) {
        int count  =0;
        int num = A;
        while(num > 0){
            if(num%2 == 1){
                count++;
            }
            num = num/2;
        }
        return count;
    }

    public static void main(String[] args) {
//        input : 5
//        output : 2
//        To eat a total of 5 units of food, Boomer behaved normally on Day 1 and on the Day 3.
    }
}
