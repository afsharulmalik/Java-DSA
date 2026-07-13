package _12_BinarySearch;

public class _09_leetcode33 {
    class Solution {
        public int search(int[] nums, int target) {
            int low = 0;
            int n = nums.length;
            int high = n-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(nums[mid]==target) return mid;


                if(nums[low]<=nums[mid]){  // if left side is sorted
                    if(nums[low]<=target && target<nums[mid]) high = mid-1;
                    else low = mid+1;
                }else{  // if right side is sorted
                    if(nums[mid]<target && target<=nums[high]) low = mid+1;
                    else high = mid-1;
                }
            }
            return -1;
        }
    }
}
