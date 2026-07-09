// https://leetcode.com/problems/top-k-frequent-words?listId=552y65ke&page=1

class Solution {
    public List<String> topKFrequent(String[] words, int k) {

        HashMap<String,Integer> map = new HashMap<>();
        int n = words.length;

        class Pair{
            int f;
            String s;

            Pair(int f , String s){
                this.f=f;
                this.s=s;
            }

        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(

            (a,b)->{
                if(a.f != b.f){
                    return a.f-b.f;
                }
            return b.s.compareTo(a.s);
            }
        );

        for(int i=0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }

        map.forEach((key,value)->{
            Pair curr = new Pair(value,key);
            if(pq.size()<k){
                pq.add(curr);
            }
            else if (curr.f > pq.peek().f || (curr.f == pq.peek().f && curr.s.compareTo(pq.peek().s)<0)){
                pq.poll();
                pq.add(curr);
            }
        });

            // String[] res = new String[k];
            ArrayList<String> res = new ArrayList<>();
            while(!pq.isEmpty()){
                res.add(pq.poll().s);
            }

        return res.reversed();
        
    }
}