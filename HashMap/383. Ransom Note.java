// https://leetcode.com/problems/ransom-note?listId=552y65ke&page=1

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        int n = ransomNote.length();
        int m = magazine.length();

        HashMap<Character, Integer> have = new HashMap();
         HashMap<Character, Integer> need = new HashMap();

         for(int i =0;i<n;i++){
            char c = ransomNote.charAt(i);

            need.put(c,need.getOrDefault(c,0)+1);
         }

          for(int i =0;i<m;i++){
            char c = magazine.charAt(i);

            have.put(c,have.getOrDefault(c,0)+1);
         }

        for(char c : need.keySet()){
            if(have.getOrDefault(c,0)<need.get(c)){
                return false;
            }
        }

         
         return true;
        
    }
}