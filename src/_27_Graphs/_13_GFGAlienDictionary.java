package _27_Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _13_GFGAlienDictionary {
    class Solution {
        public String findOrder(String[] words) {

            // 1. Track characters present in words
            boolean[] present = new boolean[26];

            for (String word : words) {
                for (char ch : word.toCharArray()) {
                    present[ch - 'a'] = true;
                }
            }

            // 2. Create adjacency list
            List<List<Integer>> adj = new ArrayList<>();

            for (int i = 0; i < 26; i++) {
                adj.add(new ArrayList<>());
            }

            // 3. Build graph
            for (int i = 0; i < words.length - 1; i++) {
                String s1 = words[i];
                String s2 = words[i + 1];

                int len = Math.min(s1.length(), s2.length());
                int j = 0;

                while (j < len && s1.charAt(j) == s2.charAt(j)) {
                    j++;
                }

                // Invalid prefix case
                if (j == len && s1.length() > s2.length()) {
                    return "";
                }

                if (j < len) {
                    int u = s1.charAt(j) - 'a';
                    int v = s2.charAt(j) - 'a';

                    adj.get(u).add(v);
                }
            }

            // 4. Calculate indegree
            int[] indegree = new int[26];

            for (int i = 0; i < 26; i++) {
                for (int neighbour : adj.get(i)) {
                    indegree[neighbour]++;
                }
            }

            // 5. Add present zero-indegree characters to queue
            Queue<Integer> q = new LinkedList<>();

            for (int i = 0; i < 26; i++) {
                if (present[i] && indegree[i] == 0) {
                    q.add(i);
                }
            }

            // 6. Kahn's Algorithm
            StringBuilder ans = new StringBuilder();
            int totalCharacters = 0;

            for (boolean exists : present) {
                if (exists) {
                    totalCharacters++;
                }
            }

            while (!q.isEmpty()) {
                int node = q.poll();

                ans.append((char) (node + 'a'));

                for (int neighbour : adj.get(node)) {
                    indegree[neighbour]--;

                    if (indegree[neighbour] == 0) {
                        q.add(neighbour);
                    }
                }
            }

            // 7. Detect cycle
            if (ans.length() != totalCharacters) {
                return "";
            }

            return ans.toString();
        }
    }

}
