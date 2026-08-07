// https://leetcode.com/problems/assign-cookies?listId=552y65ke&page=1

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i =0,j=0;
        int res = 0;
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                    res++;
                    i++;j++;
            }
            else{
                j++;
            }
        }
        return res;
    }
}