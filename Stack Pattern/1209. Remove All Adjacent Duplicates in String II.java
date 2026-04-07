// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii

class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<Pair> st = new Stack();
        

        for(int i =0;i<n;i++){
            char c = s.charAt(i);
           
            if(st.empty()){
               st.push(new Pair(c,1));
               continue;
            }
             Pair top = st.peek();

            if(top.ch != c){
                st.push(new Pair(c,1));
                continue;
            }

            if(top.num < (k-1)){
                Pair p = st.peek();
                st.pop();
                st.push(new Pair(p.ch,p.num+1));
                continue;
            }
            else{
                st.pop();
            }
        }

        StringBuilder res = new StringBuilder();
        while(!(st.empty())){
            Pair p = st.peek();
            st.pop();
            while(p.num-- >0){
                res.append(p.ch);
            }

        }
        return res.reverse().toString();
        
    }
}

class Pair{
    char ch;
    int  num;

    Pair(char ch , int num){
        this.ch=ch;
        this.num = num;

    }
}