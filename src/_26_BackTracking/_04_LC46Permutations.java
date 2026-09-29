package _26_BackTracking;
import java.util.*;
public class _04_LC46Permutations {
    class Solution {
        private void permutations(int[] nums, boolean[] check, List<Integer> a, List<List<Integer>> ans) {
            int n = nums.length;
            if(a.size()==n){
                List<Integer> copy = new ArrayList<>(a); // deep copy
                ans.add(copy);
                return;
            }
            for(int i=0; i<n; i++){
                if(!check[i]){
                    a.add(nums[i]);
                    check[i]=true;
                    permutations(nums,check,a,ans);
                    a.remove(a.size()-1);
                    check[i]=false;
                }
            }
        }
        // main function
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> a = new ArrayList<>();
            boolean[] check = new boolean[nums.length];
            permutations(nums,check,a,ans);
            return ans;
        }
    }
}
