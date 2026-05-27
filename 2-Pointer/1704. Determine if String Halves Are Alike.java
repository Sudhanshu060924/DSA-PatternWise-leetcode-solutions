// https://leetcode.com/problems/determine-if-string-halves-are-alike?listId=552y65ke&page=1

class Solution {
    public boolean halvesAreAlike(String s) {
        int leftcount =0;
        int rightcount = 0;
        int l=0;
        int r = s.length()/2;

        while(r<s.length()){
          char  ch = s.charAt(l);
          char  ch2 = s.charAt(r);

            ch = Character.toLowerCase(ch);
            ch2 = Character.toLowerCase(ch2);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                leftcount++;
               
            }
            if(ch2 == 'a' || ch2 == 'e' || ch2 == 'i' || ch2 == 'o' || ch2 == 'u'){
                rightcount++;
             
            }
             l++;
   r++;

        }

        if(leftcount == rightcount) return true;

        return false;
        
    }
}