package _25_BinarySearchOnAnswer;

public class _01_LC1011CapacityToShipPackagesWithinDDays {
    class Solution {
        private int helper(int capacity, int[] weights) {
            int days = 1;
            int current = 0;
            for(int ele : weights) {
                if(current + ele <= capacity) {
                    current += ele;
                } else {
                    days++;
                    current = ele;
                }
            }
            return days;
        }
//        private int helper(int capacity, int[] weights) {
//            int days = 0;
//            int c = capacity;
//            for(int ele : weights){
//                if(c >= ele) c -= ele;
//                else{
//                    days++;
//                    c = capacity - ele;
//                }
//            }
//            days++;
//            return days;
//        }
        public int shipWithinDays(int[] weights, int days) {
            // 1 2 3 4 5 6 7 8 9 10
            int max = Integer.MIN_VALUE;
            int sum = 0;
            for(int ele : weights){
                max = Math.max(max,ele);
                sum+=ele;
            }
            int low = max; // atleast max jitna toh chaiye hi capacity
            int high = sum; // ek din mein jaana hai toh sum jitna capacity chaiye
            int ans = sum; // worst case mein sum jitna toh answer hoga hi
            while(low<=high){
                int mid = low + (high-low)/2;
                if(helper(mid, weights) <= days){
                    high = mid - 1;
                    ans = mid;
                }else {
                    low = mid+1;
                }
            }
            return ans;
        }
    }
}
