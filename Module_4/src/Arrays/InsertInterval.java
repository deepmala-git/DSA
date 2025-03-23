package Arrays;

import java.util.ArrayList;

/*
You have a set of non-overlapping intervals. You are given a new interval [start, end], insert this
 new interval into the set of intervals (merge if necessary).
You may assume that the intervals were initially sorted according to their start times.
 */
public class InsertInterval {
    public ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> A, ArrayList<Integer> B) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int n = A.size();
        int count = 0;
        while(count < n && (B.get(0) > A.get(count).get(1))){ //add interval which is not overlapping with given interval
            ans.add(A.get(count));
            count++;
        }

        while(count < n && B.get(1) >= A.get(count).get(0)){ //merge overlapping interval
            B.set(0, Math.min(B.get(0), A.get(count).get(0)));
            B.set(1, Math.max(B.get(1), A.get(count).get(1)));
            count++;
        }
        ans.add(B);

        while(count < n){ //add rest of the interval
            ans.add(A.get(count));
            count++;
        }

        return ans;
    }

    public static void main(String[] args) {
//        input : Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
//        output : [ [1, 5], [6, 9] ]
    }
}
