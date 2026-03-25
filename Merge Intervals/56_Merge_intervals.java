// https://leetcode.com/problems/merge-intervals?listId=552y65ke&page=1

import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (x, y) -> x[0] - y[0]); // sorting the intervals based on the start time

        int[][] res = new int[intervals.length][2]; // creating a result array to store the merged intervals
// we will keep track of the start and end time of the current interval and compare it with the next interval
        int start1 = intervals[0][0];
        int end1 = intervals[0][1];

        int id = 0;
        for (int i = 1; i < intervals.length; i++) {
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];

            if (end1 >= start2) { // if the end time of the current interval is greater than or equal to the start time of the next interval, then we can merge the intervals
                // start1 = start1;
                end1 = Math.max(end1, end2);
                continue;
            }
            res[id][0] = start1;
            res[id][1] = end1;
            id++;
            start1 = start2;
            end1 = end2;

        } // adding the last interval to the result array
        res[id][0] = start1;
        res[id][1] = end1;

        return Arrays.copyOfRange(res, 0, id + 1); // returning only the merged intervals from the result array

    }
}