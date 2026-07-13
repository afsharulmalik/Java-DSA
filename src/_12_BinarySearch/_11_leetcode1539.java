package _12_BinarySearch;

public class _11_leetcode1539 {
    class Solution {
        public int findKthPositive(int[] arr, int k) {
            int low =0;
            int n = arr.length;
            int high = n-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                int missing = arr[mid]-(mid+1); // iss formula se array mein missing element niklega
                if(missing<k) low = mid+1;
                else high = mid-1;
            }
            return high+1+k;  // ya phir return low+k because low = high+1
        }
    }
}
