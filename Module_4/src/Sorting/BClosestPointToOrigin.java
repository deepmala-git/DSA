package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
You are developing a feature for Zomato that helps users find the nearest restaurants to their current location.
 It uses GPS to determine the user's location and has access to a database of restaurants, each with its own
  set of coordinates in a two-dimensional space representing their geographical location on a map.
  The goal is to identify the "B" closest restaurants to the user, providing a quick and convenient way
  to choose where to eat.
Given a list of restaurant locations, denoted by A (each represented by its x and y coordinates on a map),
 and an integer B representing the number of closest restaurants to the user. The user's current location is
  assumed to be at the origin (0, 0).

Here, the distance between two points on a plane is the Euclidean distance.

You may return the answer in any order. The answer is guaranteed to be unique (except for the order that
it is in.)

NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2).
 */
public class BClosestPointToOrigin {
    private static int distance(ArrayList<Integer> points){
        return points.get(0)*points.get(0) + points.get(1)*points.get(1);
    }
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {
        Collections.sort(A, new Comparator<ArrayList<Integer>>(){
            public int compare(ArrayList<Integer> a,ArrayList<Integer> b){
                return Integer.compare(distance(a),distance(b));
            }
        });
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i=0;i<B;i++){
            res.add(A.get(i));
        }
        return res;
    }

    public static void main(String[] args) {
//        input : A = [
//       [1, 3],
//       [-2, 2]
//     ]
//        B = 1
//        output : [ [-2, 2] ]
    }
}
