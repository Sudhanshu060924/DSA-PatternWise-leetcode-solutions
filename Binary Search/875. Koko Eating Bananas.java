// https://leetcode.com/problems/koko-eating-bananas

class Solution {

    long hour(int[] a , int guess){ // to find eating hour for guessed speed
        long h =0;
        for(int i =0;i<a.length;i++){
            h = h+ a[i]/guess;
            if(a[i]%guess != 0) h++;
        }
        return h;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = Integer.MIN_VALUE;
        int n = piles.length;
        int res =-1;
        for(int i =0;i<n;i++){
            high = Math.max(high,piles[i]);
        }
        while(low<=high){
            int guess = low +(high-low)/2;
            long hour = hour(piles,guess);
            if(hour>h){
                low =guess+1;
            }
            else{
                res = guess;
                high=guess-1;
            }


        }
        return res;
        
    }
}