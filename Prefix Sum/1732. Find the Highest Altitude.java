// https://leetcode.com/problems/find-the-highest-altitude?envType=daily-question&envId=2026-06-19&listId=552y65ke&page=1

class Solution {
    public int largestAltitude(int[] gain) {
        int n = gain.length;
        int[] res = new int[n+1];
        int max = 0;
        res[0] = 0;

        for(int i =0;i<n;i++){
            res[i+1] = res[i] + gain[i];
            max = Math.max(res[i+1],max);
        }
        return max;
        
    }
}