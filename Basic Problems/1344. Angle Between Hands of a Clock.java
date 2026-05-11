// https://leetcode.com/problems/angle-between-hands-of-a-clock

class Solution {
    public double angleClock(int hour, int minutes) {

   
        double mint = minutes*6;

       double hr = (hour%12)*30 + minutes*0.5 ; 

        double diff = Math.abs(hr-mint);
    
        return Math.min(diff,360-diff);

        
    }
}