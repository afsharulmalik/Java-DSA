package _11_Recursion;

public class _22_MergeSort {
    public static void main(String[] args) {
        int[] arr = {5,2,8,4,1,6,7,3};
        mergeSort(arr);
        for(int ele : arr) System.out.print(ele+" ");
    }

    private static void mergeSort(int[] arr) {
        int n = arr.length;
        if(n==1) return;
        // 1. Create 2 new empty arrays of size n/2 each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        // 2. copy paste into a and b
        int idx =0;
        for(int i=0; i<a.length; i++){
            a[i] = arr[idx++];
        }
        for(int i=0; i<b.length; i++){
            b[i] = arr[idx++];
        }
        // 3. Apply magic on a & b
        mergeSort(a);
        mergeSort(b);
        // 4. Merge a & b into arr
        merge(a,b,arr);
    }

    private static void merge(int[] a, int[] b, int[] arr) {
        int i=0, j=0, k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) arr[k++] = a[i++];
            else arr[k++] = b[j++];
        }
        while(i<a.length) arr[k++] = a[i++];
        while (j<b.length) arr[k++] = b[j++];
    }
}




// leetcode style

class Solution {

    public int[] sortArray(int[] nums) {
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void mergeSort(int[] nums, int low, int high) {

        if (low >= high)
            return;

        int mid = low + (high - low) / 2;

        mergeSort(nums, low, mid);

        mergeSort(nums, mid + 1, high);

        merge(nums, low, mid, high);
    }

    private void merge(int[] nums, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;
        int index = 0;

        while (left <= mid && right <= high) {

            if (nums[left] <= nums[right]) {
                temp[index++] = nums[left++];
            } else {
                temp[index++] = nums[right++];
            }
        }

        while (left <= mid) {
            temp[index++] = nums[left++];
        }

        while (right <= high) {
            temp[index++] = nums[right++];
        }

        for (int i = low; i <= high; i++) {
            nums[i] = temp[i - low];
        }
    }
}