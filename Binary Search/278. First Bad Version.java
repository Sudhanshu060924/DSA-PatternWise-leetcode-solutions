// https://leetcode.com/problems/first-bad-version?envType=problem-list-v2&envId=binary-search


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {

        int l =1;
        int h = n;
        int ans = -1;
        while(l<=h){
            int g = l+ (h-l)/2;
            if(isBadVersion(g)){
                    ans = g;
                    h = g-1;
            }
            else{
                l = g+1;
            }
        }
        return ans;
        
    }
}