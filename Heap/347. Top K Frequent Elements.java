// https://leetcode.com/problems/top-k-frequent-elements

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;

        class Pair{
            int f;
            int s;

            Pair(int f , int s){
                this.f = f;
                this.s=s;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a,b)->{
                if(a.f != b.f){
                    return a.f-b.f;
                }
                return a.s-b.s;
            }
        );


        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

        }
        map.forEach((key,value)->{
            Pair curr = new Pair(value,key);

            if(pq.size()<k){
                pq.add(curr);
               
            }
            else if(curr.f>pq.peek().f){
                pq.poll();
                pq.add(curr);
            }
        });

        int[] res = new int[k];
    int i =0;
        while(!pq.isEmpty()){
            res[i] = pq.poll().s;
            i++;
                    }

        return res;
    }
}