package _24_DynamicProgramming;

import java.util.*;

public class _32_LC368LargestDivisibleSubset {
    class Solution {
        public List<Integer> largestDivisibleSubset(int[] nums) {
            int n = nums.length;
            Arrays.sort(nums);
            int[] dp = new int[n];
            int[] parent = new int[n];
            Arrays.fill(dp, 1);
            for (int i = 0; i < n; i++) {
                parent[i] = i;  // coz hume sirf length nahi poora array return karna hai
                for (int j = 0; j < i; j++) {
                    if (nums[i] % nums[j] == 0 &&
                            dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                        parent[i] = j;  // ye uss index ko store kar lega jo hume return karna hai
                    }
                }
            }

            // Find index of maximum subset
            int maxLen = 0;
            int lastIndex = 0;
            for (int i = 0; i < n; i++) {
                if (dp[i] > maxLen) {
                    maxLen = dp[i];
                    lastIndex = i;
                }
            }

            // Construct answer
            List<Integer> ans = new ArrayList<>();
            while (parent[lastIndex] != lastIndex) {
                ans.add(nums[lastIndex]);
                lastIndex = parent[lastIndex];
            }
            ans.add(nums[lastIndex]);
            Collections.reverse(ans);
            return ans;
        }
    }
}
