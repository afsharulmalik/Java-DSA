package _24_DynamicProgramming;

import java.util.Arrays;

public class _31_GFGLongestBitonicSubsequence {
    class Solution {
        public static int longestBitonicSequence(int n, int[] nums) {
            // lis and lds -1
            // longest increasing subsequence and decreasing
            int[] lis = new int[n];
            int[] lds = new int[n];
            Arrays.fill(lis,1);
            Arrays.fill(lds,1);
            // Lis
            for(int i=0; i<n;i++){
                for(int j=0; j<i; j++){
                    if(nums[j]<nums[i]){
                        lis[i] = Math.max(lis[i],lis[j]+1);
                    }
                }
            }
            // lds
            for(int i=n-1; i>=0;i--){
                for(int j=i+1; j<n; j++){
                    if(nums[j]<nums[i]){
                        lds[i] = Math.max(lds[i],lds[j]+1);
                    }
                }
            }
            // combine karenge ab
//            int ans = 0;
//            for(int i=0; i<n; i++){
//                ans = Math.max(ans,lis[i]+lds[i]-1);
//            }
//            return ans;

            int ans = 0;
            for(int i = 0; i < n; i++) {
                if(lis[i] > 1 && lds[i] > 1) {
                    ans = Math.max(ans, lis[i] + lds[i] - 1);
                }
            }
            return ans;
        }
    }
}
