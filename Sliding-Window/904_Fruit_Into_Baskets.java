//904. Fruit Into Baskets https://leetcode.com/problems/fruit-into-baskets?envType=problem-list-v2&envId=sliding-window

import java.util.HashMap;

class Solution {
    public int totalFruit(int[] fruits) {
        int l = 0;
        int res = -1;
        HashMap<Integer,Integer> map = new HashMap<>();//map to store the count of each fruit in the current window

        for( int h =0;h<fruits.length;h++){ //expand the window to the right by adding the new fruit to the map
            map.put(fruits[h],map.getOrDefault(fruits[h],0)+1); //increment the count of the current fruit in the map
            while(map.size()>2){ //if there are more than 2 types of fruits in the current window, shrink the window from the left until there are only 2 types of fruits
                map.put(fruits[l],map.get(fruits[l])-1);
                if(map.get(fruits[l])==0){ //if the count of the fruit at the left pointer becomes 0, remove it from the map
                    map.remove(fruits[l]);
                }
                    l++;

            }
            int len = h-l+1;
            res = Math.max(len,res); //update the result with the maximum length of the window that contains at most 2 types of fruits

        }
        return res;
        
    }
}