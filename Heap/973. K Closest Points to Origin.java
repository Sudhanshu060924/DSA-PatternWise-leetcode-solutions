// https://leetcode.com/problems/k-closest-points-to-origin

import java.util.PriorityQueue;

class Solution {
    public int[][] kClosest(int[][] points, int k) {
        class Pair{
            int f;
            int s;

            Pair(int f ,int s){
                this.f=f;
                this.s=s;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)->{
                if(a.f != b.f){
                    return b.f-a.f;
                }
                return a.s-b.s;
            }
        );

        int n = points.length;

        for(int i =0;i<n;i++){
            int x = points[i][0];
            int y= points[i][1];

            int d = distance(x,y);

            Pair curr = new Pair(d,i);

            if(pq.size()<k){
                pq.add(curr);
                continue;
            }
            pq.add(curr);
            pq.poll();

            
        }
        int[][] res = new int[k][2];
        int i =0;
        while(!pq.isEmpty()){
            res[i++]=points[pq.poll().s];
        }
        return res;
    
    }

    int distance(int x ,int y){
        return x*x + y*y;
    }

}