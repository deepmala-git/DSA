package recursion;

import java.util.ArrayList;

/*
In the classic problem of the Towers of Hanoi, you have 3 towers numbered from 1 to 3 (left to right) and A disks numbered from 1 to A (top to bottom) of different sizes which can slide onto any tower.
The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).
You have the following constraints:
Only one disk can be moved at a time.
A disk is slid off the top of one tower onto another tower.
A disk cannot be placed on top of a smaller disk.
You have to find the solution to the Tower of Hanoi problem.
You have to return a 2D array of dimensions M x 3, where M is the minimum number of moves needed to solve the problem.
In each row, there should be 3 integers (disk, start, end), where:
disk - number of the disk being moved
start - number of the tower from which the disk is being moved
end - number of the tower to which the disk is being moved
 */
public class TowerOfHanoi {
    static void solve(int n,int start,int end, int aux, ArrayList<ArrayList<Integer>> ans){
        if(n==0) return;
        solve(n-1,start,aux,end,ans);
        ArrayList<Integer> row = new ArrayList<>();
        row.add(n);
        row.add(start);
        row.add(end);
        ans.add(row);
        solve(n-1,aux,end,start,ans);
    }

    public ArrayList<ArrayList<Integer>> towerOfHanoi(int A) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        solve(A,1,3,2,res);
        return res;
    }

    public static void main(String[] args) {
//        input : A = 3
//        output : [1 1 3 ] [2 1 2 ] [1 3 2 ] [3 1 3 ] [1 2 1 ] [2 2 3 ] [1 1 3 ]
    }
}
