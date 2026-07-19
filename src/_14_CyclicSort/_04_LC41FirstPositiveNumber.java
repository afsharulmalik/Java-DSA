package _14_CyclicSort;

public class _04_LC41FirstPositiveNumber {
    public int firstMissingPositive(int[] nums) {
        int i =0;
        int n = nums.length;
        while (i<n){
            int correctIdx = nums[i] - 1;
            // positive, not repeating, less than array size
            if(nums[i]>0 && nums[i] <= n && nums[i]!=nums[correctIdx]){  // this is the correct order for putting condition
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = temp;
            }else{
                i++;
            }
        }
        // we take
        for(int j=0; j<n; j++){
            if(nums[j] != j+1) return j+1;  // j+1 will compare the nums[j] to the next element in the array
        }
        return n+1;
    }
    public static void main(String[] args) {

    }
}
