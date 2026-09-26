package _25_BinarySearchOnAnswer;

import java.util.Arrays;

public class _04_GFGAggressiveCows {
    class Solution {
        private boolean helper(int[] arr, int k, int dist) {
            int count = 1;
            int last = arr[0];
            for(int i=1; i<arr.length; i++){
                if(arr[i]-last>=dist){
                    count++;
                    last = arr[i];
                }
                if(count==k){
                    return true;
                }
            }
            return false;
        }
        public int aggressiveCows(int[] arr, int k) {
            Arrays.sort(arr);
            int n = arr.length;
            int low = 1;
            int high = arr[n-1]-arr[0];
            int ans = 0;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(helper(arr,k,mid)){
                    ans = mid;
                    low = mid+1;
                }else{
                    high=mid-1;
                }
            }
            return ans;
        }
    }
}
