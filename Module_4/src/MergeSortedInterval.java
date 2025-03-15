import java.util.ArrayList;

/*
You are given a collection of intervals A in a 2-D array format, where each interval is represented by
 a pair of integers `[start, end]`. The intervals are sorted based on their start values.
Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.
 */
public class MergeSortedInterval {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int currStart = A.get(0).get(0);
        int currEnd = A.get(0).get(1);
        if(A.size() == 1){
            return A;
        }

        for(int i=1;i<A.size();i++){
            ArrayList<Integer> interval = A.get(i);
            if(interval.get(0) <= currEnd){
                currEnd = Math.max(interval.get(1), currEnd);
            }else{
                ArrayList<Integer> row = new ArrayList<>();
                row.add(currStart);
                row.add(currEnd);
                ans.add(row);
                currStart = interval.get(0);
                currEnd = interval.get(1);
            }
            if(i == A.size()-1 && interval.get(0) >= currStart){
                ArrayList<Integer> row = new ArrayList<>();
                row.add(currStart);
                row.add(currEnd);
                ans.add(row);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
//        input : [ [1, 3], [2, 6], [8, 10], [15, 18] ]
//        output : [ [1, 6], [8, 10], [15, 18] ]
    }
}
