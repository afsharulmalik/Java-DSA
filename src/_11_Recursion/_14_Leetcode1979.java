package _11_Recursion;

public class _14_Leetcode1979 {
    class Solution {
        // ye function maine khud se bnaya hai
        public static int gcd(int a, int b){
            if(b==0) return a;
            else return gcd(b,a%b);
        }
        // ye wala function phle se banaa huaa tha yahaa par
        public int findGCD(int[] nums) {
            int min = nums[0];
            int max = nums[0];
            for(int i=1; i<nums.length; i++){
                if(nums[i]>max){
                    max = nums[i];
                }
                if(nums[i]<min){
                    min = nums[i];
                }
            }
            return gcd(min,max);
        }
    }
}
