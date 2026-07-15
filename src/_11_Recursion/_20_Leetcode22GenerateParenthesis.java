package _11_Recursion;

import java.util.*;
public class _20_Leetcode22GenerateParenthesis {
    public static void main(String[] args) {
        class Solution {
            // this is helper function
            public void generate(int n, int left, int right, String s, List<String> ans){
                // base case
                if(right==n){
                    ans.add(s);
                    return;
                }
                if(left < n ) generate(n, left+1, right, s+"(", ans);
                if(right<left) generate(n, left, right+1, s+")", ans);
            }
            public List<String> generateParenthesis(int n) {
                List<String> ans = new ArrayList<>();
                generate(n,0,0,"",ans);  //n left right string answerWalaList
                return ans;
            }
        }
    }
}
