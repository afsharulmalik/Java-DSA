package _22_Sets_And_Maps;

import java.util.HashMap;

public class _20_LC2183CountArrayPairsDivisibleByK {
    class Solution {
        // helper function
        private int gcd(int a, int b) {
            return b == 0 ? a : gcd(b, a % b);
        }

        private int gccd(int a, int b){
            if(b == 0) return a;
            return gcd(b, a%b);
        }

        // main function
        public long countPairs(int[] nums, int k) {
            HashMap<Integer, Integer> map = new HashMap<>();
            long ans = 0;
            for (int num : nums) {
                int g = gcd(num, k);
                for (int g2 : map.keySet()) {
                    if ((1L * g * g2) % k == 0)
                        ans += map.get(g2);
                }
                map.put(g, map.getOrDefault(g, 0) + 1);
            }
            return ans;
        }
    }
}
