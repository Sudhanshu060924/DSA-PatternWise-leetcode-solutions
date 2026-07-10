// https://leetcode.com/problems/ipo?listId=552y65ke&page=1

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        int n = profits.length;
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++){
            arr[i][0]=capital[i];
            arr[i][1]=profits[i];
        }
      Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));


        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        int id =0;
        while(k>0){
            while(id<n){
                if(arr[id][0]>w){
                    break;
                }
                pq.add(arr[id][1]);
                id++;
            }
            if(pq.isEmpty()){
                return w;
            }
            w=w+pq.poll();
            k--;
        }
        return w;
    }
}