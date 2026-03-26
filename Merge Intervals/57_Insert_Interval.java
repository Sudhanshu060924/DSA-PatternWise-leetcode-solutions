// https://leetcode.com/problems/insert-interval?listId=552y65ke&page=1

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        ArrayList<int[]> list = new ArrayList();
             boolean insert = false;
        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            if (insert == false && start >= newInterval[0]) {
               list.add(new int[]{newInterval[0],newInterval[1]});
                insert = true;
            }
            list.add(intervals[i]);
        }
        if (insert == false) {
            list.add(new int[]{newInterval[0],newInterval[1]});
        }
        
        List<int[]> merge = new ArrayList();

        int start1 = list.get(0)[0];
        int end1 = list.get(0)[1];
            for (int i = 1; i < list.size(); i++) {
            int start2 = list.get(i)[0];
            int end2 = list.get(i)[1];

            if (end1 >= start2) {
                end1 = Math.max(end1, end2);
                continue;
            }
            merge.add(new int[]{start1,end1});
            start1 = start2;
            end1 = end2;
        }
          merge.add(new int[]{start1,end1});

        return merge.toArray(new int[merge.size()][]);

    }
}