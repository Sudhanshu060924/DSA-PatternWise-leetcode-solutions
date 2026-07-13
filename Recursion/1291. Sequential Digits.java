// https://leetcode.com/problems/sequential-digits?envType=daily-question&envId=2026-07-13

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> res = new ArrayList<>();
        for(int num =1;num<=9;num++){
            fun(num,num+1,low,high,res);
        }

        res.sort(null);
        return res;


        
    }

    private void fun(int num , int next , int l , int h , List<Integer> res ){
        if(num > h ){
            return;
        }
        if(num>= l){
            res.add(num);

        }
        if(next>9) return;

        fun(num*10+next,next+1,l,h,res);

        return;
    }
}