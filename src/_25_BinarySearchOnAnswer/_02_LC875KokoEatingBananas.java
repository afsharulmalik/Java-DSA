package _25_BinarySearchOnAnswer;


public class _02_LC875KokoEatingBananas {
//    class Solution {
//        private int helper(int speed, int[] piles) {
//            int hours = 0;
//            for(int ele : piles){
//                if(ele%speed==0) hours += ele/speed;
//                else hours += (ele/speed) +1;
//            }
//            return hours;
//        }
//        public int minEatingSpeed(int[] piles, int h) {
//            int max = Integer.MIN_VALUE;
//            for(int ele : piles){
//                max = Math.max(ele,max);
//            }
//            int low = 1;
//            int high = max;
//            int ans = max;
//            while(low<=high){
//                int mid = low+(high-low)/2;
//                if(helper(mid,piles)<=h){
//                    high = mid -1;
//                    ans = mid;
//                }else {
//                    low = mid+1;
//                }
//            }
//            return ans;
//        }
//    }

    class Solution {
        public int minEatingSpeed(int[] piles, int h) {
            int low = 1;
            int high = 0;
            for (int pile : piles) {
                high = Math.max(high, pile);
            }
            while (low <= high) {
                int mid = low + (high - low) / 2;
                long hours = 0;
                for (int ele : piles) {
                    hours += (ele + mid - 1) / mid;
                }
                if (hours <= h) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
    }
}
