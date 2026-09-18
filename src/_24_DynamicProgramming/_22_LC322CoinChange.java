package _24_DynamicProgramming;

public class _22_LC322CoinChange {
    class RecursiveSolution {
        private int helper(int idx, int amount, int[] coins) {
            if(idx==coins.length){
                if(amount==0) return 0; // valid ans
                else return Integer.MAX_VALUE;
            }
            int skip = helper(idx+1,amount,coins);
            if(amount<coins[idx]) return skip;
            int take = helper(idx, amount-coins[idx],coins);
            int pick = (take==Integer.MAX_VALUE)?take:take+1; // for overflow error
            return Math.min(pick,skip);
        }
        public int coinChange(int[] coins, int amount) {
            int n = coins.length;
            int ans = helper(0,amount,coins);
            return (ans!=Integer.MAX_VALUE)?ans:-1;
        }
    }


    // using dp
    class Solution {
        private int helper(int idx, int amount, int[] coins, int[][] dp){
            if(idx==coins.length){
                if(amount==0) return 0; // valid ans
                else return Integer.MAX_VALUE;
            }
            if(dp[idx][amount]!=0) return dp[idx][amount];
            int skip = helper(idx+1,amount,coins,dp);
            if(amount<coins[idx]) return dp[idx][amount] = skip;
            int take = helper(idx, amount-coins[idx],coins,dp);
            int pick = (take==Integer.MAX_VALUE)?take:take+1; // for overflow error
            return dp[idx][amount] = Math.min(pick,skip);
        }
        public int coinChange(int[] coins, int amount){
            int[][] dp = new int[coins.length][amount+1];
            return helper(0,amount, coins, dp);
        }
    }
}
