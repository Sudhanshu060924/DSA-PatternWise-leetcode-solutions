// https://leetcode.com/problems/task-scheduler?listId=552y65ke&page=1

class Solution {
    public int leastInterval(char[] tasks, int n) {

        int[] freq = new int[26];
        int time = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (char ch : tasks) {
            freq[ch - 'A']++;
        }

        for (int f : freq) {
            if (f > 0) {
                pq.add(f);
            }
        }

        List<Integer> temp = new ArrayList<>();

        while (!pq.isEmpty()) {

            for (int i = 0; i <= n; i++) {

                if (!pq.isEmpty()) {
                    int val = pq.poll();
                    val--;
                    temp.add(val);
                }
            }

            for (int val : temp) {
                if (val > 0) {
                    pq.add(val);
                }
            }

            if (pq.isEmpty()) {
                time += temp.size();
            } else {
                time += n + 1;
            }

            temp.clear(); // Important
        }

        return time;
    }
}