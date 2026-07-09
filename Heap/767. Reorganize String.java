// https://leetcode.com/problems/reorganize-string?listId=552y65ke&page=1

import java.util.PriorityQueue;

class Solution {
    public String reorganizeString(String s) {

        class Pair {
            int f;
            char ch;

            Pair(int f, char ch) {
                this.f = f;
                this.ch = ch;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.f != b.f) {
                    return b.f - a.f;
                }
                return b.ch - a.ch;
            }
        );

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                pq.add(new Pair(freq[i], (char) (i + 'a')));
            }
        }

        StringBuilder res = new StringBuilder();

        while (!pq.isEmpty()) {

            Pair first = pq.poll();

            if (res.length() == 0 || res.charAt(res.length() - 1) != first.ch) {

                res.append(first.ch);
                first.f--;

                if (first.f > 0) {
                    pq.add(first);
                }

            } else {

                if (pq.isEmpty()) {
                    return "";
                }

                Pair second = pq.poll();

                res.append(second.ch);
                second.f--;

                if (second.f > 0) {
                    pq.add(second);
                }

                pq.add(first);
            }
        }

        return res.toString();
    }
}