package _25_BinarySearchOnAnswer;

public class _03_LC1283SmallestDivisor {
    class Solution {
        public int smallestDivisor(int[] nums, int threshold) {
            int low = 1;
            int high = 0;
            for(int num : nums){
                high = Math.max(num,high);
            }
            while(low<=high){
                int mid = low + (high-low)/2;
                long div = 0;
                for(int ele : nums){
                    div += (ele + mid -1)/mid;
                }
                if(div <= threshold) high = mid -1;
                else low = mid + 1;
            }
            return low;
        }
    }
}
